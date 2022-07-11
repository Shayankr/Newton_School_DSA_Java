package math_geometry_bit_InClass;

//Q.)Problem Statement
//Given an array of N integers, your task is to calculate the sum of bit difference in all pairs 
//which can be formed.
import java.io.*;

public class BitDifference {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//
        String str[] = br.readLine().trim().split(" ");
        int xor, sum=0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(str[i]);
            for(int j=0; j<=i; j++){
                xor = arr[i]^arr[j];
                sum += Integer.bitCount(xor);
            }
		}
		//
        System.out.println(2*sum);
	}
}
//

//Input
//The first line of input contains a single integer N, the second line of input contains N space separated integers depicting values of the array.
//
//Constraints:-
//1 <= N <= 100000
//0 <= Arr[i] <= 1000000000
//Output
//Print the sum of bit difference of all possible pairs.
//
//Note:- Since the answer can be quite large print your answer modulo 109 + 7
//Example
//Sample Input:-
//2
//1 3
//
//Sample Output:-
//2
//
//Explanation:-
//(1, 1) = 0
//(1, 3) = 1
//(3, 1) = 1
//(3, 3) = 0
//
//Sample Input:-
//2
//1 2
//
//Sample Output:-
//4