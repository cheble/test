package test;
import javax.swing.JFrame;

import test.models.Moon;
import test.models.Planet;
import test.models.Star;
import test.view.InfoView;
import test.view.PlanetInfoView;

public class Test {
	
	private JFrame _frame;

	public Test() {
		_frame = new JFrame("Test");
	}

	public static void main(String[] args) {
		Star sun = new Star();
		Planet earth = new Planet();
		Moon moon = new Moon();
		Planet mars = new Planet();
		Planet mercury = new Planet();
		Planet venus = new Planet();
		
		Test test = new Test();
		test._frame.setVisible(true);
		
		
	}
	
	public void showPlanetDialog(Planet model) {
		InfoView view = new PlanetInfoView(model);
		view.showView();
	}

}
