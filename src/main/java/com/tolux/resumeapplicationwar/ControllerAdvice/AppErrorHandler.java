package com.tolux.resumeapplicationwar.ControllerAdvice;


import com.tolux.resumeapplicationwar.ErrorDetails.AppError;
import com.tolux.resumeapplicationwar.Exception.ApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AppErrorHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<AppError> errorHandler(ApplicationException applicationException){
        AppError appError= new AppError(applicationException.getMessage(), "404 NOT FOUND", "473 Tech",LocalDateTime.now());
        return new ResponseEntity<>(appError, HttpStatus.BAD_REQUEST);
    }
}
