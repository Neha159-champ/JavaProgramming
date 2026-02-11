package collectionprogrammes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// [10,20]------>input list
// [20,30] ----->output list

public class AddingCollectionElements {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);

		// System.out.println(addElement(l));

		// l->[10,20]
		Iterator<Integer> l2 = l.iterator();
		// l2 ---> [10,20]

		List<Integer> addingElement = new LinkedList<Integer>(); // empty list of name addingElement []
		while (l2.hasNext()) {

			addingElement.add(l2.next() + 10);
			System.out.println(addingElement);

		}

	}

}
