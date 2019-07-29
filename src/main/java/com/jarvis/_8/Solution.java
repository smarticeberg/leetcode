package com.jarvis._8;

public class Solution {

	public int myAtoi(String str) {

		// 1.空字符串
		if (str == null || str.length() == 0)
			return 0;

		// 2.去除空格
		str.trim();

		// 3. +/- 符号
		boolean positive = true;
		int i = 0;
		if (str.charAt(0) == '+') {
			i++;
		} else if (str.charAt(0) == '-') {
			positive = false;
			i++;
		}

		// 4.计算真实的值
		double tmp = 0;
		for (; i < str.length(); i++) {
			int digit = str.charAt(i) - '0';
			if (digit < 0 || digit > 9)
				break;

			// 处理极值
			if (positive) {
				tmp = 10 * tmp + digit;
				if (tmp > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			} else {
				tmp = 10 * tmp - digit;
				if (tmp < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
		}

		int returnValue = (int) tmp;
		return returnValue;
	}
}
