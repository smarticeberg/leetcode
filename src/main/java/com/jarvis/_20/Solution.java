package com.jarvis._20;

import java.util.Stack;

public class Solution {

	public boolean isValid(String s) {
		if (s == null || s.length() < 2) return false;

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') stack.push(')');
			else if (c == '{') stack.push('}');
			else if (c == '[') stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c) return false;
		}
		return stack.isEmpty();
	}

}
