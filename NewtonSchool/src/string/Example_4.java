package string;

//ERROR

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc*def*ghi*jkl*mno";
		String[] arr = str.split("*");
		System.out.println("Length of actual string is: "+str.length());
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
