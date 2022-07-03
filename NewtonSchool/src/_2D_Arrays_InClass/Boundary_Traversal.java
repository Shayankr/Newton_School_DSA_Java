package _2D_Arrays_InClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Boundary_Traversal {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T>0){
			int row = sc.nextInt();
			int col = sc.nextInt();

			int[][] arr = new int[row][col];
			for(int i=0; i<row; i++){
				for(int j=0; j<col; j++){
					arr[i][j] = sc.nextInt();
				}
			}

			for(int j=0;j<col;j++){
				System.out.print(arr[0][j]+" ");
			}
			if(row>1 ){
			for(int i=1; i<row; i++){
				System.out.print(arr[i][col-1]+" ");
			}
			}
			if(row>1 && col>1){
			for(int j=col-2; j>=0; j--){
				System.out.print(arr[row-1][j]+" ");
			}
			}
			if(row>2 && col>1){
			for(int i=row-2; i>0; i--){
				System.out.print(arr[i][0]+" ");
			}
			}
			System.out.println();

			T--;
		}
	}
}