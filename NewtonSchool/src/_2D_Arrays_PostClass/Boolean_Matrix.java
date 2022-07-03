package _2D_Arrays_PostClass;

//Problem Statement
//You are given a matrix Mat of m rows and n columns. 
//The matrix is boolean so the elements of the matrix can only be either 0 or 1.
//Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. 
//After doing the mentioned operation, you need to print the modified matrix.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Boolean_Matrix {
	
	static int MAX = 1000;
	static int a[][] = new int[MAX][MAX];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String str[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			boolean b[] = new boolean[n];
			for(int i=0;i<n;i++){
				str = br.readLine().trim().split(" ");
				for(int j=0;j<m;j++){
					a[i][j] = Integer.parseInt(str[j]);
					if(a[i][j]==1){
						b[i]=true;
					}
				}
			}
			for(int i = 0; i < n; i++){
				if(b[i]){
					for(int j = 0; j < m; j++){
						System.out.print("1 ");
					}
				}
				else{
					for(int j = 0; j < m; j++){
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		}

	}

}
