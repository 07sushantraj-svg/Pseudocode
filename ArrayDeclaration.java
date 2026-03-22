
 /* Array Declaration 
In Java, you can declare an array using the following syntax:
dataType[] arrayName = new dataType[arraySize];
- dataType: The type of elements the array will hold (e.g., int, double, String).
- arrayName: The name of the array variable.
- arraySize: The number of elements the array can hold.
Example:

DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[5]
arr[0] := 10
arr[1] := 20
arr[2] := 30
arr[3] := 40
arr[4] := 50
PRINT "Elements of the array:"
FOR i FROM 0 TO LENGTH(arr) - 1
    PRINT arr[i]
END FOR

Note: 1.In Java, arrays are zero-indexed, 
        meaning the first element is accessed with index 0 
        and the last element is accessed with index arraySize - 1.

      2.The length of the array can be obtained using arr.length, 
        which returns the size of the array.

      3.Arrays in Java are fixed in size, meaning once you declare an array with a certain size, 
        you cannot change its size. If you need a dynamic array, 
        you can use ArrayList or other collection classes from the Java Collections Framework.  

Declaring with lower and upper bounds:
In some programming languages, you can declare arrays with specific lower and upper bounds.
For example, in pseudocode:
DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[1..5] // This declares an array with indices from
1 to 5

In Java, you cannot directly declare arrays with specific lower and upper bounds.
You can achieve a similar effect by using an offset when accessing the array elements.
For example:
DECLARE arr AS ARRAY OF INTEGER
SET arr := NEW INTEGER[5] // This declares an array of size 5
When accessing the elements, you can use an offset to simulate lower and upper bounds:
FOR i FROM 1 TO 5
    PRINT arr[i - 1] // Accessing the array with an offset of 1
END FOR

*/
public class ArrayDeclaration {
   public static void main(String[] args) {
        int[] arr = new int[5]; // Declare an array of integers with size 5
        arr[0] = 10; // Assign values to the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
   } 
}

