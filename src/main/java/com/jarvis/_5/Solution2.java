package com.jarvis._5;

public class Solution2 {

	public String longestPalindrome(String s) {
		int maxLength = 0;
		int maxStart = 0;
		int length = s.length();
		boolean[][] dp = new boolean[length][length];

		// 字符串增量
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length - i; j++) {
				if (i == 0) {
					// 如果增量长度为0，必定为回文
					dp[j][j + i] = true;
				} else if (s.charAt(j + i) == s.charAt(j)) {
					// 如果左右两端相等，那只要中心对称子字符串是回文就是回文
					dp[j][j + i] = dp[j + 1][j + i - 1];
				} else {
					dp[j][j + i] = false;
				}
				if (dp[j][j + i] && i > maxLength) {
					maxLength = i + 1;
					maxStart = j;
				}
			}
		}
		return s.substring(maxStart, maxStart + maxLength);
	}

	public String longestPalindrome1(String s) {
		if (s.length() <= 1)
			return s;
		int maxLength = 0;
		int maxStart = 0;
		int len = s.length();
		boolean[][] dp = new boolean[len][len];

		// i是字符串长度
		for (int i = 0; i < len; i++) {
			// j是字符串起始位置
			for (int j = 0; j < len - i; j++) {
				if (i <= 1) {
					// 如果字符串长度为0，必定为回文
					dp[j][j + i] = true;
				} else if (s.charAt(j + i) == s.charAt(j)) {
					// 如果左右两端相等，那只要中心对称子字符串是回文就是回文
					dp[j][j + i] = dp[j + 1][j + i - 1];
				} else {
					// 否则不是回文
					dp[j][j + i] = false;
				}
				if (dp[j][j + i] && i > maxLength) {
					maxLength = i + 1;
					maxStart = j;
				}
				System.out.println("i:" + i + " j:" + j + " dp:" + dp[j][j + i]);
			}
		}
		return s.substring(maxStart, maxStart + maxLength);
	}

}
