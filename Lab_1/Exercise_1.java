package Lab_1;
import javax.lang.model.element.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        String name;
        int age;
        float height;
        String str = "#";
        String repeated = str.repeat(25);

        Scanner input = new Scanner(System.in);

        System.out.println("what is you name: ");
        name = input.next();


        System.out.println("How age are you: ");
        age = input.nextInt();

        System.out.println("How tall are you: ");
        height = input.nextFloat();

        System.out.println("Name: " + name +"\nage: " + age + " years" + "\nHeight: " + height + "a");
        System.out.println(repeated +"\n\tStudent Details\n" +repeated);

        System.out.println("Name: "+name+"\nAge: " + age +  "\nHeight: " + height);
    }

}
