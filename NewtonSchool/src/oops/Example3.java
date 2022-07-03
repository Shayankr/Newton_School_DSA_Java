package oops;

class Student2{
	int rollNo;
	String address;
	String schoolName="st. xavier";
	
	Student2(int roll, String add){
		rollNo = roll;
		address = add;
	}
	
	void changeSchool(String name) {
		schoolName = name;
	}
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s1 = new Student2(1,"add123");
		Student2 s2 = new Student2(2,"add234");
		Student2 s3 = new Student2(3, "add456");
		//
		s1.changeSchool("st. John");
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);

	}

}
