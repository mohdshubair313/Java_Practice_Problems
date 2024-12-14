package BiinarySearch;

public class SplitArrayAndfindtheMinofMaxsElements {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start > end) {
            int mid = start + (end- start) / 2;

            // calculate how many pieces you can divide this in with this max

            int sum =0;
            int pieces = 1;

            for (int num: nums) {
                if(sum  + num > mid) {
                    // you cannot add this in this subarray , so make new one array
                    // say you add this num in this subarray, then sum = num

                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return end;
    }
}
