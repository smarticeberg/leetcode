package com.jarvis._7;

public class Solution2 {

	public int reverse(int x) {

		if (x == Integer.MIN_VALUE)
			return 0;

		int num = Math.abs(x);
		int result = 0;
		while (num != 0) {
			if (result > (Integer.MAX_VALUE - num % 10) / 10)
				return 0;
			result = result * 10 + num % 10;
			num /= 10;
		}
		return x > 0 ? result : -result;
	}
}
