package test.view;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class InfoView extends JPanel{

	public InfoView(Object model) {
		// TODO Auto-generated constructor stub
	}
	
	public void showView() {
		JDialog dlg = new JDialog();
		dlg.add(this);
		dlg.setVisible(true);
	}
	
	public int isOpened() {
		if (this.isShowing()) {
			return 1;
		} else {
			return 0;
		}
	}

}
