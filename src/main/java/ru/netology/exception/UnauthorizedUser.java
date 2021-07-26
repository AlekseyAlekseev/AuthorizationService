package ru.netology.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UnauthorizedUser {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> UnauthorizedUser(RuntimeException err) {
        return new ResponseEntity<>(err.getLocalizedMessage(), HttpStatus.UNAUTHORIZED);
    }
}
