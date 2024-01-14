package com.training.vehiclesys.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//we need to put the Response status as Not found. because this exception is for catch not found exceptions.
//created method need to extend from RunTimeException class.
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    //create a Constructor using the created class. Need to create needed arguments to pass it. Inside it, we pass the argument to super class, it means pass to RuntimeException class.
    //inbuilt RuntimeException class also extends from Exception class.
    public NotFoundException(String message){
        super(message);
    }

}
