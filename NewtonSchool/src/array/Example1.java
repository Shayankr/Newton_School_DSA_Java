package array;

//Q.)Counting frequencies of array elements

import java.util.*;
public class Example1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
	    int n = arr.length;
	    
	    HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<n; i++) {
	    	if (! map.containsKey(arr[i])) {  //to check if key is present in map or not
	    		map.put(arr[i], 1);    //if not add into map.
	    	} else {
	    		int count = map.get(arr[i]);
	    		map.put(arr[i], count+1);  //if key already present, just increase its value by 1.
	    	}
	    }//for loop end.
	    
	    for(int i: map.keySet()) {
	    	System.out.println(i +" "+map.get(i));
	    }

	}//main loop end.

}
