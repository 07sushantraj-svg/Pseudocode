
          /* Addition of All Elements in a 2D Array 

DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[3][3]
arr[0][0] := 1
arr[0][1] := 2
arr[0][2] := 3
arr[1][0] := 4
arr[1][1] := 5
arr[1][2] := 6
arr[2][0] := 7
arr[2][1] := 8
arr[2][2] := 9
DECLARE sum AS INTEGER
SET sum := 0
FOR i FROM 0 TO LENGTH(arr) - 1
    FOR j FROM 0 TO LENGTH(arr[i]) - 1
        sum := sum + arr[i][j]
    END FOR
END FOR
PRINT "Sum of all elements in the 2D array is : " + sum

*/
public class AdditionElementInTD {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements in the 2D array is : "+ sum);
    }
}

