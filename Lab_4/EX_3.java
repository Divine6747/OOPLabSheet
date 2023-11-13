package Lab_4;

import java.util.Scanner;

public class EX_3 {
    public static void main(String[] args) {
        int sum = 0,limit;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the upper limit: ");
        limit = input.nextInt();

        for(int i = 0; i <= limit; i++) {
            sum += i;
        }

        System.out.println("\nThe sum of the first " + limit + " positive integers is " + sum);
    }
}
