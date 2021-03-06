package com.skillenza.socgen.system.exception;

/**
 * This class is to report all internal server errors
 *
 */
public class ServiceException extends RuntimeException {
	private static final long serialVersionUID = 5227953045998075477L;





	public ServiceException() {
		super();
	}





	public ServiceException(Throwable ex) {
		super(ex);
	}





	public ServiceException(String reason) {
		super(reason);
	}





	public ServiceException(String reason, Throwable cause) {
		super(reason, cause);
	}
}
