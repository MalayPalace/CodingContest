/***********************************
 * AlgoSolutions Project
 * Filename: ChantuBantu.java
 * Author : malay
 * Date : 08-May-2022
 * 
 **********************************/
package com.contest.techgig.y2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

			System.out.println(getNLowestGiftsSum(giftPriceStr, giftAvailable, giftReq));

		}
		s.close();
	}

	private static long getNLowestGiftsSum(String giftPriceStr, int giftAvailable, int giftReq) {
		String[] gifts = giftPriceStr.split(" ");
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < giftAvailable; i++) {
			list.add(Integer.parseInt(gifts[i]));
		}
		Collections.sort(list);

		long sum = 0;
		for (int i = 0; i < giftReq; i++) {
			sum += list.get(i);
		}

		return sum;
	}
}
