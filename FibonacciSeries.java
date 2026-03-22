/* Fibonacci Series.

DECLARE n1, n2, n3, count AS INTEGER
SET n1 = 0
SET n2 = 1
SET count = 10
PRINT n1
PRINT n2
FOR i = 2 TO count - 1 DO
    SET n3 = n1 + n2
    PRINT n3
    SET n1 = n2
    SET n2 = n3
END FOR

*/

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of terms for Fibonacci Series : ");
        int n1 = 0, n2 = 1, n3, count = sc.nextInt();
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        sc.close();

    }
}

