package com.jarvis._16;

import java.util.Arrays;

public class Solution {

	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3)
			return Integer.MIN_VALUE;

		Arrays.sort(nums);

		int closest = nums[0] + nums[1] + nums[2] - target;
		for (int i = 0; i < nums.length - 2; i++) {
			int cur = twoSum(nums, target - nums[i], i + 1);
			if (Math.abs(cur) < Math.abs(closest)) {
				closest = cur;
			}
		}
		return target + closest;
	}

	private int twoSum(int[] nums, int target, int start) {
		int closest = nums[start] + nums[start + 1] - target;
		int l = start;
		int r = nums.length - 1;
		while (l < r) {
			if (nums[l] + nums[r] == target) {
				return 0;
			}
			int diff = nums[l] + nums[r] - target;
			if (Math.abs(diff) < Math.abs(closest)) {
				closest = diff;
			}
			if (nums[l] + nums[r] > target) {
				r--;
			} else {
				l++;
			}
		}
		return closest;
	}
}
