package array;
import java.util.*;

public class CyclicPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//Scanner sc = new Scanner(System.in);
		
		/*int s = sc.nextInt();
		int[] S = new int[s];
		for(int i=0; i<s; i++){
			S[i] = sc.nextInt();
		}
		//2nd array input
		int c = sc.nextInt();
		int[] C = new int[s];
		for(int i=0; i<c; i++){
			C[i] = sc.nextInt();
		}*/
		//
		int[] S = {1,2,3,1,2,4,1,2,3};
		int[] C = {1,2,3};
		int[] curr = new int[C.length*2];
		
//		int k=0, count=0;
//		for(int i=0; i<S.length-C.length+1; i++) {
//			k=0;
//			for(int j=i; j<i+C.length; j++) {
//				curr[k] = S[j];
//			}
//		}
		printSubArrays(S);
		}
	private static void printSubArrays(int[] C){
		for(int i=0; i<C.length-2; i++) {
			for(int j=i; j<=i+2; j++) {
				System.out.print(C[i]+" ");
			}
			System.out.println();
		}
	}
}
