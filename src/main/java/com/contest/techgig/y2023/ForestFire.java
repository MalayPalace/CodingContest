package com.contest.techgig.y2023;

/* Read input from STDIN. Print your output to STDOUT*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ForestFire {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String firstLine = s.nextLine();

        String[] values = firstLine.split(" ");
        int noOfAnimals = Integer.parseInt(values[0]);
        int capacity = Integer.parseInt(values[1]);

        String secondLine = s.nextLine();

        List<Long> energies = Arrays.stream(secondLine.split(" ")).map(Long::parseLong).collect(Collectors.toList());
        Collections.sort(energies, Collections.reverseOrder());

        if (noOfAnimals != capacity && energies.get(capacity - 1).equals(energies.get(capacity))) {
            System.out.println("-1");
        } else {
            System.out.println(energies.get(capacity - 1));
        }

        s.close();
    }
}
