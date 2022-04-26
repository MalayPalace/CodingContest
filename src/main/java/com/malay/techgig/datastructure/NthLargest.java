/***********************************
 * AlgoSolutions Project
 * Filename: ThirdLastest.java
 * Author : malay
 * Date : 17-Apr-2021
 * 
 **********************************/
package com.malay.techgig.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Efficient finding 3rd largest in one pass
 * 
 */
public class NthLargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		if (length < 3 || length > 1000) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		s.nextLine();
		String input = s.nextLine();
		int[] arr = getIntegerArrayFromStr(input, length);
		int third = getThirdLargest(arr, length);
		int third2 = getNLargest(arr, length, 2);
		System.out.println(third);
		System.out.println(third2);

		s.close();
	}

	private static int getThirdLargest(int[] arr, int length) {
		int first = -1;
		int second = -1;
		int third = -1;

		for (int i = 0; i < length; i++) {

			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			} else {
				// do nothing
			}
		}
		return third;
	}

	private static int getNLargest(int[] arr, int length, int n) {
		LinkedList<Integer> hold = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			hold.addLast(-1);
		}

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < n; j++) {
				if (arr[i] > hold.get(j)) {
					hold.add(j, arr[i]);
					hold.removeLast();
					break;
				}
			}
		}
		return hold.get(n - 1);
	}

	private static int[] getIntegerArrayFromStr(String str, int length) {
		int[] result = new int[length];
		int i = 0;
		if (str != null && str.trim().length() > 0) {
			String[] arrayStr = str.split(" ");
			for (String v : arrayStr) {
				result[i++] = Integer.parseInt(v);
			}
		}
		return result;
	}
}
