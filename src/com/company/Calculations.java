package com.company;

import java.util.Arrays;

public class Calculations {
    public static int smallestAmountBetweenInArray(int[] numArray) {
        int minDistance = Integer.MAX_VALUE;
        int numbersBetween;

        Arrays.sort(numArray);

        numArray = Arrays.stream(numArray).distinct().toArray();

        for(int i = 1; i < numArray.length; i++) {
            int diff = numArray[i] - numArray[i - 1];
            if(diff < minDistance) {
                minDistance = diff;
            }
        }

        numbersBetween = minDistance - 1;
        System.out.println("numbersBetween: " + numbersBetween);
        return numbersBetween;
    }
}
