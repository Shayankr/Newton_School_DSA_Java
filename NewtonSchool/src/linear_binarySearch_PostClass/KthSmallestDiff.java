package linear_binarySearch_PostClass;

public class KthSmallestDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[50];
		int p=1;
		int count=1;
		arr[0]=1;
		for(int i=1; i<arr.length; i++) {
			if(count % 2 == 0) {
				p++;
			}
			arr[i]=p+arr[i-1];
			count++;
		}
		for(int value: arr) {
			System.out.print(value+" ");
		}

	}

}
