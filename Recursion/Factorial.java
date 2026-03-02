package Recursion;

// Factorial of a number is the product of all the integers from 1 to that number. For example, the factorial of 5 is 5*4*3*2*1 = 120. The factorial of 0 is defined to be 1.
//example: factorial(5) = 120  ==> 5*4*3*2*1 = 120 


public class Factorial {
     public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

   

    
}
