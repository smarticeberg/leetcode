package com.jarvis._31;

import com.jarvis._31.Solution;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void testNextPermutation() {
        int[] nums = new int[]{3, 2, 1};
        Solution solution = new Solution();
        solution.nextPermutation(nums);
        for (int value : nums) {
            System.out.println(value);
        }
    }
}
