package com.in.P04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_04 {
	public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
		List<List<Integer>> answer = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		List<Integer> distinctInNums1 = new ArrayList<>();
		for (int num : set1) {
			if (!set2.contains(num)) {
				distinctInNums1.add(num);
			}
		}

		List<Integer> distinctInNums2 = new ArrayList<>();
		for (int num : set2) {
			if (!set1.contains(num)) {
				distinctInNums2.add(num);
			}
		}

		answer.add(distinctInNums1);
		answer.add(distinctInNums2);

		return answer;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		List<List<Integer>> answer = findDistinctIntegers(nums1, nums2);
		System.out.println(answer);
	}

}
