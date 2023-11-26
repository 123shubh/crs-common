package com.common.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Reservation {
	
	@Id
	private String reservationId;
	
	private String hotelId;
	
	private String hotelName;
	
	private int guestId;
	
	private String primaryGuestFirstName;
	
	private String primaryGuestLastName;
	
	private ArrayList<String> primaryGuestMobileNumber;
	
	private ArrayList<String> secondaryGuestNames;
	
	private ArrayList<String> secondaryGuestMobileNumbers;
	
	private String uniqueId;
	
	private String roomId;
	
	private String roomName;
	
	private String rateId;
	
	private String rateName;
	
	private String hotelCityName;
	
	private String hotelCityPostalCode;
	
	private LocalDateTime bookingCreatedTime;
	
	private LocalDate arrivalDate;
	
	private LocalDate departureDate;
	
	private int numberOfStayDays;
	
	private double totalAmount;
	
	private double chargesPerDay;
	
	private double chargesPerPerson;
	
	private int numberOfChildren;
	
	private double extraCharges;

	private String currencyCode;
	
	private String channelPartnerOTA;
	
	private String reservationStatus;
	
	public Reservation() {
		super();
	}

	public Reservation(String reservationId, String hotelId, String hotelName, int guestId,
			String primaryGuestFirstName, String primaryGuestLastName, ArrayList<String> primaryGuestMobileNumber,
			ArrayList<String> secondaryGuestNames, ArrayList<String> secondaryGuestMobileNumbers, String uniqueId,
			String roomId, String roomName, String rateId, String rateName, String hotelCityName,
			String hotelCityPostalCode, LocalDateTime bookingCreatedTime, LocalDate arrivalDate,
			LocalDate departureDate, int numberOfStayDays, double totalAmount, double chargesPerDay,
			double chargesPerPerson, int numberOfChildren, double extraCharges, String currencyCode,
			String channelPartnerOTA, String reservationStatus) {
		super();
		this.reservationId = reservationId;
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.guestId = guestId;
		this.primaryGuestFirstName = primaryGuestFirstName;
		this.primaryGuestLastName = primaryGuestLastName;
		this.primaryGuestMobileNumber = primaryGuestMobileNumber;
		this.secondaryGuestNames = secondaryGuestNames;
		this.secondaryGuestMobileNumbers = secondaryGuestMobileNumbers;
		this.uniqueId = uniqueId;
		this.roomId = roomId;
		this.roomName = roomName;
		this.rateId = rateId;
		this.rateName = rateName;
		this.hotelCityName = hotelCityName;
		this.hotelCityPostalCode = hotelCityPostalCode;
		this.bookingCreatedTime = bookingCreatedTime;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.numberOfStayDays = numberOfStayDays;
		this.totalAmount = totalAmount;
		this.chargesPerDay = chargesPerDay;
		this.chargesPerPerson = chargesPerPerson;
		this.numberOfChildren = numberOfChildren;
		this.extraCharges = extraCharges;
		this.currencyCode = currencyCode;
		this.channelPartnerOTA = channelPartnerOTA;
		this.reservationStatus = reservationStatus;
	}

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getPrimaryGuestFirstName() {
		return primaryGuestFirstName;
	}

	public void setPrimaryGuestFirstName(String primaryGuestFirstName) {
		this.primaryGuestFirstName = primaryGuestFirstName;
	}

	public String getPrimaryGuestLastName() {
		return primaryGuestLastName;
	}

	public void setPrimaryGuestLastName(String primaryGuestLastName) {
		this.primaryGuestLastName = primaryGuestLastName;
	}

	public ArrayList<String> getPrimaryGuestMobileNumber() {
		return primaryGuestMobileNumber;
	}

	public void setPrimaryGuestMobileNumber(ArrayList<String> primaryGuestMobileNumber) {
		this.primaryGuestMobileNumber = primaryGuestMobileNumber;
	}

	public ArrayList<String> getSecondaryGuestNames() {
		return secondaryGuestNames;
	}

	public void setSecondaryGuestNames(ArrayList<String> secondaryGuestNames) {
		this.secondaryGuestNames = secondaryGuestNames;
	}

	public ArrayList<String> getSecondaryGuestMobileNumbers() {
		return secondaryGuestMobileNumbers;
	}

	public void setSecondaryGuestMobileNumbers(ArrayList<String> secondaryGuestMobileNumbers) {
		this.secondaryGuestMobileNumbers = secondaryGuestMobileNumbers;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getRateName() {
		return rateName;
	}

	public void setRateName(String rateName) {
		this.rateName = rateName;
	}

	public String getHotelCityName() {
		return hotelCityName;
	}

	public void setHotelCityName(String hotelCityName) {
		this.hotelCityName = hotelCityName;
	}

	public String getHotelCityPostalCode() {
		return hotelCityPostalCode;
	}

	public void setHotelCityPostalCode(String hotelCityPostalCode) {
		this.hotelCityPostalCode = hotelCityPostalCode;
	}

	public LocalDateTime getBookingCreatedTime() {
		return bookingCreatedTime;
	}

	public void setBookingCreatedTime(LocalDateTime bookingCreatedTime) {
		this.bookingCreatedTime = bookingCreatedTime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public int getNumberOfStayDays() {
		return numberOfStayDays;
	}

	public void setNumberOfStayDays(int numberOfStayDays) {
		this.numberOfStayDays = numberOfStayDays;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getChargesPerDay() {
		return chargesPerDay;
	}

	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}

	public double getChargesPerPerson() {
		return chargesPerPerson;
	}

	public void setChargesPerPerson(double chargesPerPerson) {
		this.chargesPerPerson = chargesPerPerson;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public double getExtraCharges() {
		return extraCharges;
	}

	public void setExtraCharges(double extraCharges) {
		this.extraCharges = extraCharges;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getChannelPartnerOTA() {
		return channelPartnerOTA;
	}

	public void setChannelPartnerOTA(String channelPartnerOTA) {
		this.channelPartnerOTA = channelPartnerOTA;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", hotelId=" + hotelId + ", hotelName=" + hotelName
				+ ", guestId=" + guestId + ", primaryGuestFirstName=" + primaryGuestFirstName
				+ ", primaryGuestLastName=" + primaryGuestLastName + ", primaryGuestMobileNumber="
				+ primaryGuestMobileNumber + ", secondaryGuestNames=" + secondaryGuestNames
				+ ", secondaryGuestMobileNumbers=" + secondaryGuestMobileNumbers + ", uniqueId=" + uniqueId
				+ ", roomId=" + roomId + ", roomName=" + roomName + ", rateId=" + rateId + ", rateName=" + rateName
				+ ", hotelCityName=" + hotelCityName + ", hotelCityPostalCode=" + hotelCityPostalCode
				+ ", bookingCreatedTime=" + bookingCreatedTime + ", arrivalDate=" + arrivalDate + ", departureDate="
				+ departureDate + ", numberOfStayDays=" + numberOfStayDays + ", totalAmount=" + totalAmount
				+ ", chargesPerDay=" + chargesPerDay + ", chargesPerPerson=" + chargesPerPerson + ", numberOfChildren="
				+ numberOfChildren + ", extraCharges=" + extraCharges + ", currencyCode=" + currencyCode
				+ ", channelPartnerOTA=" + channelPartnerOTA + ", reservationStatus=" + reservationStatus + "]";
	}

	
	

}

