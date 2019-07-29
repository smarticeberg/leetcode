package com.jarvis._15;

import org.junit.Test;

import com.jarvis._15.Solution;

public class SolutionTest {
	private int[] datas = new int[] { -1, 0, 1, 2, -1, -4 };

	@Test
	public void testSolution1() {
		System.out.println(new Solution().threeSum(datas));
	}
}
