package lesson1;
/**
 * Created by Brian Akashaba
Given an array of positive integers representing the values of coins in your possession, 
write a function that returns the minimum amount of change (the minimum sum of money) 
that you cannot create. The given coins can have any positive integer value and aren't 
necessarily unique (i.e., you can have multiple coins of the same value).

For example, if you're given coins = [1, 2, 5], the minimum amount of change that 
you can't create is 4. If you're given no coins, the minimum amount of change that 
you can't create is 1.

Sample Input
coins = [5, 7, 1, 1, 2, 3, 22]
    
Sample Output
20
 * 
 * 
 */
import java.util.Arrays;

public class NonConstructable {
	
	public static int nonConstructableChange(int [] a) {
		
		Arrays.sort(a);
		int changeCreated = 0;
		for(int i:a) {
			int changeToBeCreated = changeCreated +1;
			if(i > changeToBeCreated) 
				return changeCreated+1;
			changeCreated +=i;
		}
		return changeCreated+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 4};
		System.out.println(nonConstructableChange(a));

	}

}
