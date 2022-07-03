package oops;

class Student5{
	int rollNo;
	String address;
	String schoolName="st. xavier";
	//static String schoolName="st. xavier";
	
	//JVM internally construct a default constructor. It works here.
	
	//constructor of class
//	Student(int roll, String add, String school){
//		rollNo = roll;
//		address = add;
//		schoolName = school;
//	}
}

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student5 s1 = new Student5();
		Student5 s2 = new Student5();
		Student5 s3 = new Student5();

		System.out.println(s1.schoolName);
	}

}
