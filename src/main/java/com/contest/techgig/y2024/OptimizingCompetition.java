/***********************************
 * AlgoSolutions Project
 * Filename: OptimizingCompetition.java
 * Author : malay
 * Date : 25-Apr-2024
 * 
 **********************************/
package com.contest.techgig.y2024;

import java.util.Scanner;

public class OptimizingCompetition {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int noOfParticipants = Integer.parseInt(s.nextLine());

		String[] secondLine = s.nextLine().split(" ");
		int[] weigths = new int[noOfParticipants];

		int min = 99;
		int max = 0;
		// Convert to integer and find min and max
		for (int i = 0; i < noOfParticipants; i++) {
			weigths[i] = Integer.parseInt(secondLine[i]);
			if (weigths[i] < min) {
				min = weigths[i];
			}
			if (weigths[i] > max) {
				max = weigths[i];
			}
		}

		int[] freq = new int[max + 1];
		// Store frequency of its weights
		for (int i = 0; i < noOfParticipants; i++) {
			freq[weigths[i]]++;
		}

		System.out.println(maxNoOfPairsPossible(freq, min, max));

		s.close();
	}

	public static int maxNoOfPairsPossible(int[] freq, int min, int max) {
		int result = 0;

		// Check for every sum between 2*min and 2*max
		for (int sum = 2 * min; sum <= 2 * max; sum++) {

			int possiblePairs = 0;

			for (int index = 1; index < (sum + 1) / 2; index++) {
				if (sum - index <= max) {
					// Finding possible pair using frequency of index and another index which can make the sum
					possiblePairs += Math.min(freq[index], freq[sum - index]);
				}
			}

			// Handle Condition for even sum where in same no is added twice to get the sum
			if (sum % 2 == 0) {
				possiblePairs += freq[sum / 2] / 2;
			}

			result = Math.max(result, possiblePairs);
		}

		return result;
	}
}