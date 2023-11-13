package Lab_2;

import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit, choice;
        System.out.println("Please enter a 5-digit positive whole number: ");
        digit = input.nextInt();
        if (digit >=10000 && digit <=99999){
            System.out.println("""


                    \t1. Determine 1.25% of the number
                    \t2. Determine if the number exceeds 5000 and contain all the sane digits
                    \t3. Determine if the number is odd or even
                    \t4. Determine the first digit in the number""");

            System.out.println("\n\nPlease entre your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\n\n1.25% of the number is " + String.format("%.0f",digit * 1.25/100));
                    break;
                case 2:
                    if (digit == 55555 || digit == 66666 || digit == 77777 || digit == 88888 || digit == 99999){
                        System.out.println("The number exceeds 50000 and contains all the same digits");
                    }
                    else
                        System.out.println("The number does not exceeds 50000 and contains all the same digits");
                    break;

                case 3:
                    if (digit % 2 == 0){
                        System.out.println("You entered an even number");
                    }

                    else{
                        System.out.println("You number you entered is not an even number");
                    }
                    break;

                case 4:
                    System.out.println("The first digit in the number is: " + digit/10000);
                    break;
            }
        }

        else {
            System.out.println("Error! The value entered must contain exactly one character");
        }
    }
}
