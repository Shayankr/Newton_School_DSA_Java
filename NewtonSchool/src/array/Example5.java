package array;

//Q..)find ceil-value in an array
//ceil(3.5)=3
//ceil(3.8)=4
//ceil(-1.2)=-1

//floor(3.5)=3

//arr={1,2,3,5,8,12}
//ceil-value of 5 --will be--just next max value to 5 present in the array, 
//if 5 is not present in the array.
//if 5 is present in tha raay then, ceil(5) will be 5.

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,8,12};
		int n = arr.length;
		int key=12;
		if(key>arr[n-1]) {
			System.out.println(-1);
		}else {
			for(int val: arr) {
				if(val==key || val>key) {
					System.out.println(val);
					break;
				}
			}
		}
	}
}
