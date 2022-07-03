package hashing1;

import java.util.Hashtable;
import java.util.Iterator;

public class HashExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer, String> ht = new Hashtable<>();
		//insert some values into hashtable
		ht.put(1, "A");
		ht.put(2, "B");  //put()
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(4, "E");  // keys should be unique.
		ht.put(5, "E"); //Value can be repetitive
		
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		
		String val = ht.get(1); //key=1
		System.out.println(val);
		
		//remove
		ht.remove(2);
		
		System.out.println(ht.keySet());
		
		System.out.println(ht.keys());
		
		Iterator <Integer> itr = ht.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			String mapValue = ht.get(key);
			System.out.println("KEY: "+key+", VALUE: "+mapValue);
		}
	}
}
