/***********************************
 * AlgoSolutions Project
 * Filename: LinearSearch.java
 * Author : malay
 * Date : 19-Jul-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();

		int n = 0;
		int[] arr = new int[length];
		while (n < length) {
			int num = s.nextInt();
			arr[n] = num;
			n++;
		}

		int find = s.nextInt();

		boolean found = false;
		for (int val : arr) {
			if (val == find) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		s.close();
	}
}
