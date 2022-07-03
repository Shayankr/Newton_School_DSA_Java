package _2D_Arrays_InClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Transpose {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] arr = new int[N][N];
		int[][] b = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//
		/*for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(i == j){
					b[i][j]=arr[i][j];
				}else{
					b[i][j] =  arr[j][i];
				}
			}
		}
		//
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}*/
		//
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}