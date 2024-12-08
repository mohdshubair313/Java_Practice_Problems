package Basic_Questions;

import java.util.Scanner;

public class SimpleTempConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Celcius value");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.println("The temp in F is :" + tempF);
    }
}
