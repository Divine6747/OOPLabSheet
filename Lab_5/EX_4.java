package Lab_5;

import javax.swing.*;

public class EX_4 {
    public static void main(String[] args) {

        double xc,yc, x2,y2,radius;
        String xcAsString,ycAsString,y2AsString,x2AsString,radiusAsString,result;

        xcAsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's center");
        ycAsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's center");
        x2AsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's center");
        y2AsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's center");
        radiusAsString= JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's center");

        radius = Double.parseDouble(radiusAsString);
        xc = Double.parseDouble(xcAsString);
        yc = Double.parseDouble(ycAsString);
        x2 = Double.parseDouble(x2AsString);
        y2 = Double.parseDouble(y2AsString);


        result = pointLocator(xc,yc,x2,y2,radius);



    }

    private static String pointLocator(double xc, double yc, double x2, double y2, double radius) {

        String location;
        double distance;

        distance = Math.sqrt(Math.pow(x2-xc,2) + Math.pow(y2-yc,2));

        if (distance > radius)
            location = "outside";

        else if (distance == radius)
            location = "on";

        else
            location = "inside";

        return location;
    }


}
