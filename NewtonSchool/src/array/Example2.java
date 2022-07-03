package array;

import java.util.Arrays;

//Q.)Counting frequencies of array elements

public class Example2 {
	
	//define function/method
	static void findFreq(int[]arr, int n) {
		boolean [] brr = new boolean[n];
		
		Arrays.fill(brr, false);
		//traverse through arrays and fill it true if occurse first-time.
		for(int i=0; i<n; i++) {
			if (brr[i] == true) {
				continue;
			}
			int count=1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					brr[j]=true;
					count ++;
				}
			}
			//
			System.out.println(arr[i]+" "+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
	    int n = arr.length;
	    
	    findFreq(arr, n);

	}

}
