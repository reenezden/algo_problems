//Created by Akashaba Brian
package lesson1;

import java.util.Arrays;

public class TwoSum {
	
	public static int [] twoSum(int[]a, int target) {
		int[] twoSum = new int[2];
		int sum=0;
		if(a.length != 0) {
			for(int i = 0; i < a.length; i++) {
				for(int j = i+1; j < a.length; j ++) {
					sum = a[i]+a[j];
					if(sum == target) {
						twoSum[0]= a[i];
						twoSum[1]= a[j];
					}
				}
			}
			return twoSum;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

	}

}
