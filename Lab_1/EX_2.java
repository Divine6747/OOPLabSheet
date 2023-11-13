/*Completed*/
package Lab_1;

import java.util.Scanner;

public class EX_2 {
    public static void main(String [] args){
        float orbitalSpeed = 13.0736f;
        String name;
        int moons;

        String str = "*";
        String repeated = str.repeat(25);


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the planet: ");
        name = input.nextLine();

        System.out.println("Please enter the number of moon(s): ");
        moons = input.nextInt();

        System.out.println("\n\n\t\t"+ repeated + "\n\t\t\t\tPlanet Data\n\t\t" + repeated + "\n");

        System.out.println(String.format("%-20s%-15s\n%-20s%-15.2f\n%-20s%-15s",
                                        "Planet Name: ",name,
                                        "orbital Speed: ",orbitalSpeed,
                                        "Number of Moon: ", moons));






       /** System.out.printf("%-20f", "orbital Speed: ",orbitalSpeed);
        System.out.printf("%-20d", "Number of Moon: ",planet);


        // + "\nOrbital Speed: ",orbitalSpeed + "\nNUmber of moon: ",planet

        */

    }
}
