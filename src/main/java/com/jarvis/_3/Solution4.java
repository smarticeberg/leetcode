package com.jarvis._3;

public class Solution4 {

	public int lengthOfLongestSubstring(String s) {
		int length = s.length(), ans = 0;
		int[] index = new int[128];

		for (int j = 0, i = 0; j < length; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans, j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}
}
