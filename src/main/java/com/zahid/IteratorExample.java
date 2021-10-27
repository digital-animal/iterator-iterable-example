package com.zahid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class IteratorExample 
{
    public static void main( String[] args ) {
        // integer list
	System.out.println("# Integer List");
	List<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(9);
        numberList.add(2);
        numberList.add(3);
        numberList.add(5);

        numberList.forEach(num -> System.out.print(num + " "));
	System.out.println();
        
        Iterator<Integer> it = numberList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
       
	Iterator<Integer> itr = numberList.iterator();
	itr.forEachRemaining(e -> System.out.print(e + " "));
       	System.out.println();
       	System.out.println();
	
	// string list
	System.out.println("# Name List");
        List<String> nameList = new ArrayList<>();
        nameList.add("Alex");
        nameList.add("Lee");
        nameList.add("Cooper");
        nameList.add("Hannah");

        ListIterator<String> iter= nameList.listIterator();
	
	while (iter.hasNext()) {
            System.out.println(iter.next());
        }
	System.out.println();

        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
        System.out.println();

	// student map
	System.out.println("# Name Map");
	Map<Integer, String> studentMap = new HashMap<>();
	studentMap.put(101, "Alex");
	studentMap.put(102, "Lee");
	studentMap.put(103, "Cooper");
	studentMap.put(104, "John");
	studentMap.put(105, "David");

	Iterator<Map.Entry<Integer, String>> entryIterator = studentMap.entrySet().iterator();
	while(entryIterator.hasNext()) {
		Map.Entry<Integer, String> pair = entryIterator.next();
		System.out.println(pair.getKey() + ": " +pair.getValue());
	}
	System.out.println();

	studentMap.forEach((k,v) -> System.out.println(k + ": " + v));

    }
}
