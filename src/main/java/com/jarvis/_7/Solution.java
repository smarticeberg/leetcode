package com.jarvis._7;

public class Solution {

	public int reverse(int x) {
		// 分离出x的数值部分和符号部分
		int y = Math.abs(x);
		int z = x == y ? 1 : -1;

		long result = 0;
		while (y > 0) {
			result *= 10;
			result += y % 10;
			y /= 10;
		}

		// 判断是否越界
		if (z * result > Integer.MAX_VALUE || z * result < Integer.MIN_VALUE)
			return 0;

		return (int) (z * result);
	}
}
