package com.jarvis._24;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._24.Solution2.ListNode;

public class SolutionTest2 {
	ListNode head1 = new Solution2().new ListNode(1);

	@Before
	public void assignment() {
		head1.next = new Solution2().new ListNode(2);
		head1.next.next = new Solution2().new ListNode(3);
		head1.next.next.next = new Solution2().new ListNode(4);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution2().swapPairs(head1);

		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
