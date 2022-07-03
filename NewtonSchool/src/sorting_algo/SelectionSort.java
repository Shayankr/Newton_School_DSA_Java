package sorting_algo;

public class SelectionSort {
	
//at first assume 0th element to minimum and compare it to rest all the elements and 
//find minimum one.
// then replace if minimum is another to the first one.
//if first one is minimum then leave as it is.
	
//again compare 2nd element to all other and check minimum
//if another one is minimum then exchange the position, otherwise leave as it is.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,4,7,5,6,1}; //array may contains duplicate element.
		int k=0;
		for (int i=0; i<arr.length; i++) {
			//int k=0;
			int min = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					k=j;
				}
			}
			if(min-arr[i]>=0) {
				continue;
			}
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
		}
		//print final array
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
