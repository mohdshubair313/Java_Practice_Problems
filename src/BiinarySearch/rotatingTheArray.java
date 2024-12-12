package BiinarySearch;

public class rotatingTheArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 6));
    }

    static int search(int arr[], int target) {
        int pivot = findPivot(arr);

        if(pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return BinarySearch(arr, target, pivot + 1, pivot - 1);
        }

        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

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

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ( mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid> start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] <= arr[start]) {
                end = mid - 1;            // basically start hamara jo hoga wo bada hi hoga kyu ki asscending order se chala aa raha hai and mid ke baad descending order hoga to saare start value se chote hi honge to hamne end update karke mid se ek pehle waali value le li and end bana bana diya
            }
            else {
                start = mid + 1;         // so yaha par agar ascending order me hi sab chal raha hoga to obvious hai ki mid jo hoga wo bada hoga start se to ham start ko update kar denge mid + 1 kyuki badi value hame mid ke baad hi to milengi so start = mid + 1
            }
        }
        return -1;
    }

    // If the some elements are the duplicate elements so what we have to do

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; 
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start ++;

                if(arr[end] < arr[end - 1]) {
                    return end -1;
                }
                end --;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) ) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
 }