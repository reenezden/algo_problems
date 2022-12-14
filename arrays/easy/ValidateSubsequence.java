import java.util.List;

public class ValidateSubsequence {

public class ValidateSubsequence {

    public static boolean isValidSubsequence( List<Integer> array, List<Integer> sequence ) {

        int arrIndex = 0; //Set list/array index to zero
        int seqIndex = 0; //set sequence/array index to zero
        int count = 0;
        boolean matchFound = false;

        //No need to compare if the sequence size is greater than the array size
        if ( sequence.size() > array.size() ) {
            return false;
        }

        //Stop looping if we reach the end of the array and sequence Index
        while ( arrIndex < array.size() && seqIndex < array.size() ) {

            //Check if a match has been found
            if ( array.get( arrIndex ) == sequence.get( seqIndex ) ) {

                matchFound = true;
                //Only increment the sequence when we find a match
                seqIndex++;
            }

            //Move to the next element in the array and compare to the sequence
            arrIndex++;

            //Stops search when a match for the first number in the sub sequence is not found
            if ( !matchFound && arrIndex == array.size() ) {
                System.out.println( "kk" + arrIndex );
                return false;
            }

            //reset matchFound to false
            matchFound = false;

            //If we have reached the end of the sequence, that means we have traversed the entire sequence so we can return

            if ( seqIndex == sequence.size() ) {
                return true;
            }
        }
        return false;
    }


    public static void main( String[] args ) {

        List<Integer> array = new ArrayList<>();

        array.add( 5 );
        array.add( 1 );
        array.add( 22 );
        array.add( 25 );
        array.add( 6 );
        array.add( -1 );
        array.add( 8 );
        array.add( 10 );

        List<Integer> sequence = new ArrayList<>();

        sequence.add( 19 );
        sequence.add( 6 );
        sequence.add( -1 );
        sequence.add( 10 );

        System.out.println( isValidSubsequence( array, sequence ) );
    }


}