package Lab_3;
import java.util.Scanner;

public class EX_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fahrenheit = 0;
        double celsius = 0;
        int total, CelsiusGreaterThan30, CelsiusLesserThan20;
        celsius = (5.0/9.0)  * (fahrenheit - 32);
        celsius = fahrenheit;



        System.out.println("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
        fahrenheit = input.nextFloat();
        System.out.println("The equivalent Celsius temperature is " + celsius + "\n");


        if (fahrenheit > -459.67)
            while (fahrenheit > -459.67) {
                System.out.println("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
                fahrenheit = input.nextFloat();
                System.out.println("The equivalent Celsius temperature is " + celsius + "\n");

            }


        else
            System.out.println("No conversions were performed....Goodbye");




    }
}
