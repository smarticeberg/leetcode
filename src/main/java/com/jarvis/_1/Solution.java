package com.jarvis._1;

public class Solution {

	public static int[] twosum(int[] numbers, int target) {
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == target - numbers[j]) {
					result[0] = numbers[i];
					result[1] = numbers[j];
				}
			}
		}
		return result;
	}
}
