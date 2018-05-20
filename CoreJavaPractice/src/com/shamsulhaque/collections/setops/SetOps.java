package com.shamsulhaque.collections.setops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOps {

	public static void main(String[] args) {
		List<Integer> baseList1 = new ArrayList<>();
		baseList1.add(1);
		baseList1.add(2);
		baseList1.add(3);
		baseList1.add(4);
		List<Integer> tempBaseList1 = new ArrayList<>();
		tempBaseList1.addAll(baseList1);
		List<Integer> baseList2 = new ArrayList<>();
		baseList2.add(3);
		baseList2.add(4);
		baseList2.add(5);
		baseList2.add(6);
		baseList1.retainAll(baseList2);
		tempBaseList1.removeAll(baseList1);
		baseList2.removeAll(baseList1);
		System.out.println("Common        : "+baseList1);
		System.out.println("List1 - List2 : "+ tempBaseList1);
		System.out.println("List2 - List1 : "+ baseList2);
		
	}

}
