/* Subtraction of Two Matrices 

DECLARE matrixA AS ARRAY OF INTEGER
SET matrixA := NEW INTEGER[3][3]
matrixA[0][0] := 1
matrixA[0][1] := 2
matrixA[0][2] := 3
matrixA[1][0] := 4
matrixA[1][1] := 5
matrixA[1][2] := 6
matrixA[2][0] := 7
matrixA[2][1] := 8
matrixA[2][2] := 9
DECLARE matrixB AS ARRAY OF INTEGER
SET matrixB := NEW INTEGER[3][3]
matrixB[0][0] := 9
matrixB[0][1] := 8
matrixB[0][2] := 7
matrixB[1][0] := 6
matrixB[1][1] := 5
matrixB[1][2] := 4
matrixB[2][0] := 3
matrixB[2][1] := 2
matrixB[2][2] := 1
DECLARE result AS ARRAY OF INTEGER
SET result := NEW INTEGER[3][3]
FOR i FROM 0 TO 2
    FOR j FROM 0 TO 2
        result[i][j] := matrixA[i][j] - matrixB[i][j]
    END FOR
END FOR
PRINT "Result of Subtraction of Matrix A and Matrix B:"
FOR i FROM 0 TO 2
    FOR j FROM 0 TO 2
        PRINT result[i][j] + " "
    END FOR
    PRINT NEW LINE
END FOR

*/
public class SubtractionOfMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] resultMatrix = new int[3][3];

        for(int i = 0; i < matrixA.length; i++){
            for(int j = 0; j < matrixA[i].length; j++){
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Result of Subtraction of Matrix A and Matrix B:");
        for(int i = 0; i < resultMatrix.length; i++){
            for(int j = 0; j < resultMatrix[i].length; j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}