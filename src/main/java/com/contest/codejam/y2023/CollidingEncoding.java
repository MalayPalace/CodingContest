/***********************************
 * AlgoSolutions Project
 * Filename: CollidingEncoding.java
 * Author : malay
 * Date : 15-Apr-2023
 * 
 **********************************/
package com.contest.codejam.y2023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollidingEncoding {

	public static void main(String[] args) {
		Scanner s = new Scanner((Readable) new BufferedReader(new InputStreamReader(System.in)));
		int noOfTestCases = s.nextInt();
		s.nextLine();

		for (int i = 0; i < noOfTestCases; i++) {
			String line = s.nextLine();
			Map<Integer, Integer> encodingToUsed = convertEncodingByAscii(line);

			long noOfWords = s.nextLong();
			s.nextLine();

			Set<String> encodedSet = new HashSet<String>();
			boolean isCollisionPresent = false;
			for (int j = 0; j < noOfWords; j++) {
				String str = s.nextLine();
				boolean result = encodedSet.add(encodeUsingMap(str, encodingToUsed));
				if (!result) {
					isCollisionPresent = true;
				}
			}
			if (isCollisionPresent) {
				System.out.println("Case #" + (i + 1) + ": YES");
			} else {
				System.out.println("Case #" + (i + 1) + ": NO");
			}
		}
		s.close();
	}

	private static String encodeUsingMap(String str, Map<Integer, Integer> encodingToUsed) {
		StringBuilder result = new StringBuilder();
		for (char character : str.toCharArray()) {
			result.append(encodingToUsed.get((int) character));
		}
		return result.toString();
	}

	private static Map<Integer, Integer> convertEncodingByAscii(String line) {
		Map<Integer, Integer> encodingHolder = new HashMap<Integer, Integer>(26);
		int asciiCode = 65;
		for (String enc : line.split(" ")) {
			encodingHolder.put(asciiCode++, Integer.parseInt(enc));
		}
		return encodingHolder;
	}

}
