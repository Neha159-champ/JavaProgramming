package collectionprogrammes;

import java.util.ArrayList;
import java.util.Iterator;

public class ModifyingArrayListElements {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		// for (int i : a) {
		// System.out.println(i);
		// }
		System.out.println(a.size());
		System.out.println(a.remove(0));
		System.out.println(a);
		// System.out.println(a.remove(0));
		System.out.println();
		System.out.println(a.remove(Integer.valueOf(40)));
		System.out.println(a);
	//	System.out.println(a.remove(10));
		// By UsingString
		/*
		 * ArrayList<String> s = new ArrayList<>(); s.add("neha"); s.add("alok"); for
		 * (String i : s) { System.out.println(i); } System.out.println(s.size());
		 * //System.out.println(s.remove(0));//neha System.out.println(s);//alok
		 * //System.out.println(s.remove(0));//alok
		 * System.out.println(s.remove("neha"));
		 * 
		 * System.out.println(s);
		 * 
		 */
		//iterating arraylist using iterator
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {
			System.out.println("by using iterator:"+(it.next()+10));
			//int i1=it.next();
		//	System.out.println("adding:"+(i1+10));
			
		}
			

	}
}
