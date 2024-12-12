package BiinarySearch;

public class PeakNumberofArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,12,11,8,6,4,2,1};
        int ans = PeakNumber(arr);
        System.out.println(ans);
    }

    static int PeakNumber(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
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
            }
            else {
                // start = 5, end = 5
                //Loop exits (start == end).
                //Return start or end (both are 5).
                start = mid + 1;
            }
        }
        return arr[start];  // return ham start kare yaa end kare dono hi 5 rahenge
    }
}
