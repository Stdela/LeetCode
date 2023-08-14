package main;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		/*
		 * Given an integer array nums, return true if any value appears at least twice
		 * in the array, and return false if every element is distinct.
		 */
		Integer[] array = { 1, 2, 3, 5, 6, 1 };

		containsDuplicate(array);

	}

	private static boolean containsDuplicate(Integer[] nums) {

		Set<Integer> notRepeatedIntegers = new HashSet<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			if (!notRepeatedIntegers.add(nums[i])) {
				return true;
			}

		}
		return false;
	}

}
