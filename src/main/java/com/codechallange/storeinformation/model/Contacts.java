package com.codechallange.storeinformation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contacts {

	private String primaryPhoneNumber ;

	/**
	 * @param primaryPhoneNumber
	 */
	public Contacts(String primaryPhoneNumber) {
		super();
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	/**
	 * @return the primaryPhoneNumber
	 */
	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}

	/**
	 * @param primaryPhoneNumber the primaryPhoneNumber to set
	 */
	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaryPhoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacts other = (Contacts) obj;
		return Objects.equals(primaryPhoneNumber, other.primaryPhoneNumber);
	}

	@Override
	public String toString() {
		return "Contacts [primaryPhoneNumber=" + primaryPhoneNumber + "]";
	}

	
}
