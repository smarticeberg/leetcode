package com.jarvis._3;

import org.junit.Test;

public class SolutionTest {
	@Test
	public void testSolution1() {
		System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
	}
	@Test
	public void testSolution2() {
		System.out.println(new Solution2().lengthOfLongestSubstring("abcabcbb"));
	}
	@Test
	public void testSolution3() {
		System.out.println(new Solution3().lengthOfLongestSubstring("abcabcbb"));
	}
}
