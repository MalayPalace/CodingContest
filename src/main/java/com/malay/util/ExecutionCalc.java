/***********************************
 * AlgoSolutions Project
 * Filename: ExecutionCalc.java
 * Author : malay
 * Date : 08-May-2022
 * 
 **********************************/
package com.malay.util;

import java.time.Duration;
import java.time.Instant;

public class ExecutionCalc {

	private static Instant start;
	private static Instant end;

	public static void start() {
		start = Instant.now();
	}

	public static void end() {
		end = Instant.now();
	}

	public static void endAndPrint() {
		end();
		System.out.println("********************");
		System.out.println("Time Taken: " + timeTaken());
		System.out.println("********************");
	}
	
	public static String timeTaken() {
		long millis = Duration.between(start, end).toMillis();
		String s = "Time Taken: ";
		if (millis > 1000) {
			long div = millis % 1000;
			int seconds = (int) Math.floor(millis / 1000);
			if (seconds > 60) {
				div = millis % 60;
				int mins = (int) Math.floor(millis / 60);
				return s + mins + "." + div + " m";
			}
			return s + seconds + "." + div + " s";
		}
		return s + millis + " ms";
	}
}
