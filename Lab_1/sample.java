package Lab_1;
import java.util.Scanner;

public class sample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number1, number2;

        System.out.println("Please enter the first number");
        number1 = input.nextDouble();

        System.out.println("Please enter the second  number: ");
        number2 = input.nextDouble();

        if(number1 > number2)
            System.out.println("\n" + number1 + "is greater than" + number2);

        if (number1 < number2)
            System.out.println("\n" + number2 + "is greater than" + number2);

        if(number1 == number2)
            System.out.println("\n" + number1 + "is equal than" + number2);



    }

}
