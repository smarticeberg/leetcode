package com.jarvis._1;

import java.util.Arrays;

public class Solution2 {

	// 主要是要对数组使用Arrays.sort排序，排序对象需要实现Comparable接口
	class Pair implements Comparable<Pair> {
		// 值
		int number;
		// 下标
		int index;

		public Pair(int number, int index) {
			this.number = number;
			this.index = index;
		}

		@Override
		public int compareTo(Pair o) {
			return this.number - o.number;
		}

		@Override
		public String toString() {
			return "Pair [number=" + number + ", index=" + index + "]";
		}

	}

	public static int[] twosum(int[] numbers, int target) {
		// 处理完的结果集
		int[] result = new int[2];
		Pair[] pairs = new Pair[numbers.length];
		// 指针从左至右
		int index1 = 0;
		// 指针从右至左
		int index2 = numbers.length - 1;

		// 封装要处理的数组
		for (int i = 0; i < numbers.length; i++) {
			pairs[i] = new Solution2().new Pair(numbers[i], i);
		}
		// 数组排序(升序)
		Arrays.sort(pairs);

		while (index1 < index2) {
			if (pairs[index1].number + pairs[index2].number < target) {
				index1++;
			} else {
				if (pairs[index1].number + pairs[index2].number > target) {
					index2--;
				} else {
					if (pairs[index1].index < pairs[index2].index) {
						result[0] = pairs[index1].index;
						result[1] = pairs[index2].index;
					} else {
						result[1] = pairs[index1].index;
						result[0] = pairs[index2].index;
					}
					index1 = index2;
				}

			}
		}
		return result;
	}
}
