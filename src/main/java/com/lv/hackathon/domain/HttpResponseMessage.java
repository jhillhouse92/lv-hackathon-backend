package com.lv.hackathon.domain;


public class HttpResponseMessage {

	public enum HttpStatus {
		INFORMATIONAL(100),
		SUCCESSFUL(200),
		REDIRECTION(300),
		CLIENT_ERROR(400),
		SERVER_ERROR(500);
		
		private Integer code;
		
		HttpStatus(int code){
			this.code = code;
		}
		
		public Integer getStatusCode(){
			return this.code;
		}
	}
	
	private String statusCode;
	
	public HttpResponseMessage(HttpStatus status){
		this.statusCode = status.getStatusCode().toString();
	}

	public String getStatusCode(){
		return this.statusCode;
	}
}
