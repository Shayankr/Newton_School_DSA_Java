package array;

import java.util.Arrays;

//Check Pythagoras Triplet using at first sort the array.

//We can solve this in O(n2) time by sorting the array first. 

public class PythagorasTripletSort {
	
	//The time complexity of this method is O(n2).
	//Auxiliary Space: O(1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input array
		int arr[] = { 3, 1, 4, 6, 5 };
        int arr_size = arr.length;
        if (isTriplet(arr, arr_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");

	}
	//define a method/function
	static boolean isTriplet(int arr[], int n) {
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]*arr[i];
		}
		//sort
		Arrays.sort(arr);
		
		//apply algo to find triplet
		for(int i=n-1; i>=2; i--) {
			int l=0;
			int r=i-1;
			while(l<r) {
				if(arr[l]+arr[r]==arr[i]) {
					return true;
				}else if (arr[l]+arr[r]>arr[i]) {
					r--;
				}else {
					l++;
				}
			}
			
		}
		return false;
	}

}


//Output:
//Yes

//Rules to solve this problem:
//Method 2 (Use Sorting) 
//We can solve this in O(n2) time by sorting the array first. 
//1) Do the square of every element in the input array. This step takes O(n) time.
//2) Sort the squared array in increasing order. This step takes O(nLogn) time.
//3) To find a triplet (a, b, c) such that a2 = b2 + c2, do following. 
//
//Fix ‘a’ as the last element of the sorted array.
//Now search for pair (b, c) in subarray between the first element and ‘a’. A pair (b, c)
//with a given sum can be found in O(n) time using the meet in middle algorithm discussed in
//method 1 of this post.


//