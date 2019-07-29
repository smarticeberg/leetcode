package com.jarvis._3;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

	public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int ans = 0, i = 0, j = 0;
		Set<Character> set = new HashSet<Character>();
		while (i < length && j < length) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
