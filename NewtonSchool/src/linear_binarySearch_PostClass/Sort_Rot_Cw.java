package linear_binarySearch_PostClass;

//Problem Statement
//Given an array arr[] of N distinct integers, check if this array is Sorted and Rotated clockwise.
//A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

//Note:-Array can be sorted both increasingly and decreasingly

//Input
//The first line of input contains number of testcases T. 
//Each testcase contains 2 lines, the first line contains N, the number of elements in array, 
//and second line contains N space separated elements of array.

//Output
//Print "Yes" if the given array is sorted and rotated, else Print "No", without Inverted commas.



//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Sort_Rot_Cw {
    public static void main (String[] args) {
    	// TODO Auto-generated method stub
                      // Your code here
        Scanner scn = new Scanner(System.in);
        int t= scn.nextInt();
        while(t-- >0){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            //apply method
            if(incr_Sort_rot(arr)==true || desc_Sort_rot(arr)==true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        scn.close();
    }
    //find index of max value
    static int max_index(int[] arr){
        int max = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    //index of min value in an array
    static int min_index(int[] arr){
        int min=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    

    //check sorted in incr. order and cw rotated array
    static boolean incr_Sort_rot(int[] arr){
        int n = arr.length;
        
        if(arr[0]<arr[n-1]){
            return false;
        }
        int max_i = max_index(arr);
        int min_i = min_index(arr);
        
        if(!(max_i+1 == min_i)){
            return false;
        }
        for(int i=0; i<max_i; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        for(int i=min_i; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
        //
    }
    ////check sorted in desc. order and cw rotated array
    static boolean desc_Sort_rot(int[] arr){
        int n = arr.length;
        if(arr[0]>arr[n-1]){
            return false;
        }
        int max_i = max_index(arr);
        int min_i = min_index(arr);
        
        if(!(max_i==min_i+1)){
            return false;
        }
        for(int i=0; i<min_i; i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        for(int i=max_i; i<n-1; i++){
            if (arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
        //
    }
}

//Output
//2
//4
//3 4 1 2
//3
//1 3 2Yes
//
//Yes



//Example
//Sample Input:
//2
//4
//3 4 1 2
//3
//1 3 2
//
//Sample Output:
//Yes
//Yes
//
//Explanation:
//Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
//Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).