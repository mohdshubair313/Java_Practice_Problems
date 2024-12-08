package LinearSearchAlgo;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int target = 4;
        int ans = SearchInRange(arr, target,2, 6);
        System.out.println(ans);

    }

    // bas karna kya hai ki range fix karni hai like argument pass kardege ex 2 to 4 so it starts with 2nd index and end with 6th index
    static int SearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];

            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
