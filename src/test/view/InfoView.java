package test.view;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class InfoView extends JPanel{
	
	private Object _model;

	public InfoView(Object model) {
		_model = model;
	}
	
	public void showView() {
		JDialog dlg = new JDialog();
		dlg.add(this);
		dlg.setVisible(true);
	}
	
	public boolean isOpen() {
		return this.isShowing();
	}
	
	public Object getModel() {
		return _model;
	}

}
