package com.jarvis._10;

import org.junit.Test;

import com.jarvis._10.Solution;

public class SolutionTest {
	@Test
	public void testSolution1() {
		System.out.println(new Solution().isMatch("aab", "c*a*b"));
	}
	
	@Test
	public void testSolution2() {
		System.out.println(new Solution2().isMatch("aab", "c*a*b"));
	}
}
