package linear_binarySearch_PostClass;

//Problem Statement
//Given two sorted arrays A and B of size n and m respectively, 
//return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n))

//Input
//First line of input contains n, m the length of array A and B.
//Next two lines contains input of array A and B.

//Constraints
//1 <= n, m <= 1000
//-1e6 <= A[i], B[i] <= 1e6

//Output
//Print the median of two sorted arrays upto two decimal places.



//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class MedianSortedArray {
	
	//at first we need to do merge sort then find Median.
	
    public static void main (String[] args) {
    	// TODO Auto-generated method stub
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }
        for(int i=0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();
        //merge both array and find resultant array.
        int[] res = merge(arr1, n1, arr2, n2);
        int mid = (n1+n2)/2;
        if((n1+n2)%2==0){
            double r =(double) (res[mid-1]+res[mid])/2;
            System.out.printf("%.2f",r);
        }else{
            System.out.printf("%.2f",(double)res[mid]);
        }
    }
    //find merge sort of two sorted array.
    static int[] merge(int[] arr,int n1, int[] brr, int n2){
        int[] res = new int[n1+n2];
        int i=0, j=0, p=0;
        while(i<n1 && j<n2){
            if(arr[i]>brr[j]){
                res[p]=brr[j];
                j++;
                p++;
            }else{
                res[p]=arr[i];
                i++;
                p++;
            }
        }
        if(i<n1){
            for(int k=i; k<n1; k++){
                res[p]=arr[k];
                p++;
            }
        }
        if(j<n2){
            for(int k=j; k<n2; k++){
                res[p]=brr[k];
                p++;
            }
        }
        return res;
    }
}

//
//Example
//Sample Input :
//2 1
//1 3
//2
//
//Sample Output :
//2.00