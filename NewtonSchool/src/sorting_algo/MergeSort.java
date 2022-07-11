package sorting_algo;

//Merge Sort is based on Divide and Conquer techniques.

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-1,5,11,48,2,5,30,12};
		
		printArray(arr);
		int[] ar = mergeSort(arr,0,arr.length-1);
		printArray(ar);

	}
	//
	static int[] mergeSort(int[]arr, int l, int r) {
		int mid = l+(r-l)/2;
		if(l<r) {
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			
			//merge the sorted halves
			merge(arr,l,mid,r);
		}
		//
		return arr;
	}
	//print array
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	//
	//define method to merge sorted array.
		static int[] merge(int[]array,int l, int mid, int r) {
			int n1 = mid-l+1;
			int n2 = r-mid;
			int[] arr = new int[n1];
			int[] brr = new int[n2];
			
			for(int k=0; k<n1; k++) {
				arr[k]=array[k+l];
			}
			
			for(int k=0; k<n2; k++) {
				brr[k]=array[mid+k+1];
			}
			
			int[] res = new int[n1+n2];
			//step 1: use 2 pointer to initialize both array simultaneously.
			int i=0;
			int j=0;
			int p=l;
			while(i<n1 && j<n2) {
				if(arr[i]<brr[j]) {
					res[p]=arr[i];
					p++;
					i++;
				}else {
					res[p]=brr[j];
					p++;
					j++;
				}
			}
			//fill rest values
			if(i<n1) {
				for(int k=i; k<n1; k++) {
					res[p]=arr[k];
					p++;
				}
			}
			if(j<n2) {
				for(int k=j; k<n2; k++) {
					res[p]=brr[k];
					p++;
				}
			}
			
			return res;
			//now print resultant array
//			for(int val: res) {
//				System.out.print(val+" ");
//			}
//			System.out.println();
		}

}
