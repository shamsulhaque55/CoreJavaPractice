package com.shamsulhaque.strings;

import java.util.Hashtable;
import java.util.Scanner;

public class RecurringChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		if (input != null && input.trim().length() > 0) {
			Hashtable<Integer, String> occuredTable = new Hashtable<>();
			for (int i = 0; i < input.length(); i++) {
				Integer hashCode = Integer.valueOf(input.charAt(i));
				if (occuredTable.containsKey(hashCode)) {
					System.out.println("First Recurring Character is : "+input.charAt(i));
					break;
				} else if (input.charAt(i) != ' '){
					occuredTable.put(hashCode, String.valueOf(input.charAt(i)));
				}
				if (i == input.length() -1) {
					System.out.println("No Recurring Characters in the string");
				}
			}
		}

	}
}
