package Lab_2;

import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "=";
        String repeated = str.repeat(50);
        float time,cost;
        final float Rate1 = 0.60f, Rate2 = 0.50f, Rate3 = 0.40f;

        System.out.println(repeated + "\n\t\t\t\tCar Calculator\n" + repeated + "\n\n");

        System.out.println("Please enter the amount of time in hours you spent parking: \n");
        time = input.nextFloat();
        if (time < 0)
            System.out.println("Error! The Voltage of the battery must be positive .....now quitting program");

        else{
            if (time <= 1)
                cost = time*Rate1;
            else if(time<=3)
                cost = 1*Rate1 + (time-1)*Rate2;
            else
                cost = 1*Rate1 + 2*Rate2 + (time-3)*Rate3;


            System.out.println("\n\nTotal cost of parking for " + time + " hours is €" +
                    String.format("%.2f",cost));

        }

    }
}
