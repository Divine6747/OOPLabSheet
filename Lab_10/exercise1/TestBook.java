package Lab_10.exercise1;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String title,ISBN,bookOutput = "";
        int pages;
        double price;

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospace",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-23s%-9s%-17s%s","Title","Price","ISBN","Pages"));

        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");

        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));

        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");

        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages from your favourite book"));


        Book fb = new Book(title, price, ISBN, pages);

        //Book b2 = new Book("The Davinci Code",19.99,"3452617232",348);

        bookOutput+=String.format("\n\n%-23s%-9.2f%-17s%d",fb.getTitle(),fb.getPrice(),fb.getISBN(),fb.getPages());


        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");

        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));

        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");

        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages from your least favourite book"));

        Book lfb = new Book(title, price, ISBN, pages);

        bookOutput+=String.format("\n\n%-23s%-9.2f%-17s%d", lfb.getTitle(),lfb.getPrice(),lfb.getISBN(),lfb.getPages());

        textArea.append(bookOutput);
        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
