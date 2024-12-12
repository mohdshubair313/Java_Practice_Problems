package BiinarySearch;

public class SearchAccToOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 45, 54, 87, 91};
        int target = 45;
        int ans = searchAcctoOrder(arr, target);
        System.out.println(ans);
    }


    static int searchAcctoOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        int mid = start + (end - start) / 2;

        if (arr[mid] > target) {
            return mid;
        }

        if (isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
