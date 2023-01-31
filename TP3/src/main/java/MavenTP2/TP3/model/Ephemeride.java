package MavenTP2.TP3.model;

public class Ephemeride {
	private Doble latitude;
	private Doble longitude;
	private String insee;
	private int day;
	private String datetime;
	private String sunrise;
	private String sunset;
	private String duration_day;
	private int diff_duration_day;
	
	public Doble getLatitude() {
		return latitude;
	}

	public void setLatitude(Doble latitude) {
		this.latitude = latitude;
	}
	
	public Doble getLongitude() {
		return longitude;
	}

	public void setLongitude(Doble longitude) {
		this.longitude = longitude;
	}
	
	public String getInsee() {
		return insee;
	}

	public void setInsee(String insee) {
		this.insee = insee;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	
	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	
	public String getDurationDay() {
		return duration_day;
	}

	public void setDurationDay(String duration_day) {
		this.duration_day = duration_day;
	}
	
	public void setDiffDurationDay(int diff_duration_day) {
		this.diff_duration_day = diff_duration_day;
	}
	
	public int getDiffDurationDay() {
		return diff_duration_day;
	}
}