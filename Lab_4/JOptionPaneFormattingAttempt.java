package Lab_4;

import javax.swing.JOptionPane;

public class JOptionPaneFormattingAttempt{
    public static void main(String[] args) {

        String name;
        String tNumber;
        String course;
        String averageMarkAsString;
        StringBuilder data = new StringBuilder();
        float averageMark;
        int i = 1;

        String headerFormatString = String.format("%-25s%-15s%-25s%-8s\n%-25s%-15s%-25s%-8s\n\n",
                "Name","T-Number","Course","Avg Mark",
                "====","========","======","========");

        while(i <= 5) {
            name = JOptionPane.showInputDialog("\n\nPlease enter the name of student " + i);
            tNumber = JOptionPane.showInputDialog("\n\nPlease enter the t-number of student " + i);
            course = JOptionPane.showInputDialog("\n\nPlease enter the course of student " + i);
            averageMarkAsString = JOptionPane.showInputDialog("\n\nPlease enter the average mark of student " + i);

            averageMark = Float.parseFloat(averageMarkAsString);

            data.append(String.format("%-25s%-15s%-25s%8.2f\n", name, tNumber, course, averageMark));

            i++;
        }


        JOptionPane.showMessageDialog(null,headerFormatString + data,"Formatted Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
