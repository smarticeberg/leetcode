package com.jarvis._25;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._25.Solution2;
import com.jarvis._25.Solution2.ListNode;

public class SolutionTest2 {
	ListNode head1 = new Solution2().new ListNode(1);

	@Before
	public void assignment() {
		head1.next = new Solution2().new ListNode(2);
		head1.next.next = new Solution2().new ListNode(3);
		head1.next.next.next = new Solution2().new ListNode(4);
		head1.next.next.next.next = new Solution2().new ListNode(5);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution2().reverseKGroup(head1, 2);

		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
