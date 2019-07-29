package com.jarvis._23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;

		PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				if (o1.val < o2.val) return -1;
				else if (o1.val == o2.val) return 0;
				else
					return 1;
			}
		});

		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) pq.add(lists[i]);
		}

		ListNode dummy = new ListNode(-1);
		ListNode tail = dummy;
		while (!pq.isEmpty()) {
			tail.next = pq.poll();
			tail = tail.next;
			// 将下一个节点添加进来
			if (tail.next != null) pq.add(tail.next);
		}

		return dummy.next;
	}
}
