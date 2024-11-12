package SwitchCase;

import java.util.Scanner;

import static java.lang.System.*;

public class Basics {
    public static void main(String[] args) {
        out.println("Enter the day number and you will get the nth day of that number");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("king of the fruits");
//                break;
//            case "Apple":
//                System.out.println("Healthy King fruit");
//                break;
//            case "Orange" :
//                System.out.println("Very sour taste fruit");
//                break;
//            case "Grapes":
//                System.out.println("Very sweet green balls ");
//                break;
//            default:
//                System.out.println("Please enter the valid fruits");
//        }

//         This is most readable syntax of switch statements and also very easy to use.

//        switch (fruit) {
//            case "Mango" -> System.out.println("king of the fruits");
//            case "Apple" -> System.out.println("Healthy King fruit");
//            case "Orange" -> System.out.println("Very sour taste fruit");
//            case "Grapes" -> System.out.println("Very sweet green balls ");
//            default -> System.out.println("Please enter the valid fruits");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> out.println("Monday");
            case 2 -> out.println("Tuesday");
            case 3 -> out.println("Wednesday");
            case 4 -> out.println("Thursday");
            case 5 -> out.println("Friday");
            case 6 -> out.println("Saturday");
            case 7 -> out.println("Sunday");
        }
        out.println("Thankyou for joining...");
    }


}
