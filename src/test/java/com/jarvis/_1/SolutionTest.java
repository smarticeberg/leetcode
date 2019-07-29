package com.jarvis._1;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution1() {
		System.out.println(Arrays.toString(Solution.twosum(new int[] { 2, 7, 11, 15 }, 9)));
	}

	@Test
	public void testSolution2() {
		System.out.println(Arrays.toString(Solution2.twosum(new int[] { 7, 2, 15, 11 }, 17)));
	}

	@Test
	public void testSolution3() {
		System.out.println(Arrays.toString(Solution3.twosum(new int[] { 7, 15, 2, 11 }, 17)));
	}
}
