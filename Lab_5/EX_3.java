package Lab_5;

import javax.swing.*;

public class EX_3 {
    public static void main(String[] args) {

        String answer;
        char result;
        int computerWins = 0, playWins = 0, draws = 0, numberOfGames = 0;

        answer = JOptionPane.showInputDialog("Would you like to pla a game of roll the dice? (yes or no)");

        while (answer.equals("yes")){

            result = rollTheDice();
            numberOfGames++;

            if (result == 'c')
                computerWins++;
            else if (result == 'p')
                playWins++;

            else
                draws++;


            JOptionPane.showMessageDialog(null, "Game Played: " + numberOfGames + "\nComputer Wins: " + computerWins + "\nDraws: " + draws,
                    "Game info", JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Would you like to play another game? (yes or no)");




        }
        System.exit(0);
    }

    private static char rollTheDice() {

        int computerRoll, playerRoll;

        computerRoll = (int)(Math.random()*11) +1;
        JOptionPane.showMessageDialog(null,"The computer generated the value " + computerRoll +
                " \n.....now hit return to see the player roll", "Computer Roll", JOptionPane.INFORMATION_MESSAGE);

        playerRoll = (int)(Math.random()*11)+2;
        JOptionPane.showMessageDialog(null,"The Player generated The value " +
                playerRoll,"Player Roll", JOptionPane.INFORMATION_MESSAGE);

        if (computerRoll > playerRoll)
            return 'c';


        else if (playerRoll > computerRoll)
            return 'p';

        else
            return 'd';
    }
}
