/*
package com.stackroute.controller;

import com.stackroute.exceptions.MusicNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error+json")
public class MusicControllerAdvice {
    @ExceptionHandler(MusicNotFoundException.class)
    public ResponseEntity < MusicNotFoundException > notFoundException(final MusicNotFoundException e) {
        return error(e, HttpStatus.NOT_FOUND, e.getMessage());
    }
    private ResponseEntity < Exception >
    error(final Exception exception,
          final HttpStatus httpStatus,
          final String logRef) {
        final String message = Optional.of(exception.getMessage()).orElse(exception.getClass().getSimpleName());
        return new ResponseEntity< >(new MusicNotFoundException(message), httpStatus);
    }
    @ExceptionHandler(IllegalArgumentException.class) public ResponseEntity < MusicNotFoundException > assertionException(final IllegalArgumentException e) {
        return new ResponseEntity< >(e, HttpStatus.NOT_FOUND, e.getLocalizedMessage());
    }
}
*/
