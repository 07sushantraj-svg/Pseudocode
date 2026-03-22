/*Sum of first N natural number.

DECLARE n : INTEGER
DECLARE sum : INTEGER
READ n,sum
SUM := 0
FOR i := 1 TO n LOOP
    sum := sum + n
END FOR
PRINT sum

*/

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}