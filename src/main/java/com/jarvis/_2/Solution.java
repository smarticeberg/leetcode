package com.jarvis._2;

public class Solution {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 存储结果
		ListNode newHead = new ListNode(0);
		// 进位
		int carry = 0;
		ListNode p1 = l1, p2 = l2, p3 = newHead;
		while (p1 != null || p2 != null || carry != 0) {
			if (p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			int digit = carry % 10;
			p3.next = new ListNode(digit);
			p3 = p3.next;
			carry /= 10;
		}
		return newHead.next;
	}
}
