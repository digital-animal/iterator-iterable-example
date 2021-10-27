package com.zahid.iterable;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class EfficientList<T> implements Iterable<T> {

	private List<T> elements;

	public EfficientList() {
		elements = new ArrayList<>();
	}

	public void add(T element) {
		this.elements.add(element);
	}

	public int size() {
		return this.elements.size();
	}

	@Override
	public Iterator<T> iterator() {
		return this.elements.iterator();
	}

}