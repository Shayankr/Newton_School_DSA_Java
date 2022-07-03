//Q.) Find if there is any sub-array with sum=k
// let arr={5,2,3,8,7,0,-5,2} and find sub-array if any has sum of 13.

package array;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,2,3,8,7,0,-5,2};
		int k=13;
		
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			sum += arr[i];
			for(int j=i+1; j<arr.length; j++) {
				sum += arr[j];
				if(sum==k) {
					System.out.println("Yes required subarray is present");
					System.out.println("at index from "+i+" to "+j);
					//break;
					//return;
				}
			}
		}

	}

}
