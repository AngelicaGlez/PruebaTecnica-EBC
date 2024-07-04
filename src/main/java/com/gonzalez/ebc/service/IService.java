package com.gonzalez.ebc.service;

import com.gonzalez.ebc.model.GenericResponse;

import java.util.List;

public interface IService {
    public Integer compare(Integer numberAux);
    public GenericResponse<List<String>> sequenceFizzBuzz(Integer number);
    public GenericResponse<List<Integer>> sequenceCollatz(Integer number);
}
