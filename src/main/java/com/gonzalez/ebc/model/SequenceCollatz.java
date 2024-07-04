package com.gonzalez.ebc.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter @Getter
public class SequenceCollatz {
    private List<Integer> sequence;
    private String message;
}
