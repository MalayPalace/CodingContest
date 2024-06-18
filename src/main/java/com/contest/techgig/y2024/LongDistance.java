package com.contest.techgig.y2024;

import java.util.Scanner;

public class LongDistance {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        String firstLine = s.nextLine();
        int noOfTestCase = Integer.parseInt(firstLine);

        for (int i = 0; i < noOfTestCase; i++) {
            String paulInput = s.nextLine();
            String ninaInput = s.nextLine();

            String[] paulValues = paulInput.split(" ");
            String[] ninaValues = ninaInput.split(" ");
            int hourTakenByPaul = calculateTimeTakenInHour(Integer.parseInt(paulValues[0]), Integer.parseInt(paulValues[1]),
                    Integer.parseInt(paulValues[2]));
            int hourTakenByNina = calculateTimeTakenInHour(Integer.parseInt(ninaValues[0]), Integer.parseInt(ninaValues[1]),
                    Integer.parseInt(ninaValues[2]));

            if (hourTakenByPaul < hourTakenByNina) {
                System.out.println("PAUL");
                System.out.println(hourTakenByPaul);
            } else if (hourTakenByNina < hourTakenByPaul) {
                System.out.println("NINA");
                System.out.println(hourTakenByNina);
            } else {
                System.out.println("BOTH");
                System.out.println(hourTakenByPaul);
            }
        }
    }

    public static int calculateTimeTakenInHour(int distance, int speed, int noOfRepair) {
        return (distance / speed) + noOfRepair;
    }
}
