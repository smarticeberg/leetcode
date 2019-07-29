package com.jarvis._25;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {

		if (head == null || head.next == null || k < 2) return head;

		ListNode next_group = head;
		for (int i = 0; i < k; i++) {
			if (next_group != null) {
				next_group = next_group.next;
			} else {
				return head;
			}
		}

		// next_group是下一组的head
		// reverse_next_group是nextgroup递归后的新头部
		ListNode reverse_next_group = reverseKGroup(next_group, k);
		ListNode prev = null, cur = head;
		while (cur != next_group) {
			ListNode next = cur.next;
			cur.next = prev != null ? prev : reverse_next_group;
			prev = cur;
			cur = next;
		}
		// prev为这个group的新的head
		return prev;
	}
}
