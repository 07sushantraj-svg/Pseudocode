/* Sum of all elements in an array
DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[5]
arr[0] := 1
arr[1] := 2
arr[2] := 3
arr[3] := 4
arr[4] := 5
DECLARE sum AS INTEGER
SET sum := 0
FOR i FROM 0 TO LENGTH(arr) - 1
    sum := sum + arr[i]
END FOR
PRINT "Sum of all elements is : " + sum

*/
public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // Add each element to the sum
        }
        System.out.println("Sum of all elements is : "+ sum);
    }
}