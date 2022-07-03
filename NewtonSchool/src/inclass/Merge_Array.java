package inclass;


public class Merge_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5};
		int[] brr = {2,6,10,12};
		int i=0, j=0, k=0;
		int[] res = new int[arr.length+brr.length];
		
		while(i<arr.length && j<brr.length) {
			if(arr[i] < brr[j]) {
				res[k] =arr[i];
				i++;
			}else {
				res[k] = brr[j];
				j++;
			}
			k++;
		}
		while(i<arr.length) {
			res[k]=arr[i];
			i++;
			k++;
		}
		while(j<brr.length) {
			res[k]=brr[j];
			j++;
			k++;
		}
		//
		for(int element: res) {
			System.out.print(element+" ");
		}

	}

}
