/***********************************
 * AlgoSolutions Project
 * Filename: WorldArmyAliens.java
 * Author : malay
 * Date : 26-Apr-2022
 * 
 **********************************/
package com.contest.techgig.y2022;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorldArmyAliens {

	private static final String TIME_FORMAT = "HH mm";
	private static final String SPACE_DELIMITER = " ";

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String startTimeStr = s.nextLine();
		String travelTimeStr = s.nextLine();

		if (!isCorrectTimeFormat(startTimeStr) || !isCorrectTimeFormat(travelTimeStr)) {
			System.out.println("Not in proper format");
			System.exit(0);
		}

		LocalTime startTime = getTimeFromString(startTimeStr, TIME_FORMAT);
		LocalTime travelTime = getTimeFromString(travelTimeStr, TIME_FORMAT);

		startTime = startTime.plusHours(travelTime.getHour()).plusMinutes(travelTime.getMinute());

		System.out.println(startTime.format(DateTimeFormatter.ofPattern(TIME_FORMAT)));
		s.close();
	}

	private static LocalTime getTimeFromString(String startTime, String string) {
		return LocalTime.parse(startTime, DateTimeFormatter.ofPattern(TIME_FORMAT));
	}

	private static boolean isCorrectTimeFormat(String line) {
		if (line != null && line.trim().length() > 0) {
			String[] values = line.split(SPACE_DELIMITER);
			if (values.length == 2 && Integer.parseInt(values[0]) >= 0 && Integer.parseInt(values[0]) <= 23 && Integer.parseInt(values[1]) >= 0
					&& Integer.parseInt(values[1]) <= 59) {
				return true;
			}
		}
		return false;
	}
}
