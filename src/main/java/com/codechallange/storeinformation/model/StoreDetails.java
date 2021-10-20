package com.codechallange.storeinformation.model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("storeInformation")
public class StoreDetails {

	private Integer id ;
	private String name;
	private List<StoreVersionPeriod> storeVersionPeriods;
	
	
	/**
	 * @param id
	 * @param name
	 * @param storeVersionPeriods
	 */
	public StoreDetails(Integer id, String name, List<StoreVersionPeriod> storeVersionPeriods) {
		super();
		this.id = id;
		this.name = name;
		this.storeVersionPeriods = storeVersionPeriods;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the storeVersionPeriods
	 */
	public List<StoreVersionPeriod> getStoreVersionPeriods() {
		return storeVersionPeriods;
	}
	/**
	 * @param storeVersionPeriods the storeVersionPeriods to set
	 */
	public void setStoreVersionPeriods(List<StoreVersionPeriod> storeVersionPeriods) {
		this.storeVersionPeriods = storeVersionPeriods;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, storeVersionPeriods);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreDetails other = (StoreDetails) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(storeVersionPeriods, other.storeVersionPeriods);
	}
	@Override
	public String toString() {
		return "StoreDetails [id=" + id + ", name=" + name + ", storeVersionPeriods=" + storeVersionPeriods + "]";
	}
	
	
	
	
}
