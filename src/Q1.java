import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter You Current salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if (salary > 10_000) {
            int bonus1 = salary + 2000;
            System.out.println("Now your Salary becomes by adding bonus is: " + bonus1);
        }
        else {
            int bonus2 = salary + 1000;
            System.out.println("Now your Salary becomes by adding bonus is: " + bonus2);
        }
    }
}
