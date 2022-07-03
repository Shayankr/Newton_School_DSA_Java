package GCD_Primes_InClass;

//Problem Statement
//You are given a number n. Your task is to print the number of prime numbers 
//before that number.

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Number_of_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t -- > 0){
			int n = scn.nextInt();
			int count=0;
			for(int i=2; i<=n; i++){
				if(isPrime(i)==true){
					count++;
				}
			}
			System.out.println(count);
		}
		scn.close();

	}
	//define method to check whether the no. is prime or not.
	static boolean isPrime(int m){
		for(int i=2; i<m; i++){
			if(m%i==0){
				return false;
			}
		}
		return true;
	}

}
