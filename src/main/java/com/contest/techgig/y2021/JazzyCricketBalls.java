/***********************************
 * AlgoSolutions Project
 * Filename: JazzyCricketBalls.java
 * Author : malay
 * Date : 04-Jul-2021
 * 
 **********************************/
package com.contest.techgig.y2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JazzyCricketBalls {

	private static Map<Integer, Long> resultMap = new HashMap<Integer, Long>();

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int noOfPackets = s.nextInt();
		s.nextLine();

		if (noOfPackets < 1 || noOfPackets > 100) {
			System.exit(0);
		}

		String testStr = s.nextLine();
		List<Integer> ballsInPacks = convertToList(testStr, noOfPackets);

		Long sum = 0L;
		for (Integer balls : ballsInPacks) {
			if (resultMap.containsKey(balls)) {
				sum = sum + resultMap.get(balls);
			} else {
				Long result = getNoOfMoves(balls);
				resultMap.put(balls, result);
				sum = sum + result;
			}
		}
		System.out.println(sum);

		s.close();
	}

	private static Long getNoOfMoves(Integer balls) {
		if (resultMap.containsKey(balls)) {
			return resultMap.get(balls);
		}
		if (balls == 1) {
			return 1L;
		}
		if (balls == 2) {
			return getNoOfMoves(1) + getNoOfMoves(1) + 1; // +1 for splitting
		}
		Integer divisible = getDivisibleFactor(balls);
		Integer noOfGroups = balls / divisible;
		Long result = (noOfGroups * getNoOfMoves(divisible)) + 1; // +1 for splitting
		resultMap.put(balls, result);
		return result;
	}

	private static Integer getDivisibleFactor(Integer value) {
		Integer num = 2;
		while (value % num != 0) {
			if (num >= value / 2) {
				return 1;
			}
			num++;
		}
		return num;
	}

	private static List<Integer> convertToList(String testStr, int packs) {
		List<Integer> values = new ArrayList<Integer>(packs);
		if (testStr != null) {
			String[] strs = testStr.split(" ");
			for (String str : strs) {
				values.add(Integer.parseInt(str));
			}
		}
		return values;
	}
}
