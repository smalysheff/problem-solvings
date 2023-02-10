package ru.smal.easy.easy268;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 268. Missing Number
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * <p>
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * <p>
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class Solution {

    public int missingNumberXor(int[] nums) {
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans ^= i ^ nums[i];
        }
        return ans;
    }

    public int missingNumber(int[] nums) {
        int full = Stream
                .iterate(0, i -> i + 1)
                .limit(nums.length + 1)
                .mapToInt(Integer::intValue)
                .sum();

        int sum = Arrays
                .stream(nums)
                .sum();

        return full - sum;
    }
}
