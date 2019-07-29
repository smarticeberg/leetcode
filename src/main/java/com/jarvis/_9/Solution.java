package com.jarvis._9;

public class Solution {

	public boolean isPalindrome(int x) {
		// 负数和整十的
		if (x < 0 || (x > 0 && x % 10 == 0))
			return false;

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}

		return x == revertedNumber || x == revertedNumber / 10;
	}

}
