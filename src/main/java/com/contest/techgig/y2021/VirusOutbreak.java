/***********************************
 * AlgoSolutions Project
 * Filename: VirusOutbreak.java
 * Author : malay
 * Date : 13-Jun-2021
 * 
 **********************************/
package com.contest.techgig.y2021;

import java.util.Scanner;

public class VirusOutbreak {

	private static final String NEGATIVE = "NEGATIVE";
	private static final String POSITIVE = "POSITIVE";

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String compositionStr = s.nextLine();
		int noOfTest = s.nextInt();
		s.nextLine();
		
		if (noOfTest < 1 || noOfTest > 10) {
			System.out.println("Error");
			System.exit(0);
		}

		int i = 0;
		while (i < noOfTest) {
			String testStr = s.nextLine();
			String result = getResult(compositionStr, testStr);
			System.out.println(result);
			i++;
		}
		s.close();

	}

	private static String getResult(String compositionStr, String testStr) {
		char[] compoArr = compositionStr.toCharArray();
		char[] testArr = testStr.toCharArray();

		int iCompo = 0;
		int iTest = 0;
		while (iTest < testArr.length) {

			while (iCompo < compoArr.length && testArr[iTest] != compoArr[iCompo]) {
				iCompo++;
			}

			if (iCompo >= compoArr.length) {
				return NEGATIVE;
			}

			iTest++;
		}
		return POSITIVE;
	}
}
