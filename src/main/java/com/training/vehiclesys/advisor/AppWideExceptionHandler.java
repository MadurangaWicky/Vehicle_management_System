package com.training.vehiclesys.advisor;

//import com.training.vehiclesys.exception.BindException;
import com.training.vehiclesys.exception.NotFoundException;
import com.training.vehiclesys.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException e){
        return new ResponseEntity(new StandardResponse(404, "Not found",e.getMessage()), HttpStatus.NOT_FOUND);
    }

    //in this code, we marked this as a RestControllerAdvice. Now using ExceptionHandler annotation, we can catch the exception has thrown from NotFoundException class.
    //We use ResponseEntity to pass the exception also in standard manner. handleNotFoundException method use to catch the exception message from NotFoundException.
    //Then using StandardResponse object, we pass them to frontend.


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<StandardResponse> handleValidationException(MethodArgumentNotValidException e) {
//        List<String> errorMessages = new ArrayList<>();
//        for (FieldError fieldError : e.getFieldErrors()) {
//            errorMessages.add(fieldError.getDefaultMessage());
//        }

        List<String> errors = e.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());



        return new ResponseEntity(new StandardResponse(500, "Bad_request", errors),HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }
}
