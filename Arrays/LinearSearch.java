/*Linear Search Algorithm
📌 Introduction

Linear Search is one of the simplest searching algorithms. It checks each element in a list sequentially until the target element is found or the list ends.

It is also known as Sequential Search.

🚀 How It Works

Start from the first element of the array.

Compare each element with the target value.

If a match is found, return its index.

If the entire array is checked and no match is found, return -1.

📝 Algorithm Steps

Input: Array arr[] and target value key

Loop from index 0 to n-1

If arr[i] == key, return i

If loop ends without match, return -1

💻 Example

Input:
Array = [10, 25, 30, 45, 50]
Target = 30

Output:
Element found at index 2

⏱ Time Complexity

Best Case: O(1) (Element found at first position)

Average Case: O(n)

Worst Case: O(n) (Element at last position or not present)

📦 Space Complexity

O(1) (No extra space required)

✅ Advantages

Simple and easy to implement

Works on unsorted arrays

Suitable for small datasets

❌ Disadvantages

Slow for large datasets

Checks each element one by one

 */

package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Target Not Present in Array");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
