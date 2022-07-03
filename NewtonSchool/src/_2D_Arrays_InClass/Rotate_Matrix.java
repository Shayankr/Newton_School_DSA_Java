package _2D_Arrays_InClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Rotate_Matrix {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int [][] arr = new int[N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		//
		// displayMatrix(mat);
        rotate90(arr);
        printMatrix(arr);
        System.out.println();
        //
        rotate90(arr);
        printMatrix(arr);
 
	}
	//
	static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1; j < k;
                 j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }
    //
    // Function for do transpose of matrix
    static void transpose(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
    }
    //
    // Function for print matrix
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
    //
    static void rotate90(int arr[][])
    {
        reverseColumns(arr);
        transpose(arr);
        //reverseColumns(arr);
    }
}