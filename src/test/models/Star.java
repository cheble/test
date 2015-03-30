package test.models;

public class Star {
	
	private String _id;
	
	private String[] _names;
	
	// mass in solar mass
	private double _mass;
	
	private double _luminosity;
	
	private double _radius;
	
	private double _age;

	public Star() {
	}

	public Star(String id) {
		_id = id;
	}

}
