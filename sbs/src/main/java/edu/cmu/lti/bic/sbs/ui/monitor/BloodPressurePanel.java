package edu.cmu.lti.bic.sbs.ui.monitor;

import javax.swing.*;

/**
 * 
 * @author Guan Wang
 *
 */
public class BloodPressurePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6517202788272692449L;
	private JLabel bloodPressureLabel = null;

	public BloodPressurePanel() {
		bloodPressureLabel = new JLabel("BP: ?/? mmHg");
		this.add(bloodPressureLabel);
	}

	public void setBloodPressure(int upperBloodPressureData,
			int lowerBloodPressureData) {
		bloodPressureLabel.setText("BP: " + upperBloodPressureData + "\\"
				+ lowerBloodPressureData + " mmHg");
	}

}
