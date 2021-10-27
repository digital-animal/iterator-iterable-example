package com.zahid;

import java.util.Iterator;
import com.zahid.iterable.EfficientList;

public class EfficientListExample {
	public static void main(String[] args) {
		EfficientList<String> efl = new EfficientList<>();

		efl.add("Alex");
		efl.add("Lee");
		efl.add("Cooper");
		efl.add("David");
		efl.add("John");
		efl.add("Smith");

		System.out.println(efl);
		System.out.println(efl.size());

		for(String e: efl) {
			System.out.print(e + " ");
		}
		System.out.println();

		Iterator<String> it = efl.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		efl.forEach(e -> System.out.print(e + " "));	
		System.out.println();	

	}
}