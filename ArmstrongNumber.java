
 /* Armstrong Number
153 , 370
DECLARE num : INTEGER
DECLARE sum : INTEGER
DECLARE rem : INTEGER
SET sum := 0
READ num
WHILE num > 0
    rem := num MOD 10
    sum := sum + num * num * num 
    num = num / 10
END WHILE
IF sum == num THEN
    PRINT "It is an Armstrong Number"
ELSE
    PRINT "It is not an Armstrong Number"
END IF

 */
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Store the original number to compare later
        int originalNum = num;
        int rem, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);

            // 2. Update num so the loop eventually ends
            num = num / 10;
        }

        // 3. Compare sum with the original input
        if (sum == originalNum) {
            System.out.println("It Is An Armstrong Number.");
        } else {
            System.out.println("It Is Not An Armstrong Number.");
        }
        sc.close();
    }
}
