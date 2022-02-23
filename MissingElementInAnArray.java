package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int i=0;

		for ( i = arr[i]; i < arr.length-1; i++) {
			if (i != arr[i-1]) {
				System.out.println("Missing number in an array "+i);
				break;
			}
		}

	}

}
