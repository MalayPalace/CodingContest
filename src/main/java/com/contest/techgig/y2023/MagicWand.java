package com.contest.techgig.y2023;

/* Read input from STDIN. Print your output to STDOUT*/

import java.util.*;
import java.util.stream.Collectors;

public class MagicWand {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String firstLine = s.nextLine();

        String[] values = firstLine.split(" ");
        int lengthOfArray = Integer.parseInt(values[0]);
        int lengthOfQueries = Integer.parseInt(values[1]);

        String secondLine = s.nextLine();
        String thirdLine = s.nextLine();

        List<Long> desiredCostList = Arrays.stream(thirdLine.split(" ")).map(Long::parseLong).collect(Collectors.toList());
        List<Long> sumOfCostOperation = new ArrayList<Long>(Collections.nCopies(lengthOfQueries, 0l));

        for (String arrStr : secondLine.split(" ")) {
            long arrCost = Long.parseLong(arrStr);
            for (int i = 0; i < lengthOfQueries; i++) {
                sumOfCostOperation.set(i, sumOfCostOperation.get(i) + (Math.abs(desiredCostList.get(i) - arrCost)));
            }
        }

        for (int i = 0; i < lengthOfQueries; i++) {
            System.out.print(sumOfCostOperation.get(i) + " ");
        }
        s.close();
    }
}
