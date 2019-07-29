package com.jarvis._25;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._25.Solution;
import com.jarvis._25.Solution.ListNode;

public class SolutionTest {
	ListNode head1 = new Solution().new ListNode(1);

	@Before
	public void assignment() {
		head1.next = new Solution().new ListNode(2);
		head1.next.next = new Solution().new ListNode(3);
		head1.next.next.next = new Solution().new ListNode(4);
		head1.next.next.next.next = new Solution().new ListNode(5);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution().reverseKGroup(head1,4);

		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
