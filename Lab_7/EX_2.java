package Lab_7;

import javax.swing.*;
import java.awt.*;

public class EX_2 {
    public static void main(String[] args) {

        String[] names = {"James Maye", "Joe Blogs", "Jane Doe", "Teresa Coughlin", "Sam Stewart"};
        double[] GPAs = {3.56,2.47,3.12,2.55,2.78};

        selectionSort(names,GPAs);
        displayResults(names,GPAs);

        JOptionPane.showMessageDialog(null,"The average GPA is " + String.format("%.0f",averageGPA(GPAs)),"Average GPA",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"The standard Deviation of the GPAs is " + String.format("%.3f",standardDeviationGPA(GPAs)),"Standard Deviation",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void selectionSort(String[] names, double[] GPAs) {
        double temp;
        String tempString;
        int subSmallest = 0;
        for (int i = 0; i < GPAs.length-1; i++) {
            subSmallest = i;

            for (int j = i; j < GPAs.length; j++)
                if (GPAs[j] < GPAs[subSmallest])
                    subSmallest = j;


            temp = GPAs[i];
            GPAs[i] = GPAs[subSmallest];
            GPAs[subSmallest] = temp;

            tempString = names[i];
            names[i] = names[subSmallest];
            names[subSmallest] = tempString;
            
        }
    }

    private static void displayResults(String[] names, double[] GPAs) {

        JTextArea textArea = new JTextArea();
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);

        textArea.setFont(textAreaFont);

        textArea.append(String.format("%-25s%s\n%-25s%s\n\n","Name","GPA","------","-----"));

        for(int i = names.length-1; i >= 0; i--)
            textArea.append(String.format("%-25s%.2f\n", names[i], GPAs[i]));

        JOptionPane.showMessageDialog(null,textArea,"Sorted Results",JOptionPane.INFORMATION_MESSAGE);
    }


    private static double averageGPA(double[] GPAs) {
        double sum = 0;
        for (int i = 0; i < GPAs.length; i++)
            sum +=GPAs[i];
        return  sum/GPAs.length;
    }

    public static double standardDeviationGPA(double[] GPAs) {

        double sum=0, average = averageGPA(GPAs);

        for(int i = 0; i < GPAs.length; i++)
            sum += Math.pow(average-GPAs[i],2);

        return Math.sqrt(sum/GPAs.length);
    }


}


