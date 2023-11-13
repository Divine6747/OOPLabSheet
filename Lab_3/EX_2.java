package Lab_3;

import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String characters;
        int totalChar = 0;
        int digit = 0, i = 0;
        int vowels = 0, oddChars = 0, consecutiveCase = 0;
        char ch;
        String str = "-";
        String repeated = str.repeat(35);


        System.out.println("Please enter a sentence terminated with a full-stop or exclamation mark:");
        characters = input.nextLine();
        totalChar+=characters.length();
        characters = characters.toLowerCase();

        ch = characters.charAt(i);

        char nextChar = ' ';

        while( ch != '!' && ch != '.') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u')
                vowels++;
            else if (ch >= '0' && ch <= '9') {
                digit++;
            }

            if (ch == '1' || ch == '3' || ch == '5' ||ch == '7' || ch == '9')
                oddChars++;

            if(i < totalChar - 1)
                nextChar = characters.charAt(i+1);

            if(ch == nextChar)
                consecutiveCase++;

           // if(i < totalChar - 2)
            ch = characters.charAt(i);

            i++;

        }

        System.out.println("\n\n"+ repeated +  "\n\t\t" + "Sentence Analysis" + "\t\t" + "\n" + repeated);


        System.out.println("Total Characters: " +totalChar +"\nTotal Vowels: " + vowels +
                            "\nTotal Digits: " + digit + "\nTotal dd number characters: " + oddChars + "\nTimes a character appears consecutively: " + consecutiveCase);




    }
}
