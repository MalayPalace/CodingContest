/***********************************
 * AlgoSolutions Project
 * Filename: CountBigger.java
 * Author : malay
 * Date : 19-Jul-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountBigger {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		if (length < 1 || length > 1000) {
			System.out.print("Invalid Input");
			System.exit(0);
		}
		s.nextLine();
		String arrayStr = s.nextLine();
		int num = s.nextInt();

		List<Integer> arr = getIntegerArrayFromStr(arrayStr);

		int count = 0;
		for (int i : arr) {
			if (i > num) {
				count++;
			}
		}
		System.out.print(count);

		s.close();
	}

	private static List<Integer> getIntegerArrayFromStr(String str) {
		List<Integer> result = new ArrayList<Integer>();
		if (str != null && str.trim().length() > 0) {
			String[] arrayStr = str.split(" ");
			for (String v : arrayStr) {
				Integer value = Integer.parseInt(v);
				if (value < 0 || value > 1000) {
					System.out.print("Invalid Input");
					System.exit(0);
				}
				result.add(value);
			}
		}
		return result;
	}
}
