package Lab_4;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, nameOver20 = "", nameStartWithA = "";
        int totalLength = 0, count = 0;
        while( count < 10){
            System.out.println("Please enter the name of a person " + (count+1) + ":");
            name = input.nextLine();

            if (name.length() > 20)
                nameOver20+= name + "\n";
            totalLength+= name.length();

            if (name.charAt(0) == 'A')
                nameStartWithA+=name + "\n";

            count++;
        }

        System.out.println("\n\n\n===================================" +
                "\n\t\tProgram Results" +
                "\n===================================" +
                "\n\nList of names containing > 20 Characters: " + "\n" + nameOver20 +
                "\n\nList of names beginning with 'A': \n" + nameStartWithA +
                "\nAverage length of names: " + String.format("%.0f", totalLength/10f));

    }
}
