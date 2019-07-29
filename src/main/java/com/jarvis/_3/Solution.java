package com.jarvis._3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		int length=s.length();
		int ans=0;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (allUnique(s, i, j)) ans=Math.max(ans, j-i);
			}
		}
		return ans;
	}

	public boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<Character>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) return false;
			set.add(ch);
		}
		return true;
	}
}
