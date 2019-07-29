package com.jarvis._3;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

	public int lengthOfLongestSubstring(String s) {
		int length = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int j = 0, i = 0; j < length; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}
}
