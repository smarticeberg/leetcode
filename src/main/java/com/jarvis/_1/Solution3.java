package com.jarvis._1;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

	public static int[] twosum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x)) {
				result[0] = map.get(target - x);
				result[1] = i;
			} else {
				map.put(x, i);
			}
		}
		return result;
	}
}
