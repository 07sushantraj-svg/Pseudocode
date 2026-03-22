
/* Average of elements in an array
DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[5]
arr[0] := 10
arr[1] := 20
arr[2] := 30
arr[3] := 40
arr[4] := 50
DECLARE sum AS INTEGER
SET sum := 0
FOR i FROM 0 TO LENGTH(arr) - 1
    sum := sum + arr[i]
END FOR
DECLARE average AS DOUBLE
SET average := (DOUBLE) sum / LENGTH(arr)
PRINT "Average of the elements is : " + average

*/
public class AverageOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // Add each element to the sum
        }
        double average = (double) sum / arr.length; // Calculate average
        System.out.println("Average of the elements is : " + average);
    }
}

