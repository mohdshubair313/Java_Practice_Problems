package BiinarySearch;

public class FloorofANumner {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 8;
        int ans = FloorNumber(arr,target);
        System.out.println(ans);
    }

    // ceiling is returning the index of smallest number which is greater than or equal to target
    static int FloorNumber(int[] arr ,int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
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
        return end;
    }
}

