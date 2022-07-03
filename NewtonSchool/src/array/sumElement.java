package array;
import java.util.*;

public class sumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		//value of sum
		int sum = scn.nextInt();
		scn.close();
		//
		for(int i=0; i<n-1; i++) {
			int diff = sum-arr[i];
			for(int j=i+1; j<n; j++) {
				if (diff == arr[j]) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}
