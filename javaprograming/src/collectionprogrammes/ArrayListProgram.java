package collectionprogrammes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();// []
		l.add(10);// [10]
		l.add(20);// [10,20]

		Iterator<Integer> l1 = l.iterator();// l1 will point towards --->[10,20]
		List<Integer> output = new ArrayList<Integer>();// []
		while (l1.hasNext()) {// if element exists it will return true
			output.add(l1.next() + 10);//

		}

		System.out.println(output);

	}
}
