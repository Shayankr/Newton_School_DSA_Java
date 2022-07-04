package searching_algo;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();  //length of the collection.
		int k = scn.nextInt(); //value to be checked in the collection.
		int[] arr = new int[n];
		//ArrayList<Integer> list = new ArrayList<Integer>(n);
		for(int i=0; i<n; i++) {
			arr[i]= scn.nextInt();
			//int input = sc.nextInt();
			//list.add(input); //adding  a  value to the list.
		}
		scn.close();
		
		int index=-1;
		for(int i=0; i<n; i++) {
			if(arr[i]==k) {
				System.out.print("Value is found at index: "+i);
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.print("Value is not found:");
		}
	}

}

//Time Complexity:
//Best case =O(1)
//Average Case = O(n)
//Worst case = O(n)

//Input:
//5
//3
//4
//5
//3
//6
//2

//Output:
//Value is found at index: 2
