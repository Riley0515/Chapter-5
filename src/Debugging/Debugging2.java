package Debugging;

import java.util.Scanner;

public class Debugging2 {

    public static void main(String[] args)
        {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        System.out.print("Enter another number ");
        num2 = (int) input.nextDouble();
        System.out.println("One of these numbers is evenly divisible into the other");
            System.out.println("Neither of these numbers is evenly divisible into the other");

        }
}
