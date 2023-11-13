package Lab_5;

import javax.swing.*;

public class EX_2 {
    public static void main(String[] args) {
        String inputAsString;
        int input;

        inputAsString = JOptionPane.showInputDialog("Please enter any character: ");
        input = inputAsString.charAt(0);

        if (Character.isDigit(input))

            JOptionPane.showMessageDialog(null,"You entered a digit", "Digit Test",JOptionPane.INFORMATION_MESSAGE);

        else
            JOptionPane.showMessageDialog(null,"You didn't enter a digit", "Digit Test",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
