package com.gonzalez.ebc.model;

import lombok.Data;

@Data
public class GenericResponse <T>{
    private String message;
    private T result;
}
