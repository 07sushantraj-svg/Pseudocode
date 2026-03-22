
 /* Check Frequency of a Digit in a Number 

DECLARE num AS INTEGER
DECLARE target AS INTEGER
DECLARE count AS INTEGER
SET count := 0
READ num
READ target
WHILE num > 0
    IF num MOD 10 == target THEN
        count := count + 1
    END IF
    num := num / 10
END WHILE
PRINT "Frequency of number " + target + " is : " + count

*/
public class CheckFrequency {
    public static void main(String[] args) {
        int num = 112333445; // Example number
        int target = 3; // Number to check frequency
        int count = 0;
        while(num != 0){
            if(num % 10 == target){
                count++;
            }
            num /= 10;
        }
        System.out.println("Frequency of number " + target + " is : " + count);
    }
}

