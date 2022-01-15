package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsTest {

    Calculations tester = new Calculations();

    @Test
    public void SmallestAmountInArrayMustBe2() {
        int[] numbers = {1,4,10};
        assertEquals("smallest amount between numbers 1,4,10 must be 2", 2, tester.smallestAmountBetweenInArray(numbers));
    }

    @Test
    public void SmallestAmountInArrayMustBe2EvenWhenNotInOrder() {
        int[] numbers = {10,1,4};
        assertEquals("smallest amount between numbers 10,1,4 must be 2", 2, tester.smallestAmountBetweenInArray(numbers));
    }

    @Test
    public void SmallestAmountInArrayMustBe2EvenWhenSameNumbers() {
        int[] numbers = {1,4,4,10};
        assertEquals("smallest amount between numbers 1,4,4,10 must be 2", 2, tester.smallestAmountBetweenInArray(numbers));
    }

    @Test
    public void SmallestAmountInArrayMustBe2EvenWhenSameDistanceBetweenNumbers() {
        int[] numbers = {1,4,7,10};
        assertEquals("smallest amount between numbers 1,4,4,10 must be 2", 2, tester.smallestAmountBetweenInArray(numbers));
    }

}