import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence( List<Integer> array, List<Integer> sequence ) {

        int arrIndex = 0; //Set list/array index to zero
        int seqIndex = 0; //set sequence/array index to zero

        //array = [5, 1, 22, 25, 6, -1, 10, 8]
        //sequence = [11, 6, -1, 10]

         //Stop looping if we reach the end of the array and sequence Index
        while ( arrIndex < array.size() && seqIndex < array.size() ) {

           //Check if a match has been found
            if ( array.get( arrIndex ) == sequence.get( seqIndex ) ) {

                //Only increment the sequence when we find a match
                seqIndex++;
            }

            //Move to the next element in the array and compare to the sequence
            arrIndex++;

            //If we have reached the end of the sequence, that means we have traversed the entire sequence so we can return
            return  seqIndex == sequence.size();
        }
        return false;
    }

}