package math_geometry_bit_InClass;

//Q.) Problem Statement
//Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. 
//Report the minimum XOR value.

//
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class MinimizeXOR {
	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
                      // Your code here
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//enter values in array
		int min = Integer.MAX_VALUE;
		int[] arr = new int[n];
		String str[] = br.readLine().trim().split(" ");
		for(int i=0; i<n; i++){
			
			arr[i] = Integer.parseInt(str[i]);
			// for(int j=0; j<i; j++){
				
			// 	min = Math.min(min,arr[i]^arr[j]);
				
			//}
		}
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			int ans = arr[i]^arr[i+1];
			min = Math.min(min, ans);
		}
		
		System.out.println(min);
	}
}


//
//Input
//First line denotes N, the size of the array.
//Next line denotes N space-separated array elements.

//Constraints:
//2 <= N <= 100000
//0 <= A[i] <= 10^7

//Output
//Print a single integer denoting minimum xor value
//Example
//Sample Input
//4
//0 2 5 7

//Sample Output
//2

//Explanation:
//0 xor 2 = 2

//Sample Input
//4
//0 4 7 9

//Sample Output
//3