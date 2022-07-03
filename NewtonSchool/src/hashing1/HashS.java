package hashing1;

import java.util.*;

public class HashS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hset = new HashSet<>(); //contains no duplicate values.
		HashSet <String> hset1 = new HashSet<>(); 
		
		
		hset.add("Italy");  //add method to insert values to a hashset.
		hset.add("Cuba");
		hset.add("Russia");
		hset.add("Maldives");
		hset.add("Maldives"); //Duplicate Value
		hset.add(null); //null value also exist.[considered but not duplicate value].
		//hset.add(null);
		
		System.out.println(hset);  //unorderd
		
		hset1.add("USA"); //different instance created.
		
		System.out.println(hset1);
		
		hset.remove("Cuba");
		
		System.out.println("List after removing Cuba: "+hset);
		System.out.println("Is Italy present? :"+hset.contains("Italy"));
		
		System.out.println("Iterating over list: ");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
