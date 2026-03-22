
/* Factorials
DECLARE num : INTEGER
DECLARE fact : INTEGER
READ num,fact
fact := 1
FOR i := 1 TO num LOOP
    fact := fact * i
END FOR
PRINT fact

 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding Factorial : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= num; i ++){
            fact =  fact*i;
        }
        System.out.println("Factorial of "+num+ " is : "+ fact );
        sc.close();

    }
}

