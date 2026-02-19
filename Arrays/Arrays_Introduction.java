/*
    File Name: Arrays_Introduction.java
    Topic: Arrays in Java
    Description: Basic concepts of Array including creation, initialization,
                 input, output, traversal, and update.

    ------------------------------------------------------------
    WHAT IS AN ARRAY?

    -> An array is a collection of elements of the same data type.
    -> It stores multiple values in a single variable.
    -> Elements are stored in contiguous memory locations.
    -> Indexing starts from 0.

    Example:
        If array size is 5
        Index:   0   1   2   3   4
        Value:  10  20  30  40  50

    ------------------------------------------------------------
    WHY USE ARRAY?

    -> To store multiple values of same type
    -> Fast access using index
    -> Useful in sorting, searching, and other algorithms

    ------------------------------------------------------------
*/
package Arrays;
import java.util.Scanner;

public class Arrays_Introduction {

    public static void main(String[] args) {

        // Array Declaration
        int[] arr;

        // Array Creation (Memory Allocation)
        arr = new int[5];   // Array of size 5

        //  Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output (Traversal using for loop)
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Update Operation
        arr[0] = 100;   // Updating first element

        System.out.println("\nAfter updating first element:");
        for (int value : arr) {   // Enhanced for loop
            System.out.print(value + " ");
        }

        sc.close();
    }
}

/*
    ------------------------------------------------------------
    IMPORTANT CONCEPTS:

    1. arr.length -> Returns size of array
    2. Arrays are fixed in size (cannot change after creation)
    3. Default values:
         int -> 0
         double -> 0.0
         boolean -> false
         String -> null
    4. Access Time Complexity -> O(1)
    5. Traversal Time Complexity -> O(n)

    ------------------------------------------------------------
    ADVANTAGES:
    - Fast random access
    - Easy to traverse

    DISADVANTAGES:
    - Fixed size
    - Only same data type allowed

    ------------------------------------------------------------
*/


