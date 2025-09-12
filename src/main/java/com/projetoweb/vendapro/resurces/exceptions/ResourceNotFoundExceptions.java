package com.projetoweb.vendapro.resurces.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptions(Object id) {
		super("Resource not found id" + id);
	}

}
