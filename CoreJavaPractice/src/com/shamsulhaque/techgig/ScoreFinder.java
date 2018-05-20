package com.shamsulhaque.techgig;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ScoreFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		if (len > 0) {
			int [] input = new int[len+1];
			input [0] = len;
			for (int i = 1; i <= len ; i ++) {
				input [i] = sc.nextInt();
			}
			System.out.println(new ScoreFinder().findScore(input));
		}
		sc.close();
	}
	
	private int findScore(int [] input) {
		Set<Integer> distinctMarks = new HashSet<>();
		if (input != null && input.length > 1) {
			int numOfSubjects = input[0];
			List<List<Integer>> allSubMarks = new LinkedList<>();
			for (int i = 1; i <= numOfSubjects; i++) {
				allSubMarks.add(ScoreFinder.perSubjectMarks(input[i]));
			}
			if(allSubMarks.size() > 1) {
				for (int i = 0 ; i < allSubMarks.size() ; i++) {
					List<Integer> sub1 = allSubMarks.get(i);
					for (Integer sub1Val : sub1) {
						for ( int m = 0; m < 6; m++) {
							int singleCombination = 0;
							for(int j = 0; j < allSubMarks.size(); j++) {
								if ( i != j) {
									singleCombination = singleCombination + sub1Val + allSubMarks.get(j).get(m);
								}
							}
							distinctMarks.add(singleCombination);
						}
						
					}
				}
			} else {
				return input[1] * 10;
			}
		}
		return distinctMarks.size();
	}
	private static List<Integer> perSubjectMarks(int cred) {
		List<Integer> val = new LinkedList<>();
		for (int i = 10 ; i >= 5; i--) {
			val.add(cred * i);
		}
		return val;
	}
}
