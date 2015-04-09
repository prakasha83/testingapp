package com.xcodefix.entity.model.type;

public enum EntityType {
	
	CUSTOMER, EMPLOYEE;
	private String desc;
	
//	private EntityType(String desc) {
//		this.desc = desc;
//	}
	
	public String getDesc() {
		return desc;
	}

}
