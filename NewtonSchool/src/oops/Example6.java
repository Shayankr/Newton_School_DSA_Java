package oops;

class Student6{
	int rollNo;
	String address;
	//String schoolName="st. xavier";
	static String schoolName="st. xavier";
	
	Student6(){
		
	}
	//this is called constructor "Overloading".
	
	Student6(int roll){
		rollNo = roll;
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student6 s1 = new Student6(2);
		Student6 s2 = new Student6();
		
		System.out.println(s1.rollNo);
		System.out.println(s2.schoolName);
		System.out.println(s2.rollNo); //by default 0.

	}

}
