/*Prime Number.
DECLARE num : INTEGER
DECLARE isPrime : BOOLEAN
READ num
isPrime := true
IF num <= 1 THEN
    isPrime := false
ELSE
    FOR i := 2 TO sqrt(num) LOOP
        IF num MOD i == 0 THEN
            isPrime := false
            BREAK
        END IF
    END FOR
END IF
*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding Prime Number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        sc.close();
    }
}
