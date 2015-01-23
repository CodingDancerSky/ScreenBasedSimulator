package edu.cmu.lti.bic.sbs.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class MonitorPanel extends JPanel{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonitorPanel window = new MonitorPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public MonitorPanel()  {
		//this.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		initialize();
	}

	JPanel bloodPressurePanel;
	JPanel heartRatePanel;
	JPanel oxygenLevelPanel;
	JPanel respiratoryRatePanel;
	
	JLabel bloodPressureLabel;
	JLabel heartRateLabel; 
	JLabel oxygenLevelLabel;
	JLabel respiratoryRateLabel; 
	private void initialize() {
		/*frame = new JFrame();
		frame.setBounds(100, 60, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel monitorPanel = new JPanel();
		monitorPanel.setBorder(new TitledBorder(null, "Monitor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		monitorPanel.setBounds(327, 61, 100, 230);
		frame.getContentPane().add(monitorPanel);
		monitorPanel.setLayout(null);*/
		this.setBorder(new TitledBorder(null, "Monitor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.setBounds(327, 61, 100, 230);
		//this.setSize(100, 230);
		//frame.getContentPane().add(monitorPanel);
		this.setLayout(null);
		
		bloodPressurePanel = new JPanel();
		bloodPressurePanel.setBorder(new TitledBorder(null, "BP", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		bloodPressurePanel.setBounds(6, 20, 90, 50);
		this.add(bloodPressurePanel);
		//monitorPanel.add(bloodPressurePanel);
		
		heartRatePanel = new JPanel();
		heartRatePanel.setBorder(new TitledBorder(null, "HR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		heartRatePanel.setBounds(6, 70, 90, 50);
		this.add(heartRatePanel);
		//monitorPanel.add(heartRatePanel);
		
		JPanel oxygenLevelPanel = new JPanel();
		oxygenLevelPanel.setBorder(new TitledBorder(null, "SpO2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		oxygenLevelPanel.setBounds(6, 120, 90, 50);
		this.add(oxygenLevelPanel);
		//monitorPanel.add(oxygenLevelPanel);
		
		JPanel respiratoryRatePanel = new JPanel();
		respiratoryRatePanel.setBorder(new TitledBorder(null, "RR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		respiratoryRatePanel.setBounds(6, 170, 90, 50);
		this.add(respiratoryRatePanel);
		//monitorPanel.add(respiratoryRatePanel);
		
		
		bloodPressureLabel = new JLabel("?/? mmHg");
		bloodPressurePanel.add(bloodPressureLabel);
		
		heartRateLabel = new JLabel("? bpm");
		heartRatePanel.add(heartRateLabel);
		
		oxygenLevelLabel = new JLabel("? %");
		oxygenLevelPanel.add(oxygenLevelLabel);
		
		respiratoryRateLabel = new JLabel("?");
		respiratoryRatePanel.add(respiratoryRateLabel);
	}
	public void setBloodPressure(int bloodPressureUpperBound,int bloodPressureLowerBound){
		bloodPressureLabel.setText(bloodPressureUpperBound+"/"+bloodPressureLowerBound+" mmHg");
	}
	public void setHeartRate(int heartRate){
		heartRateLabel.setText(heartRate+" bpm");
	}
	public void setOxygenLevel(int oxygenLevel){
		oxygenLevelLabel.setText(oxygenLevel+" %");
	}
	public void setRespiratoryRate(int respiratoryRate){
		respiratoryRateLabel.setText(""+respiratoryRate);
	}
}
