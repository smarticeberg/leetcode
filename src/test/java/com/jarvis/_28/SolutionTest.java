package com.jarvis._28;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution1() {
		int index = new Solution().strStr("helloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejcfsdhuaishisuadhuiehiuehelloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejchelloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejc", "slsoejcf");
		System.out.println(index);
	}
	
	@Test
	public void testSolution2() {
		int index = new Solution2().strStr("helloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejcfsdhuaishisuadhuiehiuehelloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejchelloaoaoaoaoeeeeeeoeosloeoeleodleossoeoeoslsoejc", "slsoejcf");
		System.out.println(index);
	}
}
