package com.tworks.entity;

public enum SellingUnit {
	WEIGHT("kg"),
	VOLUME("lts/mllts"),
	NUMBER("dozen");
	
	private String unit;
	
	public String getUnit() {
		return this.unit;
	}
	
	private SellingUnit(String unit) {
		this.unit = unit;
	}
}
