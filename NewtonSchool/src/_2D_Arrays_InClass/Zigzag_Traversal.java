package _2D_Arrays_InClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public  class Zigzag_Traversal {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		int [][]arr = new int[M][N];
		for(int i=0; i<M; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//output
		//int k;
		for(int k=0; k<M; k++){
			int i=k;
			for(int j=0; j<=k && j<N; j++){
				System.out.print(arr[i][j]+" ");
				i--;
			}
			System.out.println();
		}
		//now start from last row
		for(int l=1; l<N; l++){
			int j=l;
			for(int i=M-1; i>=0; i--){
				if(j<N){
					System.out.print(arr[i][j]+" ");
				}
				j++;
			}
			System.out.println();
		}
		
	}
}
