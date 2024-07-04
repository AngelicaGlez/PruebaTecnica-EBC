package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.SequenceCollatz;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("sequenceService")
public class SequenceService implements IService {

    @Override
    public Integer compare(Integer numberAux){
        if (numberAux%2==0){
            return numberAux/2;
        }
        else {
            return (numberAux*3)+1;
        }
    }

    @Override
    public List<String> sequenceFizzBuzz(Integer number) {
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
        return sequenceFizzBuzz;
    }

    @Override
    public SequenceCollatz sequenceCollatz(Integer number) {
        SequenceCollatz sCollatz = new SequenceCollatz();
        List<Integer> collatz = new ArrayList<>();
        collatz.add(number);
        while (number!=1){
            number= this.compare(number);
            collatz.add(number);
        }
        sCollatz.setSequence(collatz);
        sCollatz.setMessage("Finished process");
        return sCollatz;
    }


}
