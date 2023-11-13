package Lab_2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String leterAsString;
        char letter;

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter any letter: ");
        leterAsString = input.nextLine();

        letter = leterAsString.charAt(0);

        switch (letter){
            case 'a':
                System.out.println("\nYou entered a lowercase vowel");
                break;

            case 'e':
                System.out.println("\nYou entered a lowercase vowel");
                break;

            case 'i':
                System.out.println("\nYou entered a lowercase vowel");
                break;

            case 'o':
                System.out.println("\nYou entered a lowercase vowel");
                break;

            case 'u':
                System.out.println("\nYou entered a lowercase vowel");
                break;

            default:
                System.out.println("\nYou did mot enter a lowercase letter");
        }
    }
}
