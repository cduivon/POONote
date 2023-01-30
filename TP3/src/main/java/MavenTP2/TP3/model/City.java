package MavenTP2.TP3.model;

public class City {
	
	private String insee;
	private int cp;
	private Double latitude;
	private Double longitude;
	private int altitude;
	private String name;
	
	public String getInsee() {
		return insee;
	}
	public void setInsee(String insee) {
		this.insee = insee;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
