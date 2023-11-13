package Lab_2;

import java.util.Scanner;

public class SwitchImproved {
    public static void main(String[] args) {
        String leterAsString;
        char letter;

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter any letter: ");
        leterAsString = input.nextLine();

        letter = leterAsString.charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("\nYou entered a lowercase vowel");
                break;
            default:
                System.out.println("\nYou did not enter a lowercase vowel");
        }

    }
}
