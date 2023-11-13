package Lab_4;

import javax.swing.*;

public class JP_Sample{
    public static void main(String[] args) {
        String item, qualityAsString, priceaAsString;
        int quality;
        double price;

        item = JOptionPane.showInputDialog("Please enter type of item: ");
        qualityAsString = JOptionPane.showInputDialog("Please enter item quality: ");
        priceaAsString = JOptionPane.showInputDialog("Please enter item price: ");


        quality = Integer.parseInt(qualityAsString);
        price = Integer.parseInt(priceaAsString);

        JOptionPane.showMessageDialog(null,"Item: " + item + "\nQuality: " + quality + "\nPrice: €" + price, "Item Details", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
