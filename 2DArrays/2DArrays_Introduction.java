/*
Introduction to 2D Arrays in Java


    2D Arrays (Two Dimensional Arrays) are arrays of arrays. They can be visualized as a table or matrix with rows and columns.

    Declaration:
    dataType[][] arrayName;

    Creation:
    arrayName = new dataType[rows][columns];

    Example:
    int[][] matrix = new int[3][4]; // 3 rows and 4 columns

    Accessing Elements:
    matrix[rowIndex][columnIndex]

    Traversal:
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

    Advantages of 2D Arrays:
    - Can represent tabular data
    - Easy to traverse using nested loops
    - Provides fast access to elements

    Disadvantages:
    - Fixed size (cannot change after creation)
    - Can consume more memory if not used efficiently
public class 2DArrays_Introduction {
    */
   import java.util.*;
   class 2DArrays_Introduction {
    public static void main(String[] args) {
        // 2D Array Declaration and Creation
        int[][] matrix = new int[3][4]; // 3 rows and 4 columns

        // Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 3x4 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output (Traversal)
        System.out.println("Matrix elements are:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

