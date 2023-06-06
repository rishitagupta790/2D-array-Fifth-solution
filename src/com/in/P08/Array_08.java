package com.in.P08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_08 {
	public static int[] findOriginalArray(int[] changed) {
		int n = changed.length;
		if (n % 2 != 0) {
			return new int[] {};
		}

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : changed) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> originalList = new ArrayList<>();
		for (int num : changed) {
			if (countMap.getOrDefault(num, 0) == 0) {
				continue;
			}
			int doubledNum = num * 2;
			if (countMap.getOrDefault(doubledNum, 0) == 0) {
				return new int[] {};
			}
			originalList.add(num);
			countMap.put(num, countMap.get(num) - 1);
			countMap.put(doubledNum, countMap.get(doubledNum) - 1);
		}

		int[] original = new int[originalList.size()];
		for (int i = 0; i < originalList.size(); i++) {
			original[i] = originalList.get(i);
		}

		return original;
	}

	public static void main(String[] args) {
		int[] changed = { 1, 3, 4, 2, 6, 8 };

		int[] original = findOriginalArray(changed);
		for (int num : original) {
			System.out.print(num + " ");
		}
	}
}
