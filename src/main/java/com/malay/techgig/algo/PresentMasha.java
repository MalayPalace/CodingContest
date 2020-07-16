/***********************************
 * AlgoSolutions Project
 * Filename: PresentMasha.java
 * Author : malay
 * Date : 16-Jul-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.Scanner;

public class PresentMasha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long input = s.nextLong();
		if (input < 1) {
			System.out.print("Invalid Input");
			System.exit(0);
		}

		int presents = 0;
		boolean isOne = true;
		while (input > 0) {
			if (isOne) {
				input -= 1;
				isOne = false;
			} else {
				input -= 2;
				isOne = true;
			}
			if (input >= 0) {
				presents++;
			}
		}

		System.out.print(presents);
		s.close();
	}
}
