package com.example.shout;

import com.example.coolcalculations.ImportantNumbersHacked;
import com.example.coolcalculations.ImportantNumbersHappyGreetingExposer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ShoutServiceTest {

    @Test
    void shoutMeaningOfLifeCopiedClass() {
        String s = new ShoutService().shoutMeaningOfLife();
        System.out.println(s);
        Assertions.assertEquals("Meaning of life 42", s);
    }

    @Test
    void shoutMeaningOfLife() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String s = new ShoutService().shoutMeaningOfLifeHacked();
        System.out.println(s);
        Assertions.assertEquals("Meaning of life 42", s);
    }

    @Test
    void greeting() {
        String s = new ImportantNumbersHappyGreetingExposer().happyGreeting();
        System.out.println(s);
    }

    @Test
    void greetingHacked() {
        String s = new ImportantNumbersHacked().happyGreeting();
        System.out.println(s);
    }
}