package com.jarvis._14;

import org.junit.Test;

import com.jarvis._14.Solution;

public class SolutionTest {

	private String[] datas = new String[] { "leets", "leetcode", "leet", "leeds" };

	@Test
	public void testSolution1() {
		System.out.println(new Solution().longestCommonPrefix(datas));
	}

	@Test
	public void testSolution2() {
		System.out.println(new Solution2().longestCommonPrefix(datas));
	}
	
	@Test
	public void testSolution3() {
		System.out.println(new Solution3().longestCommonPrefix(datas));
	}
	
	@Test
	public void testSolution4() {
		System.out.println(new Solution4().longestCommonPrefix(datas));
	}
}
