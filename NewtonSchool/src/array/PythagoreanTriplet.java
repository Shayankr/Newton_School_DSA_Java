package array;

//The Time Complexity of the below solution is O(n3). 
//Auxiliary Space: O(1)

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,6,5};
		if(isTriplet(arr)) {
			System.out.println("Pythagoras Triplet is found.");
		}else {
			System.out.println("Not found.");
		}

	}
	//
	static boolean isTriplet(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					int a = arr[i]*arr[i];
					int b = arr[j]*arr[j];
					int c = arr[k]*arr[k];
					
					if(a==b+c || b==c+a || c==a+b) {
						return true;
					}
				}
			}
		}
		return false;
	}

}

//Output:
//Pythagorean Triplet is found.
