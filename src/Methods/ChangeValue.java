package Methods;

public class ChangeValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20}; // Array to hold the values
        SwapNum(numbers); // Passing the array to swap method
        System.out.println("Your swapped two numbers are " + numbers[0] + " & " + numbers[1]);
    }

    static void SwapNum(int[] arr) { // Receiving the array as parameter
        System.out.println("Swapping the two numbers");
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
