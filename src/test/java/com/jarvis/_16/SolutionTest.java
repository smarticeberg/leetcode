package com.jarvis._16;

import org.junit.Test;

import com.jarvis._16.Solution;

public class SolutionTest {

	private int[] data = new int[] { -1, 2, 1, -4 };

	@Test
	public void testSolution1() {
		System.out.println(new Solution().threeSumClosest(data, 1));
	}
}
