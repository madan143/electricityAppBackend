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
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ApplicationRunTimeException extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4160127390796098868L;
	
	public ApplicationRunTimeException() {
        super();
    }
    public ApplicationRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }
    public ApplicationRunTimeException(String message) {
        super(message);
    }
    public ApplicationRunTimeException(Throwable cause) {
        super(cause);
    }

}
