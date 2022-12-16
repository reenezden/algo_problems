package lesson1;
created by Brian Akashaba

import java.util.Arrays;

public class SortedSquareArray {
	static int[] squareArray (int[]a) {
		Arrays.sort(a);
		int count =0;
		int []sortedSquare = new int[a.length];
		for(int i =0; i<a.length; i++) {
			sortedSquare[i] = a[i]*a[i];
			count++;
		}
		if(sortedSquare.length == a.length);
		return sortedSquare;
	}
	
	public static void main(String[] args) {
		int[] a = {5, 1, 22, 25, 6, -1,10,8};
		
		
		System.out.println(Arrays.toString(squareArray(a)));
		
	}

}