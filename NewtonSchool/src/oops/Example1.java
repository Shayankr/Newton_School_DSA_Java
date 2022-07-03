package oops;

class Student{
	int rollNo;
	String address;
	String schoolName;
	
	//JVM internally construct a default constructor.
	//constructor of class
	Student(int roll, String add, String school){
		rollNo = roll;
		address = add;
		schoolName = school;
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"add123","st. xavier");
		Student s2 = new Student(2,"add234","st. xavier");
		Student s3 = new Student(3, "add456","st. xavier");
		
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		System.out.println(s3.schoolName);

	}

}
