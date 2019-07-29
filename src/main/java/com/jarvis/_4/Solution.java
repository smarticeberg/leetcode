package com.jarvis._4;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;

		// 确定m<=n
		if (m > n) {
			// 交换数组
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;

			// 交换数组长度
			int tmp = m;
			m = n;
			n = tmp;
		}

		int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;

		// 二分法查找
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halfLen - i;
			if (i < iMax && nums2[j - 1] > nums1[i]) {
				// i 太小
				iMin = iMin + 1;
			} else if (i > iMin && nums1[i - 1] > nums2[j]) {
				// i 太大
				iMax = iMax - 1;
			} else {
				// i 正好
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = nums2[j - 1];
				} else if (j == 0) {
					maxLeft = nums1[i - 1];
				} else {
					maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
				}
				if ((m + n) % 2 == 1) {
					return maxLeft;
				}

				int minRight = 0;
				if (i == m) {
					minRight = nums2[j];
				} else if (j == n) {
					minRight = nums1[i];
				} else {
					minRight = Math.min(nums2[j], nums1[i]);
				}

				return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}
}
