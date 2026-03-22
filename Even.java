/* Even Number.
DECLARE num, rem AS INTEGER
READ num
IF num MOD 2 == 0 THEN
    PRINT "It is an Even Number"
ELSE
    PRINT "It is not an Even Number"
END IF

*/ 
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding Even Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an Even Number.");
        } else {
            System.out.println(num + " is not an Even Number.");
        }
        sc.close();
    }
}

