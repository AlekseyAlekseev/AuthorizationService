package ru.netology.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InvalidCredentials {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> InvalidCredentials(IllegalArgumentException err) {
        return new ResponseEntity<>(err.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }
}
