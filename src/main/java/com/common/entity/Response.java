package com.common.entity;

public class Response {
	
	private String responseMessage;
	
	private int responseCode;
	
	private String shortMessage;
	
	private String reservationId;
	
	private String uniqueId;
	
	private String hotelId; 
	
	private boolean ifError;
	
	private boolean ifSuccess;

	
	public Response() {
		super();
	}


	public Response(String responseMessage, int responseCode, String shortMessage, String reservationId,
			String uniqueId, String hotelId, boolean ifError, boolean ifSuccess) {
		super();
		this.responseMessage = responseMessage;
		this.responseCode = responseCode;
		this.shortMessage = shortMessage;
		this.reservationId = reservationId;
		this.uniqueId = uniqueId;
		this.hotelId = hotelId;
		this.ifError = ifError;
		this.ifSuccess = ifSuccess;
	}


	public String getResponseMessage() {
		return responseMessage;
	}


	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}


	public int getResponseCode() {
		return responseCode;
	}


	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}


	public String getShortMessage() {
		return shortMessage;
	}


	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}


	public String getReservationId() {
		return reservationId;
	}


	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}


	public String getUniqueId() {
		return uniqueId;
	}


	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}


	public String getHotelId() {
		return hotelId;
	}


	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}


	public boolean isIfError() {
		return ifError;
	}


	public void setIfError(boolean ifError) {
		this.ifError = ifError;
	}


	public boolean isIfSuccess() {
		return ifSuccess;
	}


	public void setIfSuccess(boolean ifSuccess) {
		this.ifSuccess = ifSuccess;
	}


	@Override
	public String toString() {
		return "Response [responseMessage=" + responseMessage + ", responseCode=" + responseCode + ", shortMessage="
				+ shortMessage + ", reservationId=" + reservationId + ", uniqueId=" + uniqueId + ", hotelId=" + hotelId
				+ ", ifError=" + ifError + ", ifSuccess=" + ifSuccess + "]";
	}

	

}
