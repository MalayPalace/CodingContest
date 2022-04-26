/***********************************
 * AlgoSolutions Project
 * Filename: BinaryOccuranceSearch.java
 * Author : malay
 * Date : 17-Apr-2021
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccuranceSearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		if (length < 1 || length > 10) {
			System.out.print("Invalid Length");
			System.exit(0);
		}
		s.nextLine();

		for (int j = 0; j < length; j++) {
			String input1 = s.nextLine();
			List<Integer> inputs = getIntegerArrayFromStr(input1);
			if (inputs == null || inputs.size() != 2) {
				System.out.print("Invalid Input");
				System.exit(0);
			}
			int arrSize = inputs.get(0);
			if (arrSize < 1 || arrSize > 100) {
				System.out.print("Invalid Input");
				System.exit(0);
			}

			int noToFind = inputs.get(1);
			if (arrSize < 1 || arrSize > 1000) {
				System.out.print("Invalid Input");
				System.exit(0);
			}

			String arrStr = s.nextLine();
			List<Integer> arr = getIntegerArrayFromStr(arrStr);

			if (arr == null || arr.size() != arrSize) {
				System.out.print("Invalid Input");
				System.exit(0);
			}

			System.out.println(getOccurances(arr, arrSize, noToFind));
		}

		s.close();
	}

	private static int getOccurances(List<Integer> arr, int arrSize, int noToFind) {
		int count = 0;
		for (int i = 0; i < arrSize && arr.get(i) <= noToFind; i++) {
			if (arr.get(i) == noToFind) {
				count++;
			}
		}
		return count;
	}

	private static List<Integer> getIntegerArrayFromStr(String str) {
		List<Integer> result = new ArrayList<Integer>();
		if (str != null && str.trim().length() > 0) {
			String[] arrayStr = str.split(" ");
			for (String v : arrayStr) {
				Integer value = Integer.parseInt(v);
				result.add(value);
			}
		}
		return result;
	}
}
