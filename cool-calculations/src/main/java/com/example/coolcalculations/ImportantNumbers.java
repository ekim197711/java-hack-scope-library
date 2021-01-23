package com.example.coolcalculations;

public class ImportantNumbers {

    public int meaningOfLife(){
        return meaningOfLife(-1);
    }

    private int meaningOfLife(int modifier){
        return new ImportantNumberLocator()
                .numberToReturn(420)
                *modifier;
    }

    protected String happyGreeting(){
        return "Hello and thank you for using my lib! Your vids are great!";
    }


}
