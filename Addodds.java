public class Addodds {
          /* Add Odd Numbers 

DECLARE sum AS INTEGER
SET sum := 0
FOR i FROM 1 TO 100
    IF i MOD 2 != 0 THEN
        sum := sum + i
    END IF
END FOR
PRINT "Sum of odd numbers from 1 to 100 is : " + sum
*/
public class AddOdds {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to 100 is : "+ sum);
    }
}
}
