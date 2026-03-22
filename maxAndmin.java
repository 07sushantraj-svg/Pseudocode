
          
/* Maximum and Minimum elements in an array
DECLARE numbers AS ARRAY OF INTEGER
SET numbers := NEW INTEGER[5]
numbers[0] := 5
numbers[1] := 3
numbers[2] := 8
numbers[3] := 1
numbers[4] := 4
DECLARE max AS INTEGER
SET max := numbers[0]
DECLARE min AS INTEGER
SET min := numbers[0]
FOR i FROM 1 TO LENGTH(numbers) - 1
    IF numbers[i] > max THEN
        max := numbers[i]
    END IF
    IF numbers[i] < min THEN
        min := numbers[i]
    END IF
END FOR
PRINT "Maximum number is : " + max
PRINT "Minimum number is : " + min

*/
public class maxAndmin {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4}; // Example array
        int max = numbers[0];
        int min = numbers[0];
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);
    }
}
