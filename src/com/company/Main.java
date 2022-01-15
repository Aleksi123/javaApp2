package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    //int[] numbers = {1,4,10};
        //Myclass2.smallestAmountBetweenInArray(numbers);
    }

    /*public static final int smallestAmountBetweenInArray(int[] numArray) {
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

        System.out.println("etäisyys: " + minDistance);

        numbersBetween = minDistance - 1;
        System.out.println("montaNumeroaMahtuu: " + numbersBetween);
        return minDistance;
    }*/
}
