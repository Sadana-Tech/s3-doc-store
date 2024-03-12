package com.utkrashta.exception;

import com.utkrashta.model.ErrorDetails;
import com.utkrashta.model.ErrorHttpStatus;
import com.utkrashta.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Response> handleException(Exception ex) {
    Response response = new Response();
    response.setErrorDetails(new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR.value(),
        "Service unavailable , please try again later."));

    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<Response> handleResourceNotFoundException(ResourceNotFoundException ex) {
    Response response = new Response();
    response.setErrorDetails(new ErrorDetails(ErrorHttpStatus.RESOURCE_NOT_FOUND_EXCEPTION.value(),
        ErrorHttpStatus.RESOURCE_NOT_FOUND_EXCEPTION.getReasonPhrase()));

    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(FileStorageException.class)
  public ResponseEntity<Response> handleResourceNotFoundException(FileStorageException ex) {
    Response response = new Response();
    response.setErrorDetails(new ErrorDetails(ErrorHttpStatus.FILE_STORAGE_EXCEPTION.value(),
        ErrorHttpStatus.FILE_STORAGE_EXCEPTION.getReasonPhrase()));

    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }


}
