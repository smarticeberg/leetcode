package com.jarvis._29;

public class Solution {

	public int divide(int dividend, int divisor) {
		// 除数为0，根据被除数的符号取Integer最大最小值
		if (divisor == 0) return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		// 被除数为0的情况，直接输出0。
		if (dividend == 0) return 0;
		// 被除数为Integer最小值且除数为-1时，结果会溢出，故取Integer最大值。
		if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
		// 判断输出结果的符号
		boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

		// 解决Integer.MIN_VALUE取绝对值溢出问题。
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);

		int result = 0;
		int multiple = 1;

		while ((ldivisor << 1) <= ldividend) {
			multiple <<= 1;
			ldivisor <<= 1;
		}

		while (multiple > 0) {
			if (ldividend >= ldivisor) {
				ldividend -= ldivisor;
				result += multiple;
			}
			multiple >>= 1;
			ldivisor >>= 1;
		}

		return isNegative ? -result : result;
	}
}
