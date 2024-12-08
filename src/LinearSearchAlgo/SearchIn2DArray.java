package LinearSearchAlgo;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,4},
                {2,3,4,34,9},
                {7,6,5},
        };
        int target = 34;
        int [] ans = SearchIn2DArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] SearchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {    // basically arr.length is no of rows
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] {i, j};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
