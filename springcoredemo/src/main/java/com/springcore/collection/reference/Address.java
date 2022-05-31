package com.springcore.collection.reference;

public class Address {
	private String addressFlatNumber;
	private String addressPocket;
	private String addressSector;

	public Address(String addressFlatNumber, String addressPocket, String addressSector) {
		super();
		this.addressFlatNumber = addressFlatNumber;
		this.addressPocket = addressPocket;
		this.addressSector = addressSector;
	}

	@Override
	public String toString() {
		return "Address [addressFlatNumber=" + addressFlatNumber + ", addressPocket=" + addressPocket
				+ ", addressSector=" + addressSector + "]";
	}

}
