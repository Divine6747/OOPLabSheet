package Lab_1;
import java.util.Scanner;

public class EX_5 {
    public static void main(String[]args){

        float mass_plant;
        float radius_planet;
        float mass_other_planet;
        float radius_other_plant;
        float gravity = 9.81f;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mass of planet earth: ");
        mass_plant = input.nextFloat();

        System.out.println("Please enter the mass of planet earth: ");
        radius_planet = input.nextFloat();

        System.out.println("Please enter the mass of planet earth: ");
        mass_other_planet = input.nextFloat();

        System.out.println("Please enter the mass of planet earth: ");
        radius_other_plant = input.nextFloat();
        float ans = (gravity*mass_other_planet*radius_planet*radius_planet)/(mass_plant*radius_other_plant*radius_other_plant);

        System.out.printf("\n\n The acceleration due to gravity on the other planet is %.2f m/s/s",ans);
    }


}
