package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		/*
		 * Given an array of strings strs, group the anagrams together. You can return
		 * the answer in any order.
		 * 
		 * An Anagram is a word or phrase formed by rearranging the letters of a
		 * different word or phrase, typically using all the original letters exactly
		 * once.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: strs = ["eat","tea","tan","ate","nat","bat"] 
		 * Output:
		 * [["bat"],["nat","tan"],["ate","eat","tea"]] Example 2:
		 * 
		 * Input: strs = [""] Output: [[""]] Example 3:
		 * 
		 * Input: strs = ["a"] Output: [["a"]]
		 */
		String[] n = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(n);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		Arrays.sort(strs);
		Map<String,List<String>> test2 = new HashMap<>();
		
		List<List<String>> test = new ArrayList<>();
//		List<String> group = new ArrayList<>();
		
		for (String string : strs) {
			 char[] n2 =  string.toCharArray();
			Arrays.sort(n2);
			if (test2.containsKey(String.valueOf(n2))) {
				test2.get(String.valueOf(n2)).add(string);
			} else {
				List<String> group = new ArrayList<>();
				group.add(string);
				test2.put(String.valueOf(n2), group);
			}
			
		}
		test.addAll(test2.values());
		return test;

	}

}
