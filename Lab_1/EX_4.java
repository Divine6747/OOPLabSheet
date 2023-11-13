package Lab_1;
import java.util.Scanner;

public class EX_4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String str = "*";
        String repeated = str.repeat(25);

        float temp ;
        int moles;
        float pres;
        float GAS = 8.3145f;

        System.out.println(repeated+" Volume Calculator "+ repeated);

        System.out.println("Please enter the temperature of the gas: " );
        temp = input.nextFloat();

        System.out.println("Please enter the number of the moles of the gas: " );
        moles = input.nextInt();

        System.out.println("Please enter the pressure of the gas: " );
        pres = input.nextFloat();

        float total = (moles*GAS*temp)/pres;

        System.out.printf("The volume of the gas is : %.2f m3",total);




    }
}
