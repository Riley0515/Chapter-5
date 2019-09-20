import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args){

        int parkView;
        int golfView;
        int lakeView;
        int userChoice;
        int userChoice2;
        int garage;
        int parkingSpace;
        String result = null;
        Scanner input = new Scanner(System.in);
        String result1 = null;
        System.out.println("Choose 1 for park view, 2 for golf course view, and 3 for lake view >>>");
        userChoice = input.nextInt();

        switch(userChoice){
            case 1:
                result = "parkView $150,000";
                break;
            case 2:
                result = "golfView $170,000";
                break;
            case 3:
                result = "lakeView $210,000";
                break;

        }

        System.out.println("Now choose 1 for a garage, and 2 for a parking space >>>");
        userChoice2 = input.nextInt();

        switch(userChoice){
             case 1:
             result1 = "garage $5,000";
             break;
             case 2:
                 result1 = "parking space";
                 break;
        }
        System.out.println("your condo is " + result);
        System.out.println("  " + result1);
        }

    }