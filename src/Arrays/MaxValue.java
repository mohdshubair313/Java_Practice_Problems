package Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,23,4,4};
        System.out.println(max(arr));
    }
    // imagine if the array is not empty if the array is empty so give an message like the array is empty
    static int max(int[] arr ) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
