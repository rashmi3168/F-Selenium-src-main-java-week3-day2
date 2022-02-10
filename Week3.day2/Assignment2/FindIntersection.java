package week3.day2.assigments;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		Set<Integer> a = new LinkedHashSet<Integer>();
		Set<Integer> b = new LinkedHashSet<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		System.out.println("First Array : "+a);
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		System.out.println("Second Array : "+b);
		a.retainAll(b);
		System.out.println("Intersection: "+a);

	}

}
