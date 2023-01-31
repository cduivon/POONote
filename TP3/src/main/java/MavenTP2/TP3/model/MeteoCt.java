package MavenTP2.TP3.model;

public class MeteoCt {
	
	private City[] cities;
	private Ephemeride[] ephemerides;

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}
	
	public Ephemeride[] getEphemerides() {
		return ephemerides;
	}

	public void setEphemerides(Ephemeride[] ephemerides) {
		this.ephemerides = ephemerides;
	}

}
