package Lab_2;

import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String characterAsString, category;
        char character;

        System.out.println("Please enter a single keyboard character: ");
        characterAsString = input.nextLine();

        if (characterAsString.length() != 1)
            System.out.println("Error! The value entered must contain exactly one character");
        else{
            character = characterAsString.charAt(0);

            if(character >= 'A' && character <= 'Z')
                category = "The category of the character you entered is: uppercase letter";

            else if (character >= 'a' && character <= 'z')
                category = "The category of the character you entered is: lowercase letter";


            else if (character >= '0' && character <='9')
                category = "The category of the character you entered is: Digit";


            else if (character == '£' || character == '€' || character == '$')
                category = "The category of the character you entered is: currency symbol";


            else if (character == '"' || character == '`' || character == '!' || character == '?' || character == '.' || character == ',' || character == ':' || character == ';')
                category= "The category of the character you entered is: punctuation";


            else if (character == '\n' || character == '\t')
                category = "The category of the character you entered is: whitespace";

            else
                category = "The category of the character you entered is: Character Unidentified";

            System.out.println("\n" + category);
        }
    }
}
