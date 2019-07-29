package com.jarvis._18;

import org.junit.Test;

import com.jarvis._18.Solution;

public class SolutionTest {

	private int[] data = new int[] { 1, 0, -1, 0, -2, 2 };

	@Test
	public void testSolution1() {
		System.out.println(new Solution().fourSum(data, 0));
	}
}
