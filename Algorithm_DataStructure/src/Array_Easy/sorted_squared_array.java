package Array_Easy;

public class sorted_squared_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1, 2, 3, 4, 5, 6, 8, 9};
		int[] output = sortSquaredArray(input);
		
		for (int i=0; i < output.length; i++) {
			System.out.print(output[i] + ",");
		}

	}
	
	public static int[] sortSquaredArray(int[] a) {
		for (int i=0; i < a.length; i++)
			a[i] = a[i] * a[i];
		return a;
	}

}
