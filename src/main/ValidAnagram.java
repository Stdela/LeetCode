package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "hola";
		String t = "aloh";
		isAnagram(s, t);

	}

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		List<String> one = new ArrayList<>(s.length());
		for (int i = 0; i < s.length(); i++) {
			one.add(String.valueOf(s.charAt(i)));
		}
		for (int i = 0; i < t.length(); i++) {
			if (one.contains(String.valueOf(t.charAt(i)))) {
				one.remove(String.valueOf(t.charAt(i)));

			} else {
				return false;
			}

		}
		if (one.isEmpty()) {
			return true;
			
		}
		return false;
	}

}
