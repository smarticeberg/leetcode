package com.jarvis._7;

import org.junit.Test;

import com.jarvis._7.Solution;

public class SolutionTest {

	@Test
	public void testSolution1() {
		System.out.println(new Solution().reverse(120));
	}
	
	@Test
	public void testSolution2() {
		System.out.println(new Solution2().reverse(2147483647));
	}
}
