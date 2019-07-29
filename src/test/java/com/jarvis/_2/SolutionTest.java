package com.jarvis._2;

import org.junit.Test;

import com.jarvis._2.Solution.ListNode;

public class SolutionTest {

	@Test
	public void testSolution1() {
		ListNode node1 = new Solution().new ListNode(2);
		node1.next = new Solution().new ListNode(4);
		node1.next.next = new Solution().new ListNode(3);

		ListNode node2 = new Solution().new ListNode(5);
		node2.next = new Solution().new ListNode(6);
		node2.next.next = new Solution().new ListNode(4);

		ListNode finalNode = new Solution().addTwoNumbers(node1, node2);
		while (finalNode != null) {
			System.out.println(finalNode.val);
			finalNode = finalNode.next;
		}
	}
}
