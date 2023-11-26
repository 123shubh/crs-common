package com.common.entity;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {

	@Id
	private String roomId;

	private String roomName;

	private String roomType;

	private ArrayList<String> specialRequests;

	private boolean isRoomAvailable;

	private boolean isHavingBalcony;

	private boolean isHavingPrivatePool;

	private boolean isSeaFacing;

	private double rateForThisRoom;

	private double currencyCode;

	@ManyToOne
	@JoinColumn(name = "hotel")
	private Hotel hotel;

	public Room() {
		super();
	}

	public Room(String roomId, String roomName, String roomType, ArrayList<String> specialRequests,
			boolean isRoomAvailable, boolean isHavingBalcony, boolean isHavingPrivatePool, boolean isSeaFacing,
			double rateForThisRoom, double currencyCode, Hotel hotel) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomType = roomType;
		this.specialRequests = specialRequests;
		this.isRoomAvailable = isRoomAvailable;
		this.isHavingBalcony = isHavingBalcony;
		this.isHavingPrivatePool = isHavingPrivatePool;
		this.isSeaFacing = isSeaFacing;
		this.rateForThisRoom = rateForThisRoom;
		this.currencyCode = currencyCode;
		this.hotel = hotel;
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

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public ArrayList<String> getSpecialRequests() {
		return specialRequests;
	}

	public void setSpecialRequests(ArrayList<String> specialRequests) {
		this.specialRequests = specialRequests;
	}

	public boolean isRoomAvailable() {
		return isRoomAvailable;
	}

	public void setRoomAvailable(boolean isRoomAvailable) {
		this.isRoomAvailable = isRoomAvailable;
	}

	public boolean isHavingBalcony() {
		return isHavingBalcony;
	}

	public void setHavingBalcony(boolean isHavingBalcony) {
		this.isHavingBalcony = isHavingBalcony;
	}

	public boolean isHavingPrivatePool() {
		return isHavingPrivatePool;
	}

	public void setHavingPrivatePool(boolean isHavingPrivatePool) {
		this.isHavingPrivatePool = isHavingPrivatePool;
	}

	public boolean isSeaFacing() {
		return isSeaFacing;
	}

	public void setSeaFacing(boolean isSeaFacing) {
		this.isSeaFacing = isSeaFacing;
	}

	public double getRateForThisRoom() {
		return rateForThisRoom;
	}

	public void setRateForThisRoom(double rateForThisRoom) {
		this.rateForThisRoom = rateForThisRoom;
	}

	public double getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(double currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomType=" + roomType + ", specialRequests="
				+ specialRequests + ", isRoomAvailable=" + isRoomAvailable + ", isHavingBalcony=" + isHavingBalcony
				+ ", isHavingPrivatePool=" + isHavingPrivatePool + ", isSeaFacing=" + isSeaFacing + ", rateForThisRoom="
				+ rateForThisRoom + ", currencyCode=" + currencyCode + ", hotel=" + hotel + "]";
	}

}
