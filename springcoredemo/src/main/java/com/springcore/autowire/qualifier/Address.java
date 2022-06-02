package com.springcore.autowire.qualifier;

public class Address {
	private int addressPlotNumber;
	private String addressPocket;
	private String addressSector;

	public int getAddressPlotNumber() {
		return addressPlotNumber;
	}

	public void setAddressPlotNumber(int addressPlotNumber) {
		this.addressPlotNumber = addressPlotNumber;
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

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressPlotNumber, String addressPocket, String addressSector) {
		super();
		this.addressPlotNumber = addressPlotNumber;
		this.addressPocket = addressPocket;
		this.addressSector = addressSector;
	}

	@Override
	public String toString() {
		return "Address [addressPlotNumber=" + addressPlotNumber + ", addressPocket=" + addressPocket
				+ ", addressSector=" + addressSector + "]";
	}

}
