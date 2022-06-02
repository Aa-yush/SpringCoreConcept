package com.springcore.autowire.usingannotation;

public class Address {
	private int addressFlatNumber;
	private String addressPocket;
	private String addressSector;

	public int getaddressFlatNumber() {
		return addressFlatNumber;
	}

	public void setaddressFlatNumber(int addressFlatNumber) {
		this.addressFlatNumber = addressFlatNumber;
	}

	public String getAddressPocket() {
		return addressPocket;
	}

	public void setAddressPocket(String addressPocket) {
		this.addressPocket = addressPocket;
	}

	public String getAddressSector() {
		return addressSector;
	}

	public void setAddressSector(String addressSector) {
		this.addressSector = addressSector;
	}

	public Address(int addressFlatNumber, String addressPocket, String addressSector) {
		super();
		this.addressFlatNumber = addressFlatNumber;
		this.addressPocket = addressPocket;
		this.addressSector = addressSector;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressFlatNumber=" + addressFlatNumber + ", addressPocket=" + addressPocket
				+ ", addressSector=" + addressSector + "]";
	}

}
