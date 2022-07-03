package hashing1;

import java.util.LinkedHashSet;

public class LinkedHSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> lhset = new LinkedHashSet<>();  //maintain insertion order.
		
		lhset.add("AAA");
		lhset.add("BBB");
		lhset.add("CCC");
		lhset.add("DDD");
		
		//add same content
		lhset.add("AAA");  //no duplicate valu is allowed.[considered once].
		lhset.add(null);  //considered once.
		
		LinkedHashSet <String> lhset2 = new LinkedHashSet<>();
		lhset2.add("AAA");  
		lhset2.add(null);
		
		System.out.println("LinkedHash Set conatins: "+lhset);
		System.out.println("LinkedHash Set-2 conatins: "+lhset2);
		
		System.out.println("Size of LinkedHashSet is: "+lhset.size());
		
		System.out.println("Check if CCC is present: "+lhset.contains("CCC"));
		
		System.out.println("Remove DDD from LinkedHashSet: "+lhset.remove("DDD"));
		
		System.out.println("latest valued LinkedHashSet is: "+lhset);
	}

}
