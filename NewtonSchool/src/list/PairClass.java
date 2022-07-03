package list;

//Pair--class
//getKey
//getValue
//p1.equals(p2) //compare and return boolean value as True/False.
//Pair p1 = new Pair(Key, Value); //this features includes in Java-8.

class Pair{
	String key;
	int value;
	
	Pair(String k, int v){
		key = k;
		value = v;
	}
	
	int getValue() {
		return value;
	}
	
	String getKey() {
		return key;
	}
	
	boolean equals(Pair p2) {
		return key == p2.key && value == p2.value;
	}
}

public class PairClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p1 = new Pair("Shayan",27);
		Pair p2 = new Pair("Sk",27);
		Pair p3 = new Pair("Sk",29);
		Pair p4 = new Pair("Sk",29);
		
		//
		System.out.println(p1.getKey()+" "+p1.getValue());
		
		System.out.println(p1.equals(p4));
		System.out.println(p3.equals(p4));
		

	}

}
