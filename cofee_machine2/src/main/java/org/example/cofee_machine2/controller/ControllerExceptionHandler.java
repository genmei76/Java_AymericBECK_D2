package org.example.cofee_machine2.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ProblemDetail handleValidationError(MethodArgumentNotValidException e)
    {
        ProblemDetail problem = ProblemDetail.forStatusAndDetail(HttpStatus.UNPROCESSABLE_CONTENT, "Validation Error");


        Map<String, String> errors = e.getBindingResult().getFieldErrors().stream().collect(
                Collectors.toMap(
                        FieldError::getField,
                        FieldError::getDefaultMessage
                )
        );

        problem.setProperty("errors", errors);
        return problem;
    }
}
