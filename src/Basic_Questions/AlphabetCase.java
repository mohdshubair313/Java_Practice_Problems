package Basic_Questions;

import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.print("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
