/***********************************
 * AlgoSolutions Project
 * Filename: ChantuBantu.java
 * Author : malay
 * Date : 08-May-2022
 * 
 **********************************/
package com.contest.techgig.y2022;

import java.util.Scanner;

public class ChantuBantu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTest = s.nextInt();
		s.nextLine();

		for (int i = 0; i < noOfTest; i++) {
			// Inputs
			int giftReq = s.nextInt();
			s.nextLine();
			int giftAvailable = s.nextInt();
			s.nextLine();
			String giftPriceStr = s.nextLine();

			// Initializing arrays
			int[] lowestPriceGift = new int[giftReq];

			lowestPriceGift = getNLowestGifts(giftPriceStr, giftAvailable, giftReq);

			// Add the lowest price value
			long amount = 0;
			for (int j = 0; j < giftReq; j++) {
				amount = amount + lowestPriceGift[j];
			}
			System.out.println(amount);

		}
		s.close();
	}

	private static int[] getNLowestGifts(String giftPriceStr, int giftAvailable, int giftReq) {
		int[] result = new int[giftReq];

		// Filling with max value
		for (int i = 0; i < giftReq; i++) {
			result[i] = Integer.MAX_VALUE;
		}

		String[] gifts = giftPriceStr.split(" ");
		for (int i = 0; i < giftAvailable; i++) {
			int giftAmount = Integer.parseInt(gifts[i]);

			// Getting insertion index to add in lowest price
			int index = 0;
			for (; index < giftReq; index++) {
				if (giftAmount > result[index]) {
					break;
				}
			}

			// check if need to add then shift
			if (index > 0) {
				result = shiftArrayAddSys(result, index, giftAmount);
			}
		}

		return result;
	}

	/*private static void shiftArrayAdd(int[] result, int index, int giftAmount) {
			for (int i = 0; i < index; i++) {
				result[i] = result[i + 1];
			}
			result[index] = giftAmount;
		}*/
	
	private static int[] shiftArrayAddSys(int[] result, int index, int giftAmount) {
		int[] newArr = new int[result.length];

		System.arraycopy(result, 1, newArr, 0, index - 1);
		newArr[index - 1] = giftAmount;
		System.arraycopy(result, index, newArr, index, result.length - index);

		return newArr;
	}
}
