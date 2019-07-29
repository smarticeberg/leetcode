package com.jarvis._6;

public class Solution2 {

	public String convert(String s, int numRows) {
		int length = s.length();
		if (length == 0 || numRows <= 1)
			return s;

		String[] ans = new String[length];

		int row = 0;
		int delta = 1;
		for (int i = 0; i < length; i++) {
			ans[row] += s.charAt(i);
			row += delta;
			if (row >= numRows) {
				row = numRows - 2;
				delta = -1;
			}
			if (row < 0) {
				delta = 1;
				row = 1;
			}
		}
		String retstr = "";
		for (int i = 0; i < numRows; i++) {
			retstr += ans[i];
		}
		return retstr;
	}
}
