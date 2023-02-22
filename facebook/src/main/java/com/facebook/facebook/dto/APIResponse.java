package com.facebook.facebook.dto;

public class APIResponse {
	public APIResponse() {
		// TODO Auto-generated constructor stub
	}
	private String message;
	private String httpCode;
	private String httpMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getHttpMessage() {
		return httpMessage;
	}

	public void setHttpMessage(String httpMessage) {
		this.httpMessage = httpMessage;
	}

	public APIResponse(String message, String httpCode, String httpMessage) {
		super();
		this.message = message;
		this.httpCode = httpCode;
		this.httpMessage = httpMessage;
	}

	@Override
	public String toString() {
		return "APIResponse [message=" + message + ", httpCode=" + httpCode + ", httpMessage=" + httpMessage + "]";
	}

}
