package test;
include test.models.Planet;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public showPlanetDialog(Planet model) {
		InfoView view = new PlanetInfoView(model);
		view.showView();
	}

}
