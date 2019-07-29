package com.jarvis._11;

import org.junit.Test;

public class SolutionTest {
	int[] inputs = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

	@Test
	public void testSolution1() {
		System.out.println(new Solution().maxArea(inputs));
	}
	
	@Test
	public void testSolution2() {
		System.out.println(new Solution2().maxArea(inputs));
	}
}
