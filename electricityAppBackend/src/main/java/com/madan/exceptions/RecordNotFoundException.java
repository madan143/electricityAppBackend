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
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1875938229702317843L;
	
	public RecordNotFoundException() {
        super();
    }
    public RecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public RecordNotFoundException(String message) {
        super(message);
    }
    public RecordNotFoundException(Throwable cause) {
        super(cause);
    }

}
