package com.myproject.bride.lib.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Venue implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String linkImageVenue;
	private String titleVenue;
	private String addressVenue;
	private String capacityVisitor;
	private String capacityParkir;
	private String luasBangunan;
	private String luasTanah;
	private String hargaVenue;
	private int idCity;
	private String locationVenue;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinkImageVenue() {
		return linkImageVenue;
	}

	public void setLinkImageVenue(String linkImageVenue) {
		this.linkImageVenue = linkImageVenue;
	}

	public String getTitleVenue() {
		return titleVenue;
	}

	public void setTitleVenue(String titleVenue) {
		this.titleVenue = titleVenue;
	}

	public String getAddressVenue() {
		return addressVenue;
	}

	public void setAddressVenue(String addressVenue) {
		this.addressVenue = addressVenue;
	}

	public String getCapacityVisitor() {
		return capacityVisitor;
	}

	public void setCapacityVisitor(String capacityVisitor) {
		this.capacityVisitor = capacityVisitor;
	}

	public String getCapacityParkir() {
		return capacityParkir;
	}

	public void setCapacityParkir(String capacityParkir) {
		this.capacityParkir = capacityParkir;
	}

	public String getLuasBangunan() {
		return luasBangunan;
	}

	public void setLuasBangunan(String luasBangunan) {
		this.luasBangunan = luasBangunan;
	}

	public String getLuasTanah() {
		return luasTanah;
	}

	public void setLuasTanah(String luasTanah) {
		this.luasTanah = luasTanah;
	}

	public String getHargaVenue() {
		return hargaVenue;
	}

	public void setHargaVenue(String hargaVenue) {
		this.hargaVenue = hargaVenue;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getLocationVenue() {
		return locationVenue;
	}

	public void setLocationVenue(String locationVenue) {
		this.locationVenue = locationVenue;
	}

}
