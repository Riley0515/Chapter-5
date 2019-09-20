import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args) {

        int minUsed;
        int textUsed;
        int gbUsed;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to use? >>>");
        minUsed
= input.nextInt();
        System.out.println("How many text messages are you going to send? >>>");
        textUsed = input.nextInt();

        System.out.println("How many gigabytes are you going to use? >>>");
        gbUsed = input.nextInt();

        if (minUsed < 500 && textUsed == 0 && gbUsed == 0) {
            result = "plan A $49";
        } else if (minUsed < 500 && textUsed >= 1 && textUsed <= 99 && gbUsed == 0) {
            result = "plan B $55";
        } else if (minUsed > 500 && textUsed <= 100 && gbUsed == 0) {
            result = "plan C $61";
        } else if (minUsed > 500 && textUsed > 100 && gbUsed == 0) {
            result = "plan D $70";
        } else if (minUsed > 500 && textUsed > 100 && gbUsed >= 2) {
            if (gbUsed < 2) {
                result = "plan E $79";
            } else if (gbUsed >= 2) {
                result = "plan E $87";
            }

        }
        System.out.println("The plan you need is " + result);
    }

}
