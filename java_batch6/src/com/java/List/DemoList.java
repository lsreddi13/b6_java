package com.java.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(4);
		li.add(5);
		li.add(6);
//		li.add(7);
		System.out.println("size of the list : " + li.size());

		//
		Iterator itr = li.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("____________________________________________");
		int[] ar = new int[10];

		ar[0] = 4;
		ar[1] = 5;

		System.out.println("size of the array : " + ar.length);

		int i = 0;
		while (i < ar.length) {
			System.out.println(ar[i]);
			i++;
		}

	}

}
