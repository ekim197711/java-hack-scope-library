package com.example.shout;

import com.example.coolcalculations.ImportantNumbers;
import com.example.coolcalculations.ImportantNumbersHacked;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Service
@Slf4j
public class ShoutService {
    public String shoutMeaningOfLife(){
        ImportantNumbersHacked numbers = new ImportantNumbersHacked();
        return "Meaning of life " + numbers.meaningOfLife();
    }

    public String shoutMeaningOfLifeHacked() throws NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException {
        ImportantNumbers numbers = new ImportantNumbers();
        Method method = numbers.getClass().getDeclaredMethod("meaningOfLife", int.class);
        method.setAccessible(true);
        return "Meaning of life " + method.invoke(numbers,1);
    }
}
