package Debugging;

import javax.print.attribute.standard.PrintQuality;
import java.util.Scanner;

import static javafx.print.PrintQuality.LOW;
import static javax.print.attribute.standard.PrintQuality.HIGH;

public class Debugging3 {


    private static PrintQuality CUTOFF;

    public static void main (String args[])
    {

        String output;

        Scanner input = new Scanner(System.in);
        calculateOutPut();
    }
    public static void calculateOutPut()
    {
        int item;
        final int LOW = 111;
        final int HIGH = 9;
        final int CUTOFF = 500;
        System.out.println("Please enter item number");
        Scanner input = null;
         item = input.nextInt();
        String output;
        if(item < LOW) {
            output = "Item number too low";
        }
        else if(item > HIGH)
            output = "Item number too high";
        else if(item > CUTOFF)
            output = "Valid - in Automotive Department";
        else
            output = "Valid - Item in Housewares Department";
        System.out.println(output);
    }
}

