package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.GenericResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("sequenceService")
public class SequenceService implements IService {

    @Override
    public Integer compare(Integer numberAux) {
        if (numberAux % 2 == 0) {
            return numberAux / 2;
        } else {
            return (numberAux * 3) + 1;
        }
    }

    @Override
    public GenericResponse<List<String>> sequenceFizzBuzz(Integer number) {
        GenericResponse<List<String>> sCollatz = new GenericResponse<List<String>>();
        if (number < 1) {
            sCollatz.setMessage("Only numbers >0");
            return sCollatz;
        }
        List<String> sequenceFizzBuzz = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sequenceFizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                sequenceFizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                sequenceFizzBuzz.add("Buzz");
            } else {
                sequenceFizzBuzz.add(String.valueOf(i));
            }
        }
        sCollatz.setResult(sequenceFizzBuzz);
        sCollatz.setMessage("Finished process");
        return sCollatz;
    }



@Override
public GenericResponse<List<Integer>> sequenceCollatz(Integer number) {
    GenericResponse<List<Integer>> sCollatz = new GenericResponse<List<Integer>>();
    if (number < 1) {
        sCollatz.setMessage("Only numbers >0");
        return sCollatz;
    }
    List<Integer> collatz = new ArrayList<>();
    collatz.add(number);
    while (number != 1) {
        number = this.compare(number);
        collatz.add(number);
    }
    sCollatz.setResult(collatz);
    sCollatz.setMessage("Finished process");
    return sCollatz;
}


}
