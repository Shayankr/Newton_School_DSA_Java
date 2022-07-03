package array;
import java.util.*;

//Q.) Find only distinct element

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,1,4,1,7,2,4,3};
		
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i: arr) {
			hset.add(i);
		}
		System.out.println(hset);
		
		//check whether an element is present or not.
		System.out.println(hset.contains(4));
		
		//remove element
		hset.remove(4);
		System.out.println(hset);
		//print
		for(int i: hset) {
			System.out.println(i);
		}
		
		//check length/size
		System.out.println("size of hset is: "+hset.size());

		//iterator
		Iterator<Integer> i = hset.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
	}

}
