package linear_binarySearch_PostClass;

//Problem Statement
//Searching an element in a sorted array
//Given a sorted array arr[] of N integers and a number K is given. 
//The task is to check if the element K is present in the array or not.

public class Search_SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given array is:
		long[] arr = {1,3,5,8,11,19,50,100,200};
		int len = arr.length;
		//element which is to find
		long k=50;
		System.out.print(isPresent(arr,len,k));
	}
	//
	static int isPresent(long arr[], int n, long k)
	{
		    // Your code here
		int low=0, high=n-1;
		while(low<high){
			if(arr[low]==k){
				return 1;
			}
			if(arr[high]==k){
				return 1;
			}
			int mid = low+(high-low)/2;
			if (arr[mid]==k){
				return 1;
			}else if(arr[mid]>k){
				high = mid-1;
			}else{
				low=mid+1;
			}
			mid = low+(high-low)/2;
		}
		return -1;
	}

}


//Output:
//1
//It means value=50 is present in the given array.