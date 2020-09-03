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
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AuthenticationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1875938229702317843L;
	
	public AuthenticationException() {
        super();
    }
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
    public AuthenticationException(String message) {
        super(message);
    }
    public AuthenticationException(Throwable cause) {
        super(cause);
    }

}
