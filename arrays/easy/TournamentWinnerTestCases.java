package arrays.tournament.winner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TournamentWinnerTestCases {

    @Test
    public void testCase1() {

        String[][] competitions = {
                { "HTML", "C#" },
                { "C#", "Python" },
                { "Python", "HTML" }
        };

        int[] results = { 0, 0, 1 };

        String expectedWinner = "Python";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase2() {

        String[][] competitions = {
                { "HTML", "Java" },
                { "Java", "Python" },
                { "Python", "HTML" }
        };

        int[] results = { 0, 1, 1 };

        String expectedWinner = "Java";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase3() {

        String[][] competitions = {
                { "HTML", "Java" },
                { "Java", "Python" },
                { "Python", "HTML" },
                { "C#", "Python" },
                { "Java", "C#" },
                { "C#", "HTML" }
        };

        int[] results = { 0, 1, 1, 1, 0, 1 };

        String expectedWinner = "C#";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase4() {

        String[][] competitions = {
                { "HTML", "Java" },
                { "Java", "Python" },
                { "Python", "HTML" },
                { "C#", "Python" },
                { "Java", "C#" },
                { "C#", "HTML" },
                { "SQL", "C#" },
                { "HTML", "SQL" },
                { "SQL", "Python" },
                { "SQL", "Java" }
        };

        int[] results = { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0 };

        String expectedWinner = "C#";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase5() {

        String[][] competitions = {
                { "Bulls", "Eagles" }
        };

        int[] results = { 1 };

        String expectedWinner = "Bulls";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase6() {

        String[][] competitions = {
                { "Bulls", "Eagles" },
                { "Bulls", "Bears" },
                { "Bears", "Eagles" }
        };

        int[] results = { 0, 0, 0 };

        String expectedWinner = "Eagles";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase7() {

        String[][] competitions = {
                { "Bulls", "Eagles" },
                { "Bulls", "Bears" },
                { "Bulls", "Monkeys" },
                { "Eagles", "Bears" },
                { "Eagles", "Monkeys" },
                { "Bears", "Monkeys" }
        };

        int[] results = { 1, 1, 1, 1, 1, 1 };

        String expectedWinner = "Bulls";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase8() {

        String[][] competitions = {
                { "AlgoMasters", "FrontPage Freebirds" },
                { "Runtime Terror", "Static Startup" },
                { "WeC#", "Hypertext Assassins" },
                { "AlgoMasters", "WeC#" },
                { "Static Startup", "Hypertext Assassins" },
                { "Runtime Terror", "FrontPage Freebirds" },
                { "AlgoMasters", "Runtime Terror" },
                { "Hypertext Assassins", "FrontPage Freebirds" },
                { "Static Startup", "WeC#" },
                { "AlgoMasters", "Static Startup" },
                { "FrontPage Freebirds", "WeC#" },
                { "Hypertext Assassins", "Runtime Terror" },
                { "AlgoMasters", "Hypertext Assassins" },
                { "WeC#", "Runtime Terror" },
                { "FrontPage Freebirds", "Static Startup" }
        };

        int[] results = { 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0 };

        String expectedWinner = "AlgoMasters";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase9() {

        String[][] competitions = {
                { "HTML", "Java" },
                { "Java", "Python" },
                { "Python", "HTML" },
                { "C#", "Python" },
                { "Java", "C#" },
                { "C#", "HTML" },
                { "SQL", "C#" },
                { "HTML", "SQL" },
                { "SQL", "Python" },
                { "SQL", "Java" }
        };

        int[] results = { 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 };

        String expectedWinner = "SQL";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }


    @Test
    public void testCase10() {

        String[][] competitions = {
                { "A", "B" }
        };

        int[] results = { 0 };

        String expectedWinner = "B";
        String actualWinner = TournamentWinner.getTournamentWinner( competitions, results );

        assertEquals( expectedWinner, actualWinner );
    }

}
