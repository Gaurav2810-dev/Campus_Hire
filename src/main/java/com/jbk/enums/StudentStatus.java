package com.jbk.enums;

public enum StudentStatus {
	APPLIED("Submitted"),
	APPROVED("Approved"),
	REJECTED("Rejected");

	private final String value;

	StudentStatus(String value) {
	    this.value = value;
	}

	public String getValue() {
	    return value;
	}
}
