import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;

public class day2PExercises {


    public static void main(String []args){

        /*
        //P2.1 P2.9
        double x = 8.5;
        double y = 11;

        double xm = x * 25.4;
        double ym = y * 25.4;

        System.out.println("The height of the sheet is " + (int)xm + " mm and the length of the sheet is " + (int)ym + " mm. ");

         */
        /*
        //P2.2
        double x = 8.5;
        double y = 11;
        double x2 = Math.pow(x, 2);
        double y2 = Math.pow(y, 2);
        double t = x2 + y2;

        System.out.println(x2);
         */

        /*
        //P2.3
        double x = 4;
        double xSQ = Math.sqrt(x);
        double xCU = (x * x * x);
        double xPO = Math.pow(x, 4);

        System.out.println(xSQ);

         */

        //P2.4 P2.5
        /*
        String input1 = JOptionPane.showInputDialog("Skriv första integern: ");
        String input2 = JOptionPane.showInputDialog("Skriv andra integern: ");
        int numberOne = Integer.parseInt(input1);

        int numberTwo = Integer.parseInt(input2);

        System.out.println("Summan av de två: " + (numberOne + numberTwo));
        System.out.println("Skillnaden mellan de två: "+ (numberOne - numberTwo));
        System.out.println("Dessa gånger varandra blir: " + (numberOne * numberTwo));
        System.out.println("Medelvärdet: " + (double) (numberOne + numberTwo) / 2);
        System.out.println("Det absoluta värdet: "+  Math.abs(numberOne - numberTwo));
        System.out.println("Det maximala värdet: " +  Math.max(numberOne, numberTwo));
        System.out.println("Det minsta värdet: " + Math.min(numberOne, numberTwo));

         */

        //P2.6
        /*
        String input1 = JOptionPane.showInputDialog("Omvandla antal meter i engelska miles, fot och inches: ");
        String decimalPattern = "###,###.####";
        DecimalFormat decimalFormat = new DecimalFormat(decimalPattern);


        double meter = Integer.parseInt(input1);
        double miles = meter / 1609.34;
        double fot = meter / 0.3048;
        double inches = meter / 0.0254;

        System.out.println("Detta är ca: " + String.format("%.5f",miles) + " miles, " + String.format("%.5f",fot) + " fot, " + String.format("%.5f",inches) + " inches.");

         */

        //P2.7
        /*
        String input1 = JOptionPane.showInputDialog("Ange en radie för en cirkel eller sfär: ");
        int radius = Integer.parseInt(input1);

        System.out.println("Omkretsen på cirkeln är: "+  (2 * (3.14 * radius)) + "och arean är: " + (3.14 * (radius * radius)));
        System.out.println("Volymen på sfären är: "+  (1.33 * (3.14 * Math.pow(radius, 3))) + " och arean är: " + (4 * (3.14 * Math.pow(radius, 2))));
        */

        //P2.8
        /*
        String input1 = JOptionPane.showInputDialog("Ange X sidan på en rektangel: ");
        String input2 = JOptionPane.showInputDialog("Ange Y sidan på en rektangel: ");
        int numberOne = Integer.parseInt(input1);
        int numberTwo = Integer.parseInt(input2);

        double numberOneX = numberOne + numberOne;
        double numberTwoY = numberTwo + numberTwo;
        double numberOnePow = Math.pow(numberOne, 2);
        double numberTwoPow = Math.pow(numberTwo, 2);

        System.out.println("Omkretsen är: " + (numberOneX+numberTwoY) + " och arean är: " + ((numberOne * numberOne) *(numberTwo * numberTwo)) );
        System.out.println("Diagonalen är: " + Math.sqrt(numberOnePow+numberTwoPow));

         */

        //P2.10

        /*
        double carPrice = 348000;
        double milesPerYear = 15000;
        double gasPrice = 13.8;
        double effiency = gasPrice * (0.56 * milesPerYear);
        double reSaleValue = 180000;
        double totalLoss = (carPrice-reSaleValue) + (effiency * 5);

        System.out.println("Ska du köpa en hybrid får du räkna med följande kostnader: ");
        System.out.println("En Toyota RAV4 kostar: " + carPrice);
        System.out.println("Kör du 15000 mil om året så kostar det: "+ effiency + "kr . Då den drar 0,56L milen.");
        System.out.println("Baserat på körningen per år så går priset också ner "+ ((carPrice-reSaleValue)/5)+ " per år. Så efter 5 år har den tappat " + (carPrice-reSaleValue) + " i värde.");
        System.out.println("Totalt har den kostat inklusive allt: " + totalLoss);

         */
        //P2.11
        /*
        String input1 = JOptionPane.showInputDialog("Lägg in hur många liter du har i tanken: ");
        String input2 = JOptionPane.showInputDialog("Hur mycket din bil drar per mil: ");
        String input3 = JOptionPane.showInputDialog("Vad bensinpriset är just nu: ");
        double literITanken = Double.valueOf(input1);
        double perMil = Double.valueOf(input2);
        double bensinPris = Double.valueOf(input3);

        double effiency = bensinPris * (perMil * 100);
        double oneTankReach = perMil * literITanken;

        System.out.println("Kör du 100 mil om så kostar det: "+ effiency + "kr . Då den drar 0,56L milen.");
        System.out.println("Med så mycket i tanken kan du komma så här många mil: "+ oneTankReach);
         
         */

        //P2.12
        /*
        String input1 = JOptionPane.showInputDialog("Ange en disk på datorn: ");
        String input2 = JOptionPane.showInputDialog("Ange vilken mapp du vill till: ");
        String input3 = JOptionPane.showInputDialog("Ange filnamnet: ");
        String drive = input1;
        String path = input2;
        String fileName = input3;

        System.out.println("Här är filvägen: " + drive +":\\" + path + fileName);
        */

        //P2.13
        /*
        String input1 = JOptionPane.showInputDialog("Please enter an integer between 1,000 and 999,999: ");
        String numberOnly = input1.replaceAll("[^0-9]", "");


        System.out.println("Här är numret: " + numberOnly );

         */

        //P2.15
        String input1 = JOptionPane.showInputDialog("Ange en tid enligt formatet TTMM: ");
        String input2 = JOptionPane.showInputDialog("Ange en annan tid i formatet TTMM: ");
        double tid1 = Double.valueOf(input1);
        double tid2 = Double.valueOf(input2);
        BigDecimal tid11 = tid1.negate();
        BigDecimal tid22 = tid2.negate();
        double tid3 = (tid11 - tid22);
        double timmar = (tid3 / 100);
        double minuter = (tid3 % 100);





        System.out.println("Timmar: " + timmar + " och minuter: " + minuter);
       }
}
