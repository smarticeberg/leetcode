package com.jarvis._24;

public class Solution2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			ListNode next = cur.next.next;
			cur.next.next = cur;
			pre.next = cur.next;
			if (next != null && next.next != null) cur.next = next.next;
			else
				cur.next = next;
			pre = cur;
			cur = next;
		}
		return dummy.next;
	}
}
