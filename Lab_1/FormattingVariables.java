package Lab_1;

public class FormattingVariables {
    public static void main(String[] args){
        String county = "Ireland";
        int population = 7026636;
        double populationDensity1 = 89.2;


        String county2 = "United Kingdom";
        int population2 = 68138484;
        double populationDensity2 = 270.7;

        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s",
                "Name", "Population", "Pop Density",
                "-----", "-----------","------------"));

        System.out.println(String.format("%-20s%-15d%.2f\n%-20s%-15d%.2f",
                county,population,populationDensity1,county2,population2,populationDensity2));





    }

}
