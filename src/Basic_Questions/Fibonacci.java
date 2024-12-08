package Basic_Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int i = 1;
        for (int count = 2; count <= n; count++) {
            int temp = i;
            i += a;
            a = temp;
        }

        System.out.print(i);
    }
}
