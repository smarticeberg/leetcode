package com.jarvis._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return result;

		Arrays.sort(nums);

		int length = nums.length;
		for (int i = 0; i < length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			find(nums, i + 1, length - 1, nums[i]);// 寻找两个数与nums[i]的和为0
		}
		return result;
	}

	public void find(int[] nums, int begin, int end, int target) {
		int l = begin, r = end;
		while (l < r) {
			if (nums[l] + nums[r] + target == 0) {
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(target);
				ans.add(nums[l]);
				ans.add(nums[r]);
				result.add(ans); // 放入结果集中
				while (l < r && nums[l] == nums[l + 1])
					l++;
				while (l < r && nums[r] == nums[r - 1])
					r--;
				l++;
				r--;
			} else if (nums[l] + nums[r] + target < 0) {
				l++;
			} else {
				r--;
			}
		}
	}
}
