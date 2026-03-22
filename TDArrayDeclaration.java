/* 2D Array Declaration
In Java, you can declare a 2D array using the following syntax:
dataType[][] arrayName = new dataType[rows][columns];
- dataType: The type of elements the array will hold (e.g., int, double, String).
- arrayName: The name of the array variable.
- rows: The number of rows in the 2D array.
- columns: The number of columns in the 2D array.
Example:

DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[3][4] // This declares a 2D array with
3 rows and 4 columns
arr[0][0] := 1
arr[0][1] := 2
arr[0][2] := 3
arr[0][3] := 4
arr[1][0] := 5
arr[1][1] := 6
arr[1][2] := 7
arr[1][3] := 8
arr[2][0] := 9
arr[2][1] := 10
arr[2][2] := 11
arr[2][3] := 12
PRINT "2D Array:"
FOR i FROM 0 TO LENGTH(arr) - 1
    FOR j FROM 0 TO LENGTH(arr[i]) - 1
        PRINT arr[i][j] + " "
    END FOR
    PRINT NEWLINE
END FOR
Note: 1. In Java, 2D arrays are essentially arrays of arrays, 
        meaning that each element of the main array is itself an array.

      2. The length of the main array (number of rows) can be obtained using arr.length, 
        and the length of each sub-array (number of columns) can be obtained using arr[i].length.

      3. We can also declare and initialize a 2D array in a single line using array literals:
         int[][] arr = {
             {1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}
         };
*/
public class TDArrayDeclaration {
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; // Declare a 2D array with 3 rows and 4 columns
        // Initialize the array with some values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i + j; // Example initialization
            }
        }
        // Print the 2D array
        System.out.println("2D Array:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}
}
