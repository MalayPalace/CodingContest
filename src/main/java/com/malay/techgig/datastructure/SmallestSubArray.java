/***********************************
 * AlgoSolutions Project
 * Filename: SmallestSubArray.java
 * Author : malay
 * Date : 18-Apr-2021
 * 
 **********************************/
package com.malay.techgig.datastructure;

import java.util.Scanner;

public class SmallestSubArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		if (length < 1 || length > 100000) {
			System.out.println("Invalid Input");
			System.exit(0);
		}

		s.nextLine();
		int[] arr = new int[length];
		int i = 0;
		do {
			String str = s.nextLine();

			if (str != null && str.trim().length() > 0) {
				String[] arrayStr = str.split(" ");
				for (String v : arrayStr) {
					arr[i++] = Integer.parseInt(v);
				}
			}
		} while (i < length);

		int value = s.nextInt();
		s.nextLine();

		int sizeOfArray = getSmallestSubArrayGreaterThanValue(arr, length, value);
		System.out.println("Answer:" + sizeOfArray);

		s.close();
	}

	private static int getSmallestSubArrayGreaterThanValue(int[] arr, int length, int value) {
		int size = 0;

		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < length; j++) {

				int count = i;
				int index = j;
				int sum = 0;

				// Not enough elements
				if ((j + i) > length) {
					break;
				}

				while (count > 0) {
					sum += arr[index];
					count--;
					index++;
				}
				// System.out.println(sum);
				if (sum > value) {
					return i;
				}
			}
		}
		return size;
	}
}
