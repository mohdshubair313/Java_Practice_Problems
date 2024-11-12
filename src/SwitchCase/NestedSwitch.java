package SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Shubair");
                break;
            case 2:
                System.out.println("zaman");
                break;
            case 3:
                System.out.println("emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default :
                        System.out.println("No department is there according to your input");

                }
        }

    }
}
