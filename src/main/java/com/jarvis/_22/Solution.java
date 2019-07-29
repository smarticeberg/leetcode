package com.jarvis._22;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	List<String> result = new LinkedList<String>();

	public List<String> generateParenthesis(int n) {
		helper(n, 0, "");
		return result;
	}

	private void helper(int left, int right, String tmp) {
		// 如果左括号和右括号都放完了，则找到一个结果。
		if (left == 0 && right == 0) {
			result.add(tmp);
			return;
		}
		// 对于每个位置，我们有两种选择，要么放左括号，要么放右括号。
		if (left > 0) {
			helper(left - 1, right + 1, tmp + "(");
		}

		if (right > 0) {
			helper(left, right - 1, tmp + ")");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().generateParenthesis(3));
	}
}
