package linear_binarySearch_PostClass;

//Problem Statement
//Given an integer K, find a positive integer x such that K = x2 + 3*x. 
//If no such positive integer x exists, print -1.


//
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class FindIt {
    public static void main (String[] args) {
    	// TODO Auto-generated method stub
                      // Your code here
        Scanner scn = new Scanner(System.in);
        long k = scn.nextLong();
        scn.close();
        boolean found=false;
        for(long i=0; i<=Math.sqrt(k); i++){
            if (i*i+3*i == k){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(found==false){
            System.out.println(-1);
        }
    }
}


//Input
//First and the only line of the input contains an integer K.
//
//Constraints:
//1 <= K <= 1018
//Output
//Print a positive integer x such that the above equation satisfies. 
//If no such integer x exists, print -1.
//

//Sample Input:
//28
//
//Sample Output:
//4
//
//Explaination:
//42 + 3*4 = 28
//There is no other positive integer that will give such result.