package test;
import javax.swing.JFrame;

import test.models.Planet;
import test.view.InfoView;
import test.view.PlanetInfoView;

public class Test {
	
	private JFrame _frame;

	public Test() {
		_frame = new JFrame("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void showPlanetDialog(Planet model) {
		InfoView view = new PlanetInfoView(model);
		view.showView();
	}

}
