package hashing1;

//import java.util.Hashtable;
//import java.util.Iterator;

import java.util.HashMap;


public class HashMExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> hmap1 = new HashMap <>();
		HashMap <String, Integer> hmap2 = new HashMap <>(hmap1);
		
		hmap1.put("John", 30000); //Add element to HasMap
		hmap1.put("Fredrick", 20000);
		hmap1.put("Mack", 25000);
		hmap1.put(null,27000); //one null value is allowed
		hmap1.put("Amy", 27000);
		
		System.out.println(hmap1); //unordered

		System.out.println("Size of HashMap hmap1 is: "+hmap1.size());
		
		hmap1.put("Amy", 36000); // update the salary of Amy.
		System.out.println("HMAP1 is: \n"+hmap1);
		
		System.out.println("HMAP2 is: \n");
		System.out.println(hmap2);
		
		if(hmap1.containsKey("Mack")) {
			Integer val = hmap1.get("Mack");
			System.out.println("Value for key Mack is: "+val);
		}
	}

}
