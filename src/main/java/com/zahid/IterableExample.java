package com.zahid;

import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.lang.Iterable;

public class IterableExample {
	public static void main(String[] args) {
		List<Integer> numberList = new LinkedList<>();
		numberList.add(7);
		numberList.add(19);
		numberList.add(29);
		numberList.add(37);
		numberList.add(47);
		numberList.add(59);
		numberList.add(57);
		numberList.add(79);
		numberList.add(87);
		numberList.add(97);

		Collection<Integer> numberCollection = numberList;
		Iterable<Integer> numberIterable = numberCollection;

		for (Integer num : numberList ) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println(numberList);
		System.out.println(numberCollection);
		System.out.println(numberIterable);


	}
}