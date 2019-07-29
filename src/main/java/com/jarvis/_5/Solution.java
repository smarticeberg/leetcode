package com.jarvis._5;

public class Solution {

	public String longestPalindrome(String s) {
		int length = s.length();
		int maxLength = 0;
		int maxStart = 0;
		// i 字符串长度
		for (int i = 0; i < length; i++) {
			// j 字符串的起始位置
			for (int j = 0; j < length - i; j++) {
				// 判断是否是回文串
				if (isPalindrome(s, i, j) && (i + 1) > maxLength) {
					maxLength = i + 1;
					maxStart = j;
				}
			}
		}
		return s.substring(maxStart, maxStart + maxLength);
	}

	private boolean isPalindrome(String s, int i, int j) {
		int left = j;
		int right = j + i;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
