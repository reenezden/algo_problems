package daily_Problems;

import java.util.Arrays;

public class Day1TwoNumberSum {
	
	public static int[] newArray = {};
	public static boolean found = false;
	
	
	public static int[] twoSum(int[] arr, int target) {
		
		for(int i=0; i<arr.length -1; i++) {
			for(int j=1; j<arr.length -1; j++) {
				if( arr[i] + arr[j] ==  target ) {
					newArray[0] = arr[i];
					newArray[1] = arr[j];
					found = true;
					break;
				}
			}
			if(found == true) break;
		}
		
		return newArray;
	}
	

	public static void main(String[] args) {
		int[] array = {2,4,7,-4, -6, 3, 12};
		int target = 6;
		System.out.println( Arrays.toString( twoSum( array, target ) ) );
		

	}

}