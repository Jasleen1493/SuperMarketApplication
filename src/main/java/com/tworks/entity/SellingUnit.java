package com.tworks.entity;

public enum SellingUnit {
	WEIGHTINKG("kg"),
	WEIGHTINGRMS("g"),
	VOLUMEINLTR("lt"),
	VOLUMEINMILLILTR("mlt"),
	NUMBER("dozen");
	
	private String unit;
	
	public String getUnit() {
		return this.unit;
	}
	
	private SellingUnit(String unit) {
		this.unit = unit;
	}
}
