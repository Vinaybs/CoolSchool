package com.coolSchool.application.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * This class will hold the Address information.
 *
 * @author Vinay
 *
 */
@Embeddable
public class Address implements Serializable {

	/**
	 * Default Serialization ID
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "UNIT")
	private String unit;
	@Column(name = "STREET")
	private String street;
	@Column(name = "REGION")
	private String region;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "ZIPCODE")
	private Long zipCode;
	@Column(name = "IS_PRIMARY")
	private Boolean isPrimary;

	public Boolean getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

}
