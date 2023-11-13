package Lab_2;

import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double voltage;
        int Resistance1,Resistance2;
        double total;

        System.out.println("*************** Current Calculator ***************\n\n");

        System.out.println("Please enter the voltage of the battery: ");
        voltage = input.nextDouble();

        if(voltage < 0)
            System.out.println("Error! The Voltage of the battery must be positive .....now quitting program");


        System.out.println("Please enter the resistance of the first resistor: ");
        Resistance1 = input.nextInt();

        System.out.println("Please enter the resistance of the second resistor: ");
        Resistance2 = input.nextInt();

        total = voltage*(Resistance1 + Resistance2)/(Resistance1 * Resistance2);

        System.out.printf("\n\nThe total current flowing in the circuit is %.0f Amps", total);





    }
}
