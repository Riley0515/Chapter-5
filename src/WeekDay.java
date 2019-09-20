import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String day;
        String result;
        System.out.println("Enter the day of the week >>");
        day = input.next();
        switch(day){
            case "Monday":
                result = "Reserve room for friday meeting";
                break;
            case "Tuesday":
                result = "Prepare Powerpoint slides";
                break;
            case "Wednesday":
                result = "send out meeting reminders";
                break;
            case "Thursday":
                result = "Getting ready for football friday";
                break;
            case "Friday":
                result = "Wear spirit wear for game Space Theme";
                break;


            default:
                result = "Invalid";

        }
        System.out.println(result);
    }
}
