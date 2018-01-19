package com.danielev86.procycling.controller.dto;

import java.io.Serializable;

public class Response<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean checkResponse;
	
	private T bodyResponse;

	public boolean isCheckResponse() {
		return checkResponse;
	}

	public void setCheckResponse(boolean checkResponse) {
		this.checkResponse = checkResponse;
	}

	public T getBodyResponse() {
		return bodyResponse;
	}

	public void setBodyResponse(T bodyResponse) {
		this.bodyResponse = bodyResponse;
	}

}
