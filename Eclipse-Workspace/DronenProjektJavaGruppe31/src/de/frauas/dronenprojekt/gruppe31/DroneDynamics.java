package de.frauas.project;

public class DroneDynamics {
	private Drone drone;
	private String timestamp;
	private double speed;
	private double alignRoll;
	private double algnPitch;
	private double latitude;
	private double batteryStatus;
	private String lastSeen;
	private String status;
	
	/*
	 * empty Constructor
	 */
	public DroneDynamics() {
		
	}
	
	/*
	 * complete Constructor
	 */
	public DroneDynamics(Drone drone, String timestamp, double speed, double alignRoll, double alignPitch,
			double latitude, double batteryStatus, String lastSeen, String status) {
		this.drone = drone;
		this.timestamp = timestamp;
		this.speed = speed;
		this.alignRoll = alignRoll;
		this.algnPitch = alignPitch;
		this.latitude = latitude;
		this.batteryStatus = batteryStatus;
		this.lastSeen = lastSeen;
		this.status = status;
	}
	
	/**
	 * @return the drone
	 */
	public Drone getDrone() {
		return drone;
	}
	/**
	 * @param drone the drone to set
	 */
	public void setDrone(Drone drone) {
		this.drone = drone;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	/**
	 * @return the alignRoll
	 */
	public double getAlignRoll() {
		return alignRoll;
	}
	/**
	 * @param alignRoll the alignRoll to set
	 */
	public void setAlignRoll(double alignRoll) {
		this.alignRoll = alignRoll;
	}
	/**
	 * @return the algnPitch
	 */
	public double getAlgnPitch() {
		return algnPitch;
	}
	/**
	 * @param algnPitch the algnPitch to set
	 */
	public void setAlgnPitch(double algnPitch) {
		this.algnPitch = algnPitch;
	}
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the batteryStatus
	 */
	public double getBatteryStatus() {
		return batteryStatus;
	}
	/**
	 * @param batteryStatus the batteryStatus to set
	 */
	public void setBatteryStatus(double batteryStatus) {
		this.batteryStatus = batteryStatus;
	}
	/**
	 * @return the lastSeen
	 */
	public String getLastSeen() {
		return lastSeen;
	}
	/**
	 * @param lastSeen the lastSeen to set
	 */
	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
