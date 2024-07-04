package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.SequenceCollatz;

import java.util.List;

public interface IService {
    public Integer compare(Integer numberAux);
    public List<String> sequenceFizzBuzz(Integer number);
    SequenceCollatz sequenceCollatz(Integer number);
}
