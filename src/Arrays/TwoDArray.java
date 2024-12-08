package Arrays;

public class TwoDArray {
    public static void main(String[] arg) {
//          int [][] arr = new int[2][3]; this is the line for initialization
          int [][] arr = {                 // this is where we can initialize the variable and put the value inside the 2d array
            {1,2,2},
            {2,5,6}
          };

          // arr.length is a no of rows actually
          for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                }
                System.out.println();
        }
    }
}
