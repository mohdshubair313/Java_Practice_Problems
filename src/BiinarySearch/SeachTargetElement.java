package BiinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SeachTargetElement {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 2, 3, 4, 6, 12, 23, 56, 90, 100};
        System.out.println("Here is the array list: " + Arrays.toString(arr) + ". Now tell me what number you want to search:");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }
}
