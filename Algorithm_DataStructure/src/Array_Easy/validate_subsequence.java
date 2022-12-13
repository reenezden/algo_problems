package Array_Easy;
public class validate_subsequence {
	public static boolean isSubsequent(int[] arr1, int[] seq) {
		int prev = -1;
		boolean flag = false;
		
		for(int i=0; i < seq.length; i++) {
			for(int j=0; j <arr1.length; j++) {
				if(seq[i] == arr1[j] )
				{
					if(j<prev) return false;
					prev = j;
					flag = true;
					break;
				}
			}
			if(!(flag)) return false;
			flag = false;
		}
		return true;
		
	}
	
	public static void main(String [] args) {
		int array []= {5, 1, 22, 25, 6, -1, 8, 10};
		int sequence[] = {1, 6, 10};
		
		boolean ans = isSubsequent(array, sequence);
		System.out.println(ans);
	}

}
