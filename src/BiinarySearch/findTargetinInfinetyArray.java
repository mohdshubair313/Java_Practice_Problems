package BiinarySearch;

public class findTargetinInfinetyArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,23,56,78,96};
        int target = 56;
        System.out.println(ans(arr, target));
    }

    static int ans(int[]arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;  // end = previous end + sizeofbox * 2;
            start = newStart;
        }
        return BinarySearch(arr, target,start,end);
    }


    static int BinarySearch(int[] arr, int target,int start,int end) {

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
