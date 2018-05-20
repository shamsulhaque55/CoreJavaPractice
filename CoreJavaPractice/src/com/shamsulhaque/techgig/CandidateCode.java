package com.shamsulhaque.techgig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CandidateCode {
	/**
	 Monkeys in the garden (100 Marks)
In a garden, trees are arranged in a circular fashion with an equal distance between two adjacent trees. Height of trees may vary. Two monkeys live in that garden and they were very close to each other. One day they quarreled due to some misunderstanding. None of them were ready to leave the garden. But each one of them want that if the other want to meet him, it should take maximum possible time to reach him, given that they both live in the same garden. 

The conditions are that a monkey cannot directly jump from one tree to other. There are 30 trees in the garden. If the height of a tree is H, a monkey can live at any height from 0 to H. Lets say he lives at the height of K then it would take him K unit of time to climb down to the ground level. Similarly if a monkey wants to climb up to K height it would again take K unit of time. Time to travel between two adjacent tree is 1 unit. A monkey can only travel in circular fashion in the garden because there is a pond at the center of the garden. 

So the question is where should two monkeys live such that the traveling time between them is maximum while choosing the shortest path between them in any direction clockwise or anti-clockwise. You have to answer only the maximum traveling time.
Input Format
You will be given an integer array representing the height of trees in clock wise fashion.

Constraints
1 <= Total Trees <= 30
1 <= Height Of Trees(H) <= 10000

Output Format
You must print an integer which will be the maximum possible travel time.

Sample TestCase 1
Input
4
1
2
3
4
Output
8* */

	public static void main(String[] args) {
		int [] input = {4,1,2,3,4,4};
		int fMax = 0;
		int sMax = 0;
		List<Integer> fIndex = new ArrayList();
		List<Integer> sIndex = new ArrayList();
		int treeTravelMax = 0;
		if (input.length >=2) {
			treeTravelMax = input.length - 2;
		} else {
			treeTravelMax = 0;
		}
		int i = 1;
		fMax = input[1];
		sMax = input[1];
		while (i <=  2 && input.length >=3) {
			for (int j = 2; j < input.length; j ++) {
				if (i == 1) {
					if (fMax < input[j]) {
						fMax = input[j];
					}
				} else {
					if(sMax < input[j] && input[j] != fMax) {
						sMax = input[j];
					}
				}
			}
			i++;
		}
		System.out.println(fMax +"   -----    "+sMax + " ------ "+treeTravelMax);
		List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
		inputList.remove(0);
		fIndex = CandidateCode.findIndexes(inputList, fMax);
		sIndex = CandidateCode.findIndexes(inputList, sMax);
		System.out.println(fIndex + " -----   "+sIndex);
	}
	
	private static List<Integer> findIndexes(List<Integer>  input, int toFind) {
		List<Integer> indexes = new ArrayList();
		for (int i = 0; i < input.size(); i++) {
			if (toFind == input.get(i)) {
				indexes.add(i);
			}
		}
		return indexes;
	}
}
