package com.jarvis._5;

public class Solution3 {
	String longest = "";

	public String longestPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			// 计算奇数子字符串
			helper(s, i, 0);
			// 计算偶数子字符串
			helper(s, i, 1);
		}
		return longest;
	}

	private void helper(String s, int idx, int offset) {
		int left = idx;
		int right = idx + offset;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		// 截取出当前最长的子串
		String currentLongest = s.substring(left + 1, right);
		// 判断是否比全局最长的要长
		if (currentLongest.length() > longest.length()) {
			longest = currentLongest;
		}
	}
}
