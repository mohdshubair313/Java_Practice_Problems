package Basic_Questions;

public class ReverseNums {
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;

        for (int i = 0; n > 0; i++) {
            int remainder = n % 10;
            reverse =  reverse * 10 + remainder;
            n = n / 10;
        }

        System.out.print(reverse);

    }
}
