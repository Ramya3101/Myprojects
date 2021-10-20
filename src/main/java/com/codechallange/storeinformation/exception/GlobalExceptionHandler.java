package com.codechallange.storeinformation.exception;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.codechallange.storeinformation.model.StoreDetails;
import com.codechallange.storeinformation.service.StoreService;


@RestController
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	  @ExceptionHandler(NoDataFoundException.class)
	  public final ResponseEntity<NoDataFoundException> handleNotFoundException(NoDataFoundException ex, WebRequest request) {
		  NoDataFoundException exceptionResponse = new NoDataFoundException(HttpStatus.NOT_FOUND, ex.getMessage(),
	        ex.getError());
	    return new ResponseEntity<NoDataFoundException>(exceptionResponse, HttpStatus.NOT_FOUND);
	  }
	  
	  @ExceptionHandler(ValidationException.class)
	  public final ResponseEntity<ValidationException> handleValidationException(ValidationException ex, WebRequest request) {
		  ValidationException exceptionResponse = new ValidationException(HttpStatus.BAD_REQUEST, ex.getMessage(),
	        ex.getError());
	    return new ResponseEntity<ValidationException>(exceptionResponse, HttpStatus.BAD_REQUEST);
	  }

	}
}
