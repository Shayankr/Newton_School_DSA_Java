package list;

//ArrayList is -- dynamic size, add extra element, remove element, size not limited
// ArrayList <Integer> <name> = new ArrayList <Integer> (Initial_Size);

//list.ensureCapacity(size);

import java.util.*;

public class ArrayList1 {
	
	static void printList(ArrayList<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList <Integer> ();
		// by default initial size is 10.
		System.out.println(l1.size());
		// size()--gives logical length.
		
		l1.add(3);
		l1.add(4);
		//list.add(index, value); //add value at a particular index.
		l1.add(1,5);
		
		System.out.println(l1.size());
		
		//get
		int a = l1.get(0); //accessing element by index.
		System.out.println(a); 
		
		//call printList
		printList(l1);
		
		l1.set(1, 7); //update value at particular index.
		printList(l1);
		
		//remove
		l1.remove(0); //remove by index no.
		printList(l1);
		
		//add
		l1.add(0);
		printList(l1); //add element in last.
		
		//add(index, value)
		l1.add(0, 10); //add element at particular index
		printList(l1);
		//
		//remove(by object)
		l1.remove((Integer)(0)); //remove zero(0) by object. 
		//It will no longer be considered as an index.
		printList(l1);
		//

		//get index of
		System.out.println(l1.indexOf(7));
		System.out.println(l1.indexOf(100)); //"-1" if element is not present.
	}
}
