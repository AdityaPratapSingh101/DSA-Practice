/*
    Problem: Two Sum
    Platform: LeetCode
    Difficulty: Easy

    Description:
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    Time Complexity: O(n)
    Space Complexity: O(n)
*/
package Arrays;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {   
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
                
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        //check if result is empty
        if (result.length == 0) {
            System.out.println("Target Not Present in Array");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
        }

       
    }
}