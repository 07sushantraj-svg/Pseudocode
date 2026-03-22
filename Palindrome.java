/*Palindrome Number.

DECLARE num : INTEGER
DECLARE rev : INTEGER
DECLARE rem : INTEGER
READ num
SET rev := 0
WHILE num > 0
    rem := num MOD 10
    rev := rev * 10 + rem
    num := num / 10
END WHILE
IF rev == num THEN
    PRINT "It is a Palindrome Number"
ELSE
    PRINT "It is not a Palindrome Number"
END IF
*/
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Store the original number to compare later
        int originalNum = num;
        int rem, rev = 0;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;

            // 2. Update num so the loop eventually ends
            num = num / 10;
        }

        // 3. Compare rev with the original input
        if (rev == originalNum) {
            System.out.println("It Is A Palindrome Number.");
        } else {
            System.out.println("It Is Not A Palindrome Number.");
        }
        sc.close();
        
    }
}
