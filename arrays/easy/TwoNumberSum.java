package arrays.twonumbersum.bruteforce;

import java.util.Arrays;

public class TwoNumberSum {

    public static void main( String[] args ) {

        int[] array = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int targetSum = 6;
        System.out.println( Arrays.toString( twoNumberSum( array, targetSum ) ) );
    }


    private static int[] twoNumberSum( int[] array, int targetSum ) {

        int start = 0;
        int next = 1;

        while ( start < array.length ) {

            //Check the sum of the previous and next number
            if ( array[start] + array[next] == targetSum ) {
                //Return if the sum == target
                return ( new int[] { array[start], array[next] } );
            }

            //If the sum of the previous and the next number doesn't add up to the target,
            // increment the next number and compare it to the previous number
            next++;

            //If we have reached the end of the array
            if ( next == array.length ) {

                //Increment the previous number
                start++;

                //Increment the next number
                next = start++;
            }
        }

        return new int[0];
    }

}
