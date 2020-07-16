/***********************************
 * AlgoSolutions Project
 * Filename: CandidateCode.java
 * Author : malay
 * Date : 16-Jul-2020
 * 
 **********************************/
package com.malay.techgig.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatingElem {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int noOfElem = s.nextInt();

		Map<Integer, Integer> inputs = new HashMap<Integer, Integer>();
		Integer minIndex = Integer.MAX_VALUE;
		int value = -1;

		int index = 0;
		while (noOfElem > 0) {
			int v = s.nextInt();
			Integer storeValue = null;
			if ((storeValue = inputs.get(v)) == null) {
				inputs.put(v, ++index);
			} else {
				if (storeValue < minIndex) {
					minIndex = storeValue;
					value = v;
				}
			}
			noOfElem--;
		}

		System.out.print(value);
		s.close();
	}
}
