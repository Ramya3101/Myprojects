package com.codechallange.storeinformation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class StoreVersionPeriod {

	private Date dateValidFrom ;
	private Date dateValidUntil;
	private String addressCodeEan;
	private VisitingAddress visitingAddress;
	private DeliveryAddress deliveryAddress;
	/**
	 * @param dateValidFrom
	 * @param dateValidUntil
	 * @param addressCodeEan
	 * @param visitingAddress
	 * @param deliveryAddress
	 */
	public StoreVersionPeriod(Date dateValidFrom, Date dateValidUntil, String addressCodeEan,
			VisitingAddress visitingAddress, DeliveryAddress deliveryAddress) {
		super();
		this.dateValidFrom = dateValidFrom;
		this.dateValidUntil = dateValidUntil;
		this.addressCodeEan = addressCodeEan;
		this.visitingAddress = visitingAddress;
		this.deliveryAddress = deliveryAddress;
	}
	/**
	 * @return the dateValidFrom
	 */
	public Date getDateValidFrom() {
		return dateValidFrom;
	}
	/**
	 * @param dateValidFrom the dateValidFrom to set
	 */
	public void setDateValidFrom(Date dateValidFrom) {
		this.dateValidFrom = dateValidFrom;
	}
	/**
	 * @return the dateValidUntil
	 */
	public Date getDateValidUntil() {
		return dateValidUntil;
	}
	/**
	 * @param dateValidUntil the dateValidUntil to set
	 */
	public void setDateValidUntil(Date dateValidUntil) {
		this.dateValidUntil = dateValidUntil;
	}
	/**
	 * @return the addressCodeEan
	 */
	public String getAddressCodeEan() {
		return addressCodeEan;
	}
	/**
	 * @param addressCodeEan the addressCodeEan to set
	 */
	public void setAddressCodeEan(String addressCodeEan) {
		this.addressCodeEan = addressCodeEan;
	}
	/**
	 * @return the visitingAddress
	 */
	public VisitingAddress getVisitingAddress() {
		return visitingAddress;
	}
	/**
	 * @param visitingAddress the visitingAddress to set
	 */
	public void setVisitingAddress(VisitingAddress visitingAddress) {
		this.visitingAddress = visitingAddress;
	}
	/**
	 * @return the deliveryAddress
	 */
	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressCodeEan, dateValidFrom, dateValidUntil, deliveryAddress, visitingAddress);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreVersionPeriod other = (StoreVersionPeriod) obj;
		return Objects.equals(addressCodeEan, other.addressCodeEan)
				&& Objects.equals(dateValidFrom, other.dateValidFrom)
				&& Objects.equals(dateValidUntil, other.dateValidUntil)
				&& Objects.equals(deliveryAddress, other.deliveryAddress)
				&& Objects.equals(visitingAddress, other.visitingAddress);
	}
	@Override
	public String toString() {
		return "StoreVersionPeriod [dateValidFrom=" + dateValidFrom + ", dateValidUntil=" + dateValidUntil
				+ ", addressCodeEan=" + addressCodeEan + ", visitingAddress=" + visitingAddress + ", deliveryAddress="
				+ deliveryAddress + "]";
	}
	
	
	
}
