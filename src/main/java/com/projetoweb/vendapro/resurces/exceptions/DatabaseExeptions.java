package com.projetoweb.vendapro.resurces.exceptions;

import java.io.Serializable;

public class DatabaseExeptions extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public DatabaseExeptions(String msg) {
		super(msg);
	}
}
