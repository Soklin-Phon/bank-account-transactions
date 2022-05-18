package com.tuum.bankassignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid Currency")
public class InvalidCurrencyException extends RuntimeException{
}
