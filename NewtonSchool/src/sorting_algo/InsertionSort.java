package sorting_algo;

//Insertion Sort, Ex: Sorting a pack of cards
//let given array is:{12,11,13,5,6}

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//given array is
		int [] array = {12,11,13,5,6};
		
//		int[] sort_array = insertionSort(array);
//		printArray(sort_array);
		
		insertionSort(array);
		printArray(array);

	}
	//define a method for Insertion Sort
	static int[] insertionSort(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		int i=1;
		
		while(i < n) {
			for(int j=0; j<i; j++) {
				if (arr[j]>arr[i]) {
					temp = arr[i];
					for(int k=i; k>j; k--) {
						arr[k]=arr[k-1];
					}
					arr[j]=temp;
				}
			}
			i++;
		}
		return arr;
	}
	//define method for print array
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

//Output
//5 6 11 12 13 

//Time and Space Complexity
//Space Complexity - O(n)

//Time Complexity
//Best Case - O(n)
//Average case - O(n^2)
//Worst case - O(n^2).