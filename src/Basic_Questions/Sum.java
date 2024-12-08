package Basic_Questions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number");
        int sum1 = input.nextInt();
        System.out.print("Enter the Second number");
        int sum2 = input.nextInt();
        int sum = sum1 + sum2;
        System.out.println("The sum of the two numbers are " + sum);
    }
}
