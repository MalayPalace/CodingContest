/***********************************
 * AlgoSolutions Project
 * Filename: CandidateCode.java
 * Author : malay
 * Date : 16-Jul-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.Scanner;

public class CountOfOne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int count = s.nextInt();
		int countOfOne = 0;
		int i = 0;

		while (i < count) {
			int no = s.nextInt();
			if (no != 0 && no != 1) {
				System.out.print("Invalid Input");
				s.close();
				System.exit(0);
			}
			if (no == 0) {
				break;
			}
			countOfOne++;
			i++;
		}
		System.out.print(countOfOne);
		s.close();
		System.exit(0);
	}
}
