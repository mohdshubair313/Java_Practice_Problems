package BinarySearchIN2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) { 
        int[][] arr = {
            {1 ,2, 3},
            {4, 5, 6},
            {7, 8, 9},   
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }
                                             
    static int[] BinarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }

            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }

        return new int[] {-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int col = matrix[0].length;

        // if (matrix.length == 0) {
        //     return matrix[0];
        // }
        
        if (rows == 1) {
            return BinarySearch(matrix,0, 0, col - 1, target );
        }

        int rowstart = 0;
        int rowend = rows - 1;
        int midcol = col /2;

        // run the loop till 2 rows are remaining
        while (rowstart < (rowend - 1)) {    // while this is true it will have more than 2 rows
            int mid = rowstart + (rowend - rowstart) / 2;
            if (matrix[mid][midcol] == target) {
                return new int[] {mid, midcol};
            }

            if (matrix[mid][midcol] < target) {
                rowstart = mid;
            }
            else {
                rowend = mid;
            }
        }

        // now we have two rows 
        // check whether the target is in the col of 2 rows

        if(matrix[rowstart][midcol] == target) {
            return new int[]{rowstart, midcol};
        }

        if (matrix[rowstart + 1] [midcol] == target) {
            return new int[] {rowstart + 1, midcol};
        }

        // search in 1st half 
        if (target <= matrix[rowstart][midcol - 1]) {
            return BinarySearch(matrix,rowstart, 0, midcol - 1, target);
        }      
        
        // search in 2nd half
        if (target <= matrix[rowstart][midcol - 1] && target <= matrix[rowstart][col - 1]) {
            return BinarySearch(matrix,rowstart, midcol + 1, col - 1, target);
        }    
        
        // search in 3rd half
        if (target <= matrix[rowstart + 1][midcol - 1]) {
            return BinarySearch(matrix, rowstart + 1, 0 , midcol - 1, target);
        }         
        
        else {
            return BinarySearch(matrix, rowstart + 1, midcol + 1 , midcol - 1, target);
        }                              

    }
}
