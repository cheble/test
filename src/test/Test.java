package test;
import test.models.Planet;
import test.view.InfoView;
import test.view.PlanetInfoView;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void showPlanetDialog(Planet model) {
		InfoView view = new PlanetInfoView(model);
		view.showView();
	}

}
