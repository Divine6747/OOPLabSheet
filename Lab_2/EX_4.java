package Lab_2;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        String privateSupply,septicTank,meterInstalled;
        int litres;
        float cost;
        final float RATE = 0.00224f;

        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a private water supply (y or n)?: ");
        privateSupply = input.nextLine();

        System.out.print("Do you have a septic tank (y or n)?: ");
        septicTank = input.nextLine();

        if(privateSupply.equals("y") && septicTank.equals("y"))
            System.out.println("\nYou are not a customer of Irish Water so your bill is €0.00");
        else
        {
            System.out.print("\nDo you have a water meter installed (y or no)?: ");
            meterInstalled = input.nextLine();

            if(meterInstalled.equals("n"))
                cost = 212;
            else
            {
                System.out.print("\nPlease enter the number of litres used last year: ");
                litres = input.nextInt();

                cost = (litres-30000)*RATE;
            }

            System.out.println("\n\nYour Annual Bill for Irish Water services is €" + String.format("%.2f",cost));
        }
    }
}
