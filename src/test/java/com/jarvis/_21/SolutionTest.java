package com.jarvis._21;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._21.Solution.ListNode;
import com.jarvis._21.Solution;

public class SolutionTest {
	ListNode head1 = new Solution().new ListNode(1);
	ListNode head2 = new Solution().new ListNode(1);

	@Before
	public void assignment() {
		head1.next = new Solution().new ListNode(2);
		head1.next.next = new Solution().new ListNode(4);
		head2.next = new Solution().new ListNode(3);
		head2.next.next = new Solution().new ListNode(4);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution().mergeTwoLists(head1, head2);

		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
