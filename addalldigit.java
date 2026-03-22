public class addalldigit {
          /* Add All Digits 

DECLARE num AS INTEGER
DECLARE sum AS INTEGER
SET sum := 0
READ num
WHILE num > 0
    rem := num MOD 10
    sum := sum + rem
    num := num / 10
END WHILE
PRINT "Sum of all digits is : " + sum

*/

public class AddAllDigit {
   public static void main(String[] args) {
        int num = 12345; // Example number
        int sum = 0;
        while(num != 0){
            int rem = num % 10; // Get the last digit
            sum += rem; // Add the last digit to the sum
            num /= 10; // Remove the last digit
        }
        System.out.println("Sum of all digits is : "+ sum);
   } 
}
}
