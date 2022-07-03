package hashing1;

import java.util.*;

public class LinkedHMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<>();  //ordered
		
		lhmap.put("Oman", "Muscat");
		lhmap.put("India", "Delhi");
		lhmap.put("Russia", "Moscow");
		lhmap.put("Japan", "Tokyo");
		lhmap.put(null, "Tokyo"); // one NULL key is allowed.
		lhmap.put(null, "Canberra"); //previous NULL-> Tokyo ignored.
		
		lhmap.put(null, null);
		
		lhmap.put("Maldives", null); //You can store more than 1 NULL values.
		
		System.out.println(lhmap);
		
		System.out.println("Size of the Map is: "+lhmap.size());
		
		System.out.println("Value for key Oman is: "+lhmap.get("Oman"));
		
		System.out.println("Does it have Russia key?: "+lhmap.containsKey("Russia"));
		
		System.out.println("Does it have Tokyo value?: "+lhmap.containsValue("Tokyo"));
		
		System.out.println("Deleting element Oman: "+lhmap.remove("Oman"));
		
		System.out.println("Mapped Linkedhash Map: \n"+lhmap);
	}

}
