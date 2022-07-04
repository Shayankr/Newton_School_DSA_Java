package linearSearch_InClass;

//Q.)Find Positions of X in array
//Given an integer array arr[] of size N and an element X. 
//The task is to find and print the indices of the given element if it is present in array 
//if not then print “Not found” without quotes.

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class FindX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Your code here
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt(); //no. of test cases

		//apply while loop to perform operation for all test cases. 
		while(t-->0){
			int n = scn.nextInt(); // length of arrat
			int x = scn.nextInt(); //value which is to find
			//Input array
			int[] arr = new int[n];
			for(int i=0; i<n; i++){
				arr[i]=scn.nextInt();
			}
			//traverse through array to find an element
			int index=-1;
			for(int i=0; i<n; i++){
				if(arr[i]==x){
					System.out.print(i+" ");
					index=i;
					//break;
				}
			}

			if(index==-1){
				System.out.println("Not found");
			}else{
				System.out.println();
			}
		}
		scn.close();//close Scanner object.
	}

}


//Input
//2
//5 6
//2 3 6 5 6
//4 3
//2 4 6 5

//Output
//2 4
//Not found
//.