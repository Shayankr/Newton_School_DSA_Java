package two_pointer_InClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MergeSort {
    public static void main (String[] args) {
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        //insert 1st array already sorted
        int[] arr1 = new int[N];
        for(int i=0; i<N; i++){
            arr1[i]=scn.nextInt();
        }
        //insert 2nd array alreday sorted
        int[] arr2 = new int[M];
        for(int i=0; i<M; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();
        //now perform some algo to solve problem
        //we need to merge two sorted array
        mergeSort(arr1, arr2);
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
			System.out.print(val+" ");
		}
	}
}

//Input:
//3 4
//1 4 7
//1 3 3 9

//Output:
//1 1 3 3 4 7 9

//Ecllipse input & output:
//3 4
//1 4 7
//1 3 3 9
//1 1 3 3 4 7 9 