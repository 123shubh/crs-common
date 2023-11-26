package com.common.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	@Id
	private String hotelId;

	private String hotelName;

	private String hotelCityName;

	private String hotelCityPostalCode;

	private String hotelAddress;

	private String hotelContactNumber;

	private String hotelContactEmail;

	private int totalNumberOfRooms;

	private int numberOfRoomsAvailable;

	private boolean isHotelAvailable;

	private boolean isGardenPresent;

	private boolean isSwimmingPoolPresent;

	private boolean isWifiAvailable;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Room> rooms;

	public Hotel() {
		super();
	}

	public Hotel(String hotelId, String hotelName, String hotelCityName, String hotelCityPostalCode,
			String hotelAddress, String hotelContactNumber, String hotelContactEmail, int totalNumberOfRooms,
			int numberOfRoomsAvailable, boolean isHotelAvailable, boolean isGardenPresent,
			boolean isSwimmingPoolPresent, boolean isWifiAvailable, List<Room> rooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCityName = hotelCityName;
		this.hotelCityPostalCode = hotelCityPostalCode;
		this.hotelAddress = hotelAddress;
		this.hotelContactNumber = hotelContactNumber;
		this.hotelContactEmail = hotelContactEmail;
		this.totalNumberOfRooms = totalNumberOfRooms;
		this.numberOfRoomsAvailable = numberOfRoomsAvailable;
		this.isHotelAvailable = isHotelAvailable;
		this.isGardenPresent = isGardenPresent;
		this.isSwimmingPoolPresent = isSwimmingPoolPresent;
		this.isWifiAvailable = isWifiAvailable;
		this.rooms = rooms;
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

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelContactNumber() {
		return hotelContactNumber;
	}

	public void setHotelContactNumber(String hotelContactNumber) {
		this.hotelContactNumber = hotelContactNumber;
	}

	public String getHotelContactEmail() {
		return hotelContactEmail;
	}

	public void setHotelContactEmail(String hotelContactEmail) {
		this.hotelContactEmail = hotelContactEmail;
	}

	public int getTotalNumberOfRooms() {
		return totalNumberOfRooms;
	}

	public void setTotalNumberOfRooms(int totalNumberOfRooms) {
		this.totalNumberOfRooms = totalNumberOfRooms;
	}

	public int getNumberOfRoomsAvailable() {
		return numberOfRoomsAvailable;
	}

	public void setNumberOfRoomsAvailable(int numberOfRoomsAvailable) {
		this.numberOfRoomsAvailable = numberOfRoomsAvailable;
	}

	public boolean isHotelAvailable() {
		return isHotelAvailable;
	}

	public void setHotelAvailable(boolean isHotelAvailable) {
		this.isHotelAvailable = isHotelAvailable;
	}

	public boolean isGardenPresent() {
		return isGardenPresent;
	}

	public void setGardenPresent(boolean isGardenPresent) {
		this.isGardenPresent = isGardenPresent;
	}

	public boolean isSwimmingPoolPresent() {
		return isSwimmingPoolPresent;
	}

	public void setSwimmingPoolPresent(boolean isSwimmingPoolPresent) {
		this.isSwimmingPoolPresent = isSwimmingPoolPresent;
	}

	public boolean isWifiAvailable() {
		return isWifiAvailable;
	}

	public void setWifiAvailable(boolean isWifiAvailable) {
		this.isWifiAvailable = isWifiAvailable;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCityName=" + hotelCityName
				+ ", hotelCityPostalCode=" + hotelCityPostalCode + ", hotelAddress=" + hotelAddress
				+ ", hotelContactNumber=" + hotelContactNumber + ", hotelContactEmail=" + hotelContactEmail
				+ ", totalNumberOfRooms=" + totalNumberOfRooms + ", numberOfRoomsAvailable=" + numberOfRoomsAvailable
				+ ", isHotelAvailable=" + isHotelAvailable + ", isGardenPresent=" + isGardenPresent
				+ ", isSwimmingPoolPresent=" + isSwimmingPoolPresent + ", isWifiAvailable=" + isWifiAvailable
				+ ", rooms=" + rooms + "]";
	}

}
