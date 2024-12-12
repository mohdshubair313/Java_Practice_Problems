package BiinarySearch;
// https://leetcode.com/problems/find-in-mountain-array/ (hard problem of binary search)

public class findPeakElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = searchPeak(arr, target);
        System.out.println(ans);
    }

     static int searchPeak(int[] arr, int target) {
        int peak = binarysearchPeakElement(arr);
        int firsttry = searchinOrder(arr, target, 0, peak);

        if (firsttry != -1) {
            return firsttry;
        }
        return searchinOrder(arr, target, peak+1, arr.length - 1);
    }

    static int binarysearchPeakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
//                Array: {1, 2, 3, 4, 5, 12, 11, 8, 6, 4, 2, 1}
//                Initial values:
//
//                start = 0, end = 11
//                Step 1:
//
//                mid = start + (end - start) / 2 = 0 + (11 - 0) / 2 = 5
//                arr[mid] = 12, arr[mid + 1] = 11
//                Condition: arr[mid] > arr[mid + 1] (False)
//                        Action: Update end = mid = 5.                end = mid;
            } else {
                // start = 5, end = 5
                //Loop exits (start == end).
                //Return start or end (both are 5).
                start = mid + 1;
            }
        }
        return start;
    }

        static int searchinOrder ( int[] arr, int target, int start, int end){

            boolean isAsc = arr[start] < arr[end];

            while(start <= end) {
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
            }
            return -1;
        }
    }


