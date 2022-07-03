package oops;

class Student4{
	int rollNo;
	String address;
	static String schoolName="st. xavier";
	
	Student4(int roll, String add){
		rollNo = roll;
		address = add;
	}
	
	static void changeSchool(String name) {
		schoolName = name;  //for this String schoolName should be "static".
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s1 = new Student4(1,"add123");
		Student4 s2 = new Student4(2,"add234");
		Student4 s3 = new Student4(3, "add456");
		//
		//s1.changeSchool("st. John");
		// now changeSchool is a method which is a property of class not of object.
		Student4.changeSchool("st. John");
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);

	}

}
