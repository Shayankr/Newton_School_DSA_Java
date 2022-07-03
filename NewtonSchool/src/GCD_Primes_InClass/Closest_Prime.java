package GCD_Primes_InClass;

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class Closest_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		if(input == 1){
			System.out.println(2);
			return;
		}

		if(isPrime(input)){
			System.out.println(input);
			return;
		}

		int leftP = 2;
		int i =0;
		//input = 45679
		while(true){
			int p = input-i;
			if(p < 3) break;
			if(isPrime(p)){
				leftP = p;
				break;
			}
			i++;
		}

		int rightP = input;
		i = 1;
		while(true){
			int next = input+i;
			if(isPrime(next)){
				rightP = next;
				break;
			}
			i++;
		}

		//leftP, rightP //45677
		//System.out.println("leftP = "+leftP);
		//System.out.println("rightP ="+rightP);

		int d1 = Math.abs(input-leftP);
		int d2 = Math.abs(input-rightP);

		if(d1 == d2){
			System.out.println(Math.min(leftP, rightP));
		}
		else if(d1<d2){
			System.out.println(leftP);
		}
		else{
			System.out.println(rightP);
		}

	}

	public static boolean isPrime(int n){
		int count = 0;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i == 0){
				count++;
			}
		}

		return count == 0;
	}

	

}
