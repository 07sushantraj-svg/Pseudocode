/* Sum of Squares

DECLARE num : INTEGER
DECLARE sum : INTEGER
READ n,sum
SUM := 0
FOR i := 1 TO num LOOP
    sum := sum + i * i
END FOR
PRINT sum

 */
import java.util.Scanner;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding sum of Squares : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i ++){
            sum = sum+i*i;
        }
        System.out.println("sum of squares upto "+num+ " is : "+ sum );
        sc.close();
    }
    
}