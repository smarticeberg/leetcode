package com.jarvis._23;

public class Solution2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		return helper(lists, 0, lists.length - 1);
	}

	public ListNode helper(ListNode[] lists, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;
			// 将问题分解为2个更小的子问题：左边list的merge和右边list的merge，然后再把两个生成的解合并在一起。
			return merge(helper(lists, l, mid), helper(lists, mid + 1, r));
		}
		return lists[l];
	}

	public ListNode merge(ListNode n1, ListNode n2) {
		ListNode dummy = new ListNode(-1);
		ListNode cursor = dummy;
		while (n1 != null && n2 != null) {
			if (n1.val < n2.val) {
				cursor.next = n1;
				n1 = n1.next;
			} else {
				cursor.next = n2;
				n2 = n2.next;
			}
			cursor = cursor.next;
		}

		if (n1 != null) {
			cursor.next = n1;
		} else {
			cursor.next = n2;
		}
		return dummy.next;
	}
}
