package GCD_Primes_InClass;

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Divisors_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scn = new Scanner(System.in);

			int t = scn.nextInt();

			while(t > 0){
				int N = scn.nextInt();
				int count=0;
				
				for(int i=1; i<=Math.sqrt(N); i++){
					if(N%i ==0){
						int first=i;
						int second=N/i;

						if(first%2==0){
							count++;
						}
						if(second != first && second%2==0){
							count++;
						}
					}
				}
				
				System.out.println(count);
				t --;
			}
			scn.close();

	}

}
