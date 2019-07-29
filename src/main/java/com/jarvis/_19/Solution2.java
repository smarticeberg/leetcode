package com.jarvis._19;

import com.jarvis._19.Solution.ListNode;

public class Solution2 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new Solution().new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;

		// 先让first先跑与second节点间有n个节点的距离
		for (int i = 1; i <= n + 1; i++) {
			first = first.next;
		}

		// 移动first到最后
		while (first != null) {
			first = first.next;
			second = second.next;
		}

		second.next = second.next.next;
		return dummy.next;
	}
}
