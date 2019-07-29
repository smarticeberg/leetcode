package com.jarvis._19;

import org.junit.Before;
import org.junit.Test;

import com.jarvis._19.Solution.ListNode;

public class SolutionTest {
	ListNode head = new Solution().new ListNode(1);

	@Before
	public void assignment() {
		head.next = new Solution().new ListNode(2);
		head.next.next = new Solution().new ListNode(3);
		head.next.next.next = new Solution().new ListNode(4);
		head.next.next.next.next = new Solution().new ListNode(5);
	}

	@Test
	public void testSolution1() {
		ListNode node = new Solution().removeNthFromEnd(head, 2);
		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
		
	}
	
	@Test
	public void testSolution2() {
		ListNode node = new Solution2().removeNthFromEnd(head, 2);
		while (node.next != null) {
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
		
	}
}
