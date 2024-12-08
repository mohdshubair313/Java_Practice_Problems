package LinearSearchAlgo;

public class basics {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 8;
        int ans = linearSearchAlgo(arr, target);
        System.out.println(ans);
    }

    static int linearSearchAlgo(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

            for (int index = 0; index < arr.length; index++) {

            if (arr[index] == target) {
                return index;
            }
        }
    return -1;
    }
}
