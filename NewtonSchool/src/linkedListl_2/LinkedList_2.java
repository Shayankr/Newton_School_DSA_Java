package linkedListl_2;

//import linkedList.LinkedList;
//import linkedList.Node;

//Make a linked-list and perform all types of "Insertion" operation.
//Insert at End
//Insert at front
//Insert after a particular position (node number)

//Perform deletion operation of a particular value.
//delete head node
//delete value at head node if specified value present at head node.
//check value if not present in any node then return value is not found.
//delete last Node
//delete by position.

//update data value.

//check whether a specified value is present in the list or not.

//return middle valued data if no. of node is odd.

//return data, which is at "kth" Node from beginning and from ending.

//Merge two sorted linked-list.

class Node<T>{
	T data;
	Node next= null;
	
	Node(T v){
		data = v;
	}
}

class LinkedList<T>{
	Node head;
	int size=0;
	void insert(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next=newNode;
		}
		size ++;
	}
	
	void printList() {
		Node curr =head;
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(curr!= null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	//try to add element in front
	void insert_front(T val){
		Node firstnode = new Node(val);
		firstnode.next=head;
		head = firstnode;
		size++;
	}
	
	//add a node after a certain node
	// insert a unique data value, which is not already present
	void insert_between(int pos, T data) {
		//add after pos-3 --> means add after 2nd node.
		Node newNode = new Node(data);
		if(pos>size) { //check position is not graeter than list-size.
			return;
		}
		Node curr = head;
		while(pos-->1) {
			//System.out.print(curr.data);
			curr = curr.next;
		}
//		Node temp;
//		temp = curr.next;
//		Node temp = curr.next;
//		curr.next =newNode;
//		newNode.next = temp;
		
		newNode.next = curr.next;
		curr.next = newNode;
		
		//increase size
		size++;
	}
	
	//delete a particular node
	////Q.) Check which node consists a particular data value, then delete that node.
	void delete_value(T value) {
		
		//if value occurs at head node
		if(head==null) {
			//System.out.println("List is NULL (Empty).");
			return;
		}
		if (head.data == value) {
			head = head.next;
			size--;
			System.out.println("Value: "+value+" is found at head node, so head node is deleted.");
			System.out.println("Now size of list becomes: "+size);
			return;
		}
		Node prev = head;
		Node curr = head.next;
		int step=1;
		while(step < size) {
			//
			if (curr.data == value) {
				//if value occurs at head node
				//already handled above.
				System.out.println("Value: "+value+" is found at node= "+(step+1));
				//perform delete operation on that "curr" node
				prev.next = curr.next;
				size--;
				System.out.println("Now size of list becomes: "+size);
				return;
			}else {
				//keep tracking
				step++;
				prev=curr;
				curr= curr.next;		
			}
		}
		if(step == size) {
			System.out.println("Value: "+value+" is not found.");
			return;
		}
		
	}
	
	//delete head node
	void deleteHead() {
		if (head == null) {
			return;
		}else {
			head = head.next;
		}
		size--;
	}
	//delete a particular node having specified value
	void deleteNode(T value) {
		if (head.data == value) {
			deleteHead();
			size--;
		}else {
			Node curr = head;
			while(curr.next != null && curr.next.data != value) {
				curr = curr.next;
			}
			if(curr.next != null) {
				curr.next = curr.next.next;
				size--;
			}
			if (curr.next ==null) {
				System.out.println("Value not found.");
				size += 0;
			}
		}
	}
	
	//delete last node
	void deleteLast() {
		if (head == null) {
			return;
		}else if(head.next == null){
			head = null;
		}else{
			Node curr=head;
			while(curr.next.next != null) {
				curr = curr.next;
			}
			curr.next = null;
		}
		size--;
	}
	
	//delete by position
	void deleteByPos(int pos) {
		if (pos ==1) {
			deleteHead();
			size--;
			return;
		}
		if (head==null) {
			return;
		}else {
			Node curr = head;
			while(pos-->2 && curr != null) {
				curr = curr.next;
			}
			if(curr !=null && curr.next!= null) {
				curr.next = curr.next.next;
				size--;
			}
		}
	}
	
	//update value
	void update(T oldData, T newData) {
		Node curr = head;
		while(curr.data != oldData && curr.next != null) {
			curr = curr.next;
		}
		if(curr.data == oldData) {
			System.out.println("Data Value match to update.");
			curr.data = newData;
		}else {
			System.out.println("Data Value does not match to update.");
		}
	}
	
	
	////check whether a specified value is present in the list or not.
	void checkValue(T value) {
		if (head==null) {
			System.out.println("list is empty, no value to check.");
			return;
		}else {
			Node curr = head;
			while(curr != null) {
				
				if(curr.data==value) {
					System.out.println("Value is present.");
					return;
				}
				
				curr = curr.next;
			}
			if(curr == null) {
				System.out.println("Value: "+value+" is not present in the given list.");
			}
		}
	}
	
	//find middle value, if odd no. of data points/nodes.
	T findMid() {
		Node fptr=head;
		Node sptr=head;
		while(fptr.next != null) {
			sptr = sptr.next;
			fptr = fptr.next;
			if(fptr != null) {
				fptr = fptr.next;
			}
		}
		return (T)(sptr.data);
	}
	
	//another way to find mid element, if odd then okay, but if even no. of size then print just before element.
	T find_Mid() {
		Node fptr=head;
		Node sptr=head;
		while(fptr.next != null) {
			fptr = fptr.next;
			
			if(fptr.next != null) {
				fptr = fptr.next;
				sptr = sptr.next;
			}
		}
		return (T)(sptr.data);
	}
	
	//check the presence of value
	boolean contains(T value) {
		Node curr = head;
		while(curr != null) {
			if (curr.data == value) {
				return true;
			}else {
				curr = curr.next;
			}			
		}
		return false;
	}//end of code to check the presence of a specified value in the list.
	
	//get size of linked list
	int getSize() {
		return size;
	}
}



public class LinkedList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> l = new LinkedList<Integer>();
		
		l.insert(2);
		l.insert(6);
		l.insert(7);
		l.insert(11);
		l.insert(0);
		l.insert(8);
		l.insert(9);
		l.printList();
		//System.out.println(l.head.data);
		System.out.println("Size of list is: "+l.getSize());
		
		System.out.println("Head of linked list is: "+l.head.data);
		
		l.insert_front(10);
		l.printList();
		
		//System.out.println(l.head.data);
		System.out.println("Head of linked list is: "+l.head.data);
		System.out.println("Size of list is: "+l.getSize());
		
		//insert between the nodes
		//insert_between(int pos, int data)
		System.out.println("insert value=100 after 2nd node ");
		l.insert_between(2, 100);
		l.printList();
		System.out.println("Size of list is: "+l.getSize());
		
		//check mid elelemnt
		System.out.println("Mid element value is: "+l.findMid());
		
		//
		System.out.println("insert value=16 after 7th node ");
		l.insert_between(7, 16);
		l.printList();
		System.out.println("Size of list is: "+l.getSize());
		
		//find Middle element (no of elements is even)
		System.out.println("Mid element value is: "+l.find_Mid());
		
		//
		//perform delete operation
		l.delete_value(10);
		l.printList();
		l.delete_value(2);
		l.printList();
		l.delete_value(9);
		l.printList();
		
		//perform another "deleteNode" operation. This code is a short code.
		l.deleteNode(100);
		l.printList();
		l.deleteNode(8);
		l.printList();
		l.deleteNode(19);
		l.printList();
		
		//delete last node
		System.out.println("Delete last node:");
		l.deleteLast();
		System.out.print("final list after deleting last node is: ");
		l.printList();
		
		//delete by pos
		System.out.print("delete element at 2nd position: ");
		l.deleteByPos(2);
		l.printList();
		
		System.out.println("delete element at 1st position: ");
		l.deleteByPos(1);
		l.printList();
		
		//update data value
		System.out.println("update 0 value to 14, if present in list.");
		l.update(0, 14);
		l.printList();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
//
		//take  an object with String type of linked list.
		System.out.println("Now use String type LinkedList.");
		System.out.print("\n");
		
		LinkedList <String> l1 = new LinkedList<String>();
		//
		l1.insert("A");
		l1.insert("B");
		l1.insert("C");
		l1.insert("D");
		l1.insert("E");
		l1.insert("F");
		l1.insert("G");
		l1.printList();
		//System.out.println(l.head.data);
		System.out.println("Size of list is: "+l1.getSize());
		
		System.out.println("Head of linked list is: "+l1.head.data);
		//
		//replace integer by String value as in above.
		l1.insert_front("Z");
		l1.printList();
		
		//System.out.println(l.head.data);
		System.out.println("Head of linked list is: "+l.head.data);
		System.out.println("Size of list is: "+l1.getSize());
		
		//insert between the nodes
		//insert_between(int pos, int data)
		System.out.println("insert value= \"S\" after 2nd node ");
		l1.insert_between(2, "S");
		l1.printList();
		System.out.println("Size of list is: "+l1.getSize());
		
		//find Middle element
		System.out.println("Mid element value is: "+l1.findMid());
		
		//
		System.out.println("insert value=\"M\" after 7th node ");
		l1.insert_between(7, "M");
		l1.printList();
		System.out.println("Size of list is: "+l1.getSize());
		
		//find Middle element (no of elements is even)
		System.out.println("Mid element value is: "+l1.find_Mid());
		
		//
		//perform delete operation
		l1.delete_value("E");
		l1.printList();
		l1.delete_value("C");
		l1.printList();
		l1.delete_value("A");
		l1.printList();
		
		//perform another "deleteNode" operation. This code is a short code.
		l1.deleteNode("D");
		l1.printList();
		l1.deleteNode("F");
		l1.printList();
		l1.deleteNode("G");
		l1.printList();
		
		//delete last node
		System.out.println("Delete last node:");
		l1.deleteLast();
		System.out.print("final list after deleting last node is: ");
		l1.printList();
		
		//delete by pos
		System.out.print("delete element at 2nd position: ");
		l1.deleteByPos(2);
		l1.printList();
		
		System.out.println("delete element at 1st position: ");
		l1.deleteByPos(1);
		l1.printList();
		
		//update data value
		System.out.println("update 0 value to 14, if present in list.");
		l1.update("B", "N");
		l1.printList();
		
		//update data value
		System.out.println("update 0 value to 14, if present in list.");
		l1.update("B", "N");
		l1.printList();
	}
	
}


