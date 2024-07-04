package com.gonzalez.ebc.exception;

import com.gonzalez.ebc.model.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<GenericResponse<String>> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex) {
        GenericResponse<String> resp =  new GenericResponse<String>();
        String error = String.format("The parameter '%s' with value '%s' could not be converted to type '%s'",
                ex.getName(), ex.getValue(), ex.getRequiredType().getSimpleName());
        resp.setMessage(error);
        resp.setResult("Failed process");
        return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    }
}
