/* Odd Number.

DECLARE num, rem AS INTEGER
READ num
IF num MOD 2 != 0 THEN
    PRINT "It is an Odd Number"
ELSE
    PRINT "It is not an Odd Number"
END IF

*/
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding Odd Number : ");
        int num = sc.nextInt();
        if(num % 2 != 0){
            System.out.println(num + " is an Odd Number.");
        } else {
            System.out.println(num + " is not an Odd Number.");
        }
        sc.close();
    }
}
