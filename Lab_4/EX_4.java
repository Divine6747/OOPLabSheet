package Lab_4;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "=";
        String repeated = str.repeat(30);

        int number;

        System.out.println("What number do you wish to display the times-table for? ");
        number = input.nextInt();
        while (number < 0 || number > 12) {
            System.out.println("Invalid. You must enter a value from 1-12. Please re-enter: ");
            number = input.nextInt();
        }
        System.out.println(repeated +" The " + number + " times table " + repeated + "\n\n");

        for (int i = 0; i <=12; i++)

            System.out.println(number + " times " + i + " is " +(number*i));



    }
}
