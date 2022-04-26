/***********************************
 * AlgoSolutions Project
 * Filename: BinarySearchRecursive.java
 * Author : malay
 * Date : 25-Oct-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();

		// Taking the Inputs
		int n = 0;
		int[] arr = new int[length];
		while (n < length) {
			int num = s.nextInt();
			arr[n] = num;
			n++;
		}

		int find = s.nextInt();
		s.close();
		
		// get result through binary search
		boolean result = binarySearchRecursive(arr, 0, length - 1, find);

		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean binarySearchRecursive(int[] arr, int low, int high, int key) {
		if (low > high) {
			return false;
		}

		int mid = low + (high - low) / 2;
		if (arr[mid] == key) {
			return true;
		} else if (arr[mid] < key) {
			return binarySearchRecursive(arr, mid + 1, high, key);
		} else {
			return binarySearchRecursive(arr, low, mid - 1, key);
		}
	}
}
