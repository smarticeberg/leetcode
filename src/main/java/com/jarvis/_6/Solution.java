package com.jarvis._6;

public class Solution {

	public String convert(String s, int numRows) {
		int length = s.length();
		if (length == 0 || numRows <= 1)
			return s;

		// 计算分区的大小，最后一个分区可能充满也可能不满，所以向上取整。
		int blockSize = (int) Math.ceil((double) length / (2 * numRows - 2));
		// 分区内有多少元素，竖行是numRows个，斜行去掉头尾两个元素
		int blockNums = 2 * numRows - 2;
		StringBuffer sb = new StringBuffer();
		int index1 = 0, index2 = 0;
		// 按行扫描输出
		for (int iR = 1; iR <= numRows; iR++) {
			// 扫描行的不同分区
			for (int jBlock = 1; jBlock <= blockSize; jBlock++) {
				// index1为第jBlock块的第iR行的竖直索引
				index1 = (jBlock - 1) * blockNums + iR;
				if (index1 <= length) {
					sb.append(s.charAt(index1 - 1));
				}
				// 不是第一行也不是最后一行，因为只有其余行才需要计算斜值索引
				if ((iR != 1) && (iR != numRows)) {
					index2 = (jBlock - 1) * blockNums + 2 * numRows - iR;
					if (index2 <= length) {
						sb.append(s.charAt(index2 - 1));
					}
				}
			}
		}
		return sb.toString();
	}
}
