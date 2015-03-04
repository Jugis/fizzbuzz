package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("7", fizzBuzzer.execute(7));
    }
    @Test
    public void executeNumberIsDivideableBy7AndBiggerThan7(){
        assertEquals("Wizz", fizzBuzzer.execute(14));
    }
    @Test
    public void executeNumberContainsSpecificNumber(){
//        if (String.valueOf(number).contains("3")) return "Fizz";else
//        if (String.valueOf(number).contains("5")) return "Buzz";else
//        if (String.valueOf(number).contains("7")) return "Wizz";else
        assertEquals("Fizz", fizzBuzzer.execute(13));
        assertEquals("Buzz", fizzBuzzer.execute(25));
        assertEquals("Wizz", fizzBuzzer.execute(27));
    }

}
