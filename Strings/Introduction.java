/*String introduction in Java

    Strings in Java are objects that represent sequences of characters. They are widely used for storing and manipulating text data.

    String Declaration:
    String str;

    String Creation:
    str = new String("Hello");
    or
    String str = "Hello"; // String literal

    String Methods:
    - length(): Returns the length of the string
    - charAt(int index): Returns the character at the specified index
    - substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string
    - equals(Object obj): Compares this string to the specified object
    - toUpperCase(): Converts all characters in the string to uppercase
    - toLowerCase(): Converts all characters in the string to lowercase

    Example:
    String str = "Hello, World!";
    System.out.println(str.length()); // Output: 13
    System.out.println(str.charAt(0)); // Output: H
    System.out.println(str.substring(0, 5)); // Output: Hello
    System.out.println(str.equals("Hello, World!")); // Output: true
    System.out.println(str.toUpperCase()); // Output: HELLO, WORLD!



    */
   package Strings;
   import java.util.Scanner;    
   class Introduction {
    public static void main(String[] args) {
        // String Declaration and Creation
        String str = "Hello, World!";

        // Output
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("Uppercase: " + str.toUpperCase());
    }