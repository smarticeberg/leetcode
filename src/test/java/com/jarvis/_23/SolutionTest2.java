package com.jarvis._23;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._23.Solution2.ListNode;

public class SolutionTest2 {
	ListNode head1 = new Solution2().new ListNode(1);
	ListNode head2 = new Solution2().new ListNode(1);
	ListNode head3 = new Solution2().new ListNode(2);

	@Before
	public void assignment() {
		head1.next = new Solution2().new ListNode(4);
		head1.next.next = new Solution2().new ListNode(5);
		head2.next = new Solution2().new ListNode(3);
		head2.next.next = new Solution2().new ListNode(4);
		head3.next = new Solution2().new ListNode(6);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution2().mergeKLists(new ListNode[] { head1, head2, head3 });

		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
