package com.jarvis._5;

import org.junit.Test;

public class SolutionTest {
	@Test
	public void testSolution1() {
		System.out.println(new Solution().longestPalindrome("cbbd"));
	}
	
	@Test
	public void testSolution2() {
		System.out.println(new Solution2().longestPalindrome1("babad"));
	}
	
	@Test
	public void testSolution3() {
		System.out.println(new Solution3().longestPalindrome("cbbd"));
	}
}
