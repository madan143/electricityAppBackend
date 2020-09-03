/**
 * 
 */
package com.madan.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mareddy
 *
 */
@ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
public class RecordAlreadyExistException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5538492593149755033L;
	
	public RecordAlreadyExistException() {
        super();
    }
    public RecordAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
    public RecordAlreadyExistException(String message) {
        super(message);
    }
    public RecordAlreadyExistException(Throwable cause) {
        super(cause);
    }

}
