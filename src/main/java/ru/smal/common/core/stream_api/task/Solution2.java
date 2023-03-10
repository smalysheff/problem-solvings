package ru.smal.common.core.stream_api.task;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Напишите программу, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
 * а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5,
 * то программа должна выводить слово «FizzBuzz»
 */
public class Solution2 {

    public Object[] fizzBuzzUseForLoop(int[] nums) {
        Object[] objects = new Object[nums.length];
        for (int i = 0; i < nums.length; i++) {
            objects[i] = nums[i];
            if (nums[i] % 3 == 0) {
                objects[i] = "Fizz";
            }
            if (nums[i] % 5 == 0) {
                objects[i] = "Buzz";
            }
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0) {
                objects[i] = "FizzBuzz";
            }
        }
        return objects;
    }

    public Object[] fizzBuzzUseStream(int[] nums) {
        return IntStream.of(nums)
                .mapToObj(num -> num % 3 == 0
                        ? (num % 5 == 0 ? "FizzBuzz" : "Fizz")
                        : (num % 5 == 0 ? "Buzz" : num))
                .toArray();
    }
}
