package _2D_Arrays_InClass;

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Determinant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		//sc.close();
		//print the output
		System.out.print(sum_p+" "+sum_s);

	}

}
