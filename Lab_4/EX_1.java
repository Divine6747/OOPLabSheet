package Lab_4;

import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "=";
        String repeated = str.repeat(40);
        String choice = "";
        int inches;
        float meters;

        do{
            System.out.println(repeated+" Length Converter "+ repeated);
            System.out.println("\n\t\t1. Convert Inches to Feet and Inches \n\t\t2. Convert Meters to Feet \n\t\t3. Quit");

            System.out.println("\nPlease enter your choice: " + choice);
            choice = input.nextLine();

            System.out.println("\n\n");
            while (!choice.equals("1") &&  !choice.equals("2") && !choice.equals("3")){
                System.out.println("InvalidChoice! Must be 1, 2, or 3. Please re-enter: ");
                choice = input.nextLine();
            }
            switch(choice){
                case "1":
                    System.out.println("\n\nPlease entre a quantity in inches: ");
                    inches = input.nextInt();
                    while (inches < 0) {
                        System.out.println("\nInvalid  quantity! Must be at least zero. Please re-enter: ");
                        inches = input.nextInt();
                    }

                    System.out.println("\n\n" + inches + "inches is equivalent to " + (inches/12) + "feet" + (inches%12) + "inches\n\n\n\n\n\n ");
                    input.nextLine();

                    break;

                case "2":
                    System.out.println("\n\nPlease enter a quantity in meters: ");
                    meters = input.nextFloat();

                    System.out.println("\n\n" + meters + " meters is equivalent to " + (meters/12) + " feet " +
                            (meters*3.281));
                    input.nextLine();

                    break;

                case "3":
                    System.out.println("\n\nThanks for using the length converter .... goodbye");
                    break;
            }


        }while (!choice.equals("3"));




    }
}
