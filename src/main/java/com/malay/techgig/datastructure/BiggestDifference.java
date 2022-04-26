/***********************************
 * AlgoSolutions Project
 * Filename: BiggestDifference.java
 * Author : malay
 * Date : 18-Apr-2021
 * 
 **********************************/
package com.malay.techgig.datastructure;

import java.util.Scanner;

public class BiggestDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		if (length < 1 || length > 1000) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		s.nextLine();
		String input = s.nextLine();
		int[] arr = getIntegerArrayFromStr(input, length);
		int biggest = getBiggestDifference(arr, length);
		System.out.println(biggest);

		s.close();
	}

	private static int getBiggestDifference(int[] arr, int length) {
		int largest = -1;
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return largest - smallest;
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