////Output is:
//2 6 7 11 0 8 9 
//Size of list is: 7
//Head of linked list is: 2
//10 2 6 7 11 0 8 9 
//Head of linked list is: 10
//Size of list is: 8
//insert value=100 after 2nd node 
//10 2 100 6 7 11 0 8 9 
//Size of list is: 9
//insert value=16 after 7th node 
//10 2 100 6 7 11 0 16 8 9 
//Size of list is: 10
//Value: 10 is found at head node, so head node is deleted.
//Now size of list becomes: 9
//2 100 6 7 11 0 16 8 9 
//Value: 2 is found at head node, so head node is deleted.
//Now size of list becomes: 8
//100 6 7 11 0 16 8 9 
//Value: 9 is found at node= 8
//Now size of list becomes: 7
//100 6 7 11 0 16 8 
//6 7 11 0 16 8 
//Value not found.
//6 7 11 0 16 
//Value not found.
//6 7 11 0 16 
//Delete last node:
//final list after deleting last node is: 6 7 11 0 
//delete element at 2nd position: 6 11 0 
//delete element at 1st position: 
//11 0 
//update 0 value to 14, if present in list.
//Data Value match to update.
//11 14 
//
//
//
//Now use String type LinkedList.
//
//A B C D E F G 
//Size of list is: 7
//Head of linked list is: A
//Z A B C D E F G 
//Head of linked list is: 11
//Size of list is: 8
//insert value= "S" after 2nd node 
//Z A S B C D E F G 
//Size of list is: 9
//insert value="M" after 7th node 
//Z A S B C D E M F G 
//Size of list is: 10
//Value: E is found at node= 7
//Now size of list becomes: 9
//Z A S B C D M F G 
//Value: C is found at node= 5
//Now size of list becomes: 8
//Z A S B D M F G 
//Value: A is found at node= 2
//Now size of list becomes: 7
//Z S B D M F G 
//Z S B M F G 
//Z S B M G 
//Value not found.
//Z S B M 
//Delete last node:
//final list after deleting last node is: Z S B 
//delete element at 2nd position: Z B 
//delete element at 1st position: 
//B 
//update 0 value to 14, if present in list.
//Data Value match to update.
//N 
//update 0 value to 14, if present in list.
//Data Value does not match to update.
//N 


