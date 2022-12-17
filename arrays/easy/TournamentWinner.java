package arrays.tournament.winner;

import java.util.HashMap;

public class TournamentWinner {

    static String[][] competitions = new String[][] {
            { "HTML", "C#" },
            { "C#", "Python" },
            { "Python", "HTML" }
    };

    static int[] results = { 0, 0, 1 };

    public static String getTournamentWinner( String[][] competitions, int[] results ) {

        HashMap<String, Integer> winnerMap = new HashMap<>();

        String winner = "";
        int result = 0;

        int homeColumn = 0;
        int awayColumn = 1;

        for ( int i = 0; i < competitions.length; i++ ) {

            //Home Team
            if ( results[i] == 1 ) {

                if ( winnerMap.containsKey( competitions[i][homeColumn] ) ) {

                    winnerMap.put( competitions[i][homeColumn], winnerMap.get(
                            competitions[i][homeColumn] )
                            + 3 );

                }
                else {
                    winnerMap.put( competitions[i][homeColumn], 3 );
                }

                if ( winnerMap.get( competitions[i][homeColumn] ) > result ) {
                    result = winnerMap.get( competitions[i][homeColumn] );
                    winner = competitions[i][homeColumn];
                }
            }

            //Away Team
            else {

                if ( winnerMap.containsKey( competitions[i][awayColumn] ) ) {

                    winnerMap.put( competitions[i][awayColumn], winnerMap.get(
                            competitions[i][awayColumn] )
                            + 3 );

                }
                else {
                    winnerMap.put( competitions[i][awayColumn], 3 );
                }

                if ( winnerMap.get( competitions[i][awayColumn] ) > result ) {
                    result = winnerMap.get( competitions[i][awayColumn] );
                    winner = competitions[i][awayColumn];
                }
            }
        }

        return winner;
    }


    public static void main( String[] args ) {


    }

}
