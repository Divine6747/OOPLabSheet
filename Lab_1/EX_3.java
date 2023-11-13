package Lab_1;

import java.util.Scanner;

public class EX_3 {
    public static void main(String[]args){

    int ounces;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the total number of ounces: ");
    ounces = input.nextInt();

    System.out.println(ounces+"lbs is equivalent to " +  ounces / 16 + "lbs " + ounces % 16 + "oz");



    }

}
