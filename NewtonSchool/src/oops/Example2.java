package oops;

class Student1{
	int rollNo;
	String address;
	static String schoolName="st. xavier";
	
	//JVM internally construct a default constructor.
	//constructor of class
	Student1(int roll, String add){
		rollNo = roll;
		address = add;
		//schoolName = school;
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(1,"add123");
		Student1 s2 = new Student1(2,"add234");
		Student1 s3 = new Student1(3, "add456");
		
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		System.out.println(s3.schoolName);
		
		s1.schoolName = "st. john";
		//getting effected for every student object.
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		System.out.println(s3.schoolName);

	}

}
