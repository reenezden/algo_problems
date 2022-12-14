import java.util.List;

public class ValidateSubsequence {

    public static boolean isValidSubsequence( List<Integer> array, List<Integer> sequence ) {

        int arrIndex = 0;
        int seqIndex = 0;

        if ( arrIndex < array.size() && seqIndex < array.size() ) {

            if ( array.get( arrIndex ) == sequence.get( seqIndex ) ) {

                seqIndex++;
            }
            arrIndex++;

            return ( seqIndex == sequence.size();
        }
    }

}