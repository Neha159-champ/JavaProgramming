package collectionprogrammes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 45, 3 };
		Set<Integer> s = new LinkedHashSet<Integer>();// []

		for (int i : arr) {

			s.add(i);
		}
		System.out.println(s);
	}
}
