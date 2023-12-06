package de.frauas.project;

public class Drone {
	private int id;
	private Dronetype dronetype;
	private String created;
	private String serialnummer;
	private int carriageWeight;
	private String carriageType;
	
	/*
	 * empty Constructor
	 */
	public Drone() {
		
	}
	
	/*
	 * complete Constructor
	 */
	public Drone(int id, Dronetype dronetype, String created, String serialnummer, int carriageWeight, String carriageType) {
		this.id = id;
		this.dronetype = dronetype;
		this.created = created;
		this.serialnummer = serialnummer;
		this.carriageWeight = carriageWeight;
		this.carriageType = carriageType;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dronetype
	 */
	public Dronetype getDronetype() {
		return dronetype;
	}
	/**
	 * @param dronetype the dronetype to set
	 */
	public void setDronetype(Dronetype dronetype) {
		this.dronetype = dronetype;
	}
	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}
	/**
	 * @return the serialnummer
	 */
	public String getSerialnummer() {
		return serialnummer;
	}
	/**
	 * @param serialnummer the serialnummer to set
	 */
	public void setSerialnummer(String serialnummer) {
		this.serialnummer = serialnummer;
	}
	/**
	 * @return the carriageWeight
	 */
	public int getCarriageWeight() {
		return carriageWeight;
	}
	/**
	 * @param carriageWeight the carriageWeight to set
	 */
	public void setCarriageWeight(int carriageWeight) {
		this.carriageWeight = carriageWeight;
	}
	/**
	 * @return the carriageType
	 */
	public String getCarriageType() {
		return carriageType;
	}
	/**
	 * @param carriageType the carriageType to set
	 */
	public void setCarriageType(String carriageType) {
		this.carriageType = carriageType;
	}
	
	
}
