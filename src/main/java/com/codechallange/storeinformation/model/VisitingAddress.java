package com.codechallange.storeinformation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VisitingAddress {

	private Integer houseNumber ;
	private String street;
	private String postalCode;
	private String city;
	private String country;
	/**
	 * @param houseNumber
	 * @param street
	 * @param postalCode
	 * @param city
	 * @param country
	 */
	public VisitingAddress(Integer houseNumber, String street, String postalCode, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}
	/**
	 * @return the houseNumber
	 */
	public Integer getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, country, houseNumber, postalCode, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VisitingAddress other = (VisitingAddress) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(houseNumber, other.houseNumber) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return "VisitingAddress [houseNumber=" + houseNumber + ", street=" + street + ", postalCode=" + postalCode
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	

	
}
