package com.jarvis._17;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	private List<String> result;

	public List<String> letterCombinations(String digits) {
		// 建立对应的映射表
		String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		StringBuilder tmp = new StringBuilder();
		result = new LinkedList<String>();
		helper(table, 0, tmp, digits);
		return result;
	}

	private void helper(String[] table, int idx, StringBuilder tmp, String digits) {
		if (idx == digits.length()) {
			// 找到一种结果，加入到结果集中
			if (tmp.length() != 0)
				result.add(tmp.toString());
		} else {
			// 找出当前位数字对应可能的字母
			String candidates = table[digits.charAt(idx) - '0'];
			// 对每个可能的字母进行搜索
			for (int i = 0; i < candidates.length(); i++) {
				tmp.append(candidates.charAt(i));
				helper(table, idx + 1, tmp, digits);
				tmp.deleteCharAt(tmp.length() - 1);
			}
		}
	}
}
