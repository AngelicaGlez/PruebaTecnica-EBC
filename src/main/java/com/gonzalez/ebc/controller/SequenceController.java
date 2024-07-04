package com.gonzalez.ebc.controller;

import com.gonzalez.ebc.model.GenericResponse;
import com.gonzalez.ebc.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sequence")
@CrossOrigin(origins = "*")
public class SequenceController {
    @Autowired
    @Qualifier("sequenceService")
    SequenceService serviceSequence;


    @GetMapping("/fizz/{number}")
    public GenericResponse<List<String>> sequenceFizzBuzz(@PathVariable(name = "number") Integer number){
        return serviceSequence.sequenceFizzBuzz(number);
    }

    @PutMapping ("/collatz/{number}")
    public GenericResponse<List<Integer>> sequenceCollatz(@PathVariable (name= "number") Integer number){
        return serviceSequence.sequenceCollatz(number);
    }
}
