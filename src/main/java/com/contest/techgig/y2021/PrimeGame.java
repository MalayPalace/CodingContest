/***********************************
 * AlgoSolutions Project
 * Filename: PrimeGame.java
 * Author : malay
 * Date : 21-Jun-2021
 * 
 **********************************/
package com.contest.techgig.y2021;

import java.util.Scanner;

public class PrimeGame {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int noOfTest = s.nextInt();
		s.nextLine();

		if (noOfTest < 1 || noOfTest > 10) {
			System.exit(0);
		}

		for (int i = 0; i < noOfTest; i++) {
			String testStr = s.nextLine();
			if (testStr == null || testStr.trim().length() == 0) {
				System.exit(0);
			}

			String[] testStrArr = testStr.split(" ");
			int left = Integer.parseInt(testStrArr[0]);
			int right = Integer.parseInt(testStrArr[1]);

			int result = getMaximumPrimeDiff(left, right);
			System.out.println(result);
		}
		s.close();

	}

	private static int getMaximumPrimeDiff(int left, int right) {
		int minPrime = -1;
		int maxPrime = -1;

		// Start from left, stop when minimum prime no is found
		while (left <= right) {
			if (isPrime(left)) {
				minPrime = left;
				break;
			}
			left++;
		}

		// if reached end, then return -1, no prime number retieved
		if (minPrime == -1) {
			return minPrime;
		}

		// Start from right and navigate till we explore left, stop when maximum prime no is found
		while (right >= left) {
			if (isPrime(right)) {
				maxPrime = right;
				break;
			}
			right--;
		}

		return maxPrime - minPrime;
	}

	private static boolean isPrime(int value) {
		if (value <= 1) {
			return false;
		}
		if (value == 2) {
			return true;
		}

		int num = 2;
		while (value % num != 0) {
			if (num >= value / 2) {
				return true;
			}
			num++;
		}
		return false;
	}
}
