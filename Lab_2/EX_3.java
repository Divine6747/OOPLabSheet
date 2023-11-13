package Lab_2;

import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        float orbitRadius, periodDays, periodSeconds, mass;
        final float G = 6.67428E-11f,
                PI = 3.142f;

        System.out.print("""
                \t--------------Sun Mass Calculator-----------

                Please enter the radius of the planet's orbit around the sun:\s""");

        orbitRadius = input.nextFloat();

        if (orbitRadius < 0)
            System.out.println("\nError! The radius of the orbit must be positive .... quitting program now");
        else {
            System.out.print("Please enter the period of rotation for the planet in days: ");
            periodDays = input.nextFloat();

            if (periodDays < 0)
                System.out.println("\nError! The period of rotation must be positive .... quitting program now");
            else {
                periodSeconds = periodDays * 24 * 60 * 60;

                mass = 4 * PI * PI * orbitRadius * orbitRadius * orbitRadius / (G * periodSeconds * periodSeconds);

                System.out.println("\n\nThere are " + String.format("%.0f", periodSeconds) + " seconds in " + periodDays + " days\nThe approximate mass of the sun is " +
                        String.format("%.0f", mass) + " kg");
            }
        }
    }
}