package com.codechallange.storeinformation.exception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codechallange.storeinformation.model.StoreDetails;
import com.codechallange.storeinformation.service.StoreService;



public class NoDataFoundException extends RuntimeException {

	private HttpStatus status;
	  private String message;
	  private String error;
	  
	  
	/**
	 * @param status
	 * @param message
	 * @param error
	 */
	public NoDataFoundException(HttpStatus status, String message, String error) {
		super();
		this.status = status;
		this.message = message;
		this.error = error;
	}
	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}
	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}
	  
	  
}
