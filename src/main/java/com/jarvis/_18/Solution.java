package com.jarvis._18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int len = nums.length;
		if (nums == null || len < 4) return result;

		Arrays.sort(nums);

		int max = nums[len - 1];
		if (4 * nums[0] > target || 4 * max < target) return result;

		int i, z;
		for (i = 0; i < len; i++) {
			z = nums[i];
			if (i > 0 && z == nums[i - 1]) // 避免重复
				continue;
			if (z + 3 * max < target) // z太小
				continue;
			if (4 * z > target) // z太大
				break;
			if (4 * z == target) { // z是边界
				if (i + 3 < len && nums[i + 3] == z) {
					result.add(Arrays.asList(z, z, z, z));
				}
				break;
			}
			threeSumForFourSum(nums, target - z, i + 1, len - 1, result, z);
		}

		return result;
	}

	public void threeSumForFourSum(int[] nums, int target, int low, int high, List<List<Integer>> fourSumList, int z1) {
		if (low + 1 >= high) return;
		int max = nums[high];
		if (3 * nums[low] > target || 3 * max < target) return;

		int i, z;
		for (i = low; i < high - 1; i++) {
			z = nums[i];
			if (i > low && z == nums[i - 1]) // 避免重复
				continue;

			if (z + 2 * max < target) continue; // z太小
			if (3 * z == target) // z太大
				break;
			if (3 * z == target) {
				if (i + 1 < high && nums[i + 2] == z) {
					fourSumList.add(Arrays.asList(z1, z, z, z));
				}
				break;
			}
			twoSumForFourSum(nums, target - z, i + 1, high, fourSumList, z1, z);
		}

	}

	public void twoSumForFourSum(int[] nums, int target, int low, int high, List<List<Integer>> fourSumList, int z1, int z2) {
		if (low >= high) return;
		if (2 * nums[low] > target || 2 * nums[high] < target) return;

		int i = low, j = high, sum, x;
		while (i < j) {
			sum = nums[i] + nums[j];
			if (sum == target) {
				fourSumList.add(Arrays.asList(z1, z2, nums[i], nums[j]));

				x = nums[i];
				while (++i < j && x == nums[i]) // 避免重复
					;
				x = nums[j];
				while (i < --j && x == nums[j])// 避免重复
					;

			}
			if (sum < target) i++;
			if (sum > target) j--;
		}
		return;
	}
}
