package _2D_Arrays_InClass;

//Print the sum of primary and secondary diagonal separated by a space.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public  class Diagonal_Sum {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int [][] arr = new int [N][N];
		int sum_p=0; //
		int sum_s=0; //
		for (int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = sc.nextInt();
				//find sum of primary diagonla elements
				if(i==j){
					sum_p += arr[i][j];
				}
				//find sum of secondary diagonal elemets
				if((i+j)==(N-1)){
					sum_s += arr[i][j];
				}
			}
		}	
		//print the output
		System.out.print(sum_p+" "+sum_s);
	}
}