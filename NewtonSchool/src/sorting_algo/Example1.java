package sorting_algo;

//Q.) take 2 sorted array and find combined sorted array.

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,4,7,9,13};
		int[] brr = {2,8,16,18,20};
		
		// output will be: {1,2,4,7,8,9,13,16,18,20}
		mergeSort(arr,brr);

	}
	//define method to merge sorted array.
	static void mergeSort(int[]arr, int[] brr) {
		int n1 = arr.length;
		int n2 = brr.length;
		int[] res = new int[n1+n2];
		//step 1: use 2 pointer to initialize both array simultaneously.
		int i=0;
		int j=0;
		int p=0;
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
		//now print resultant array
		for(int val: res) {
			System.out.println(val);
		}
	}

}
