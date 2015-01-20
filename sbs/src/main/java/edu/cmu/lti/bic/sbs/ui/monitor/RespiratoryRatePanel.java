package edu.cmu.lti.bic.sbs.ui.monitor;

import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
/**
 * 
 * @author Guan Wang
 *
 */
public class RespiratoryRatePanel extends Panel {
	private Label respiratoryRateLabel=null;
	private final static int width=17;
	private final static int height=3;
	public RespiratoryRatePanel(){
		super(new Border.Bevel(true),Panel.Orientation.HORISONTAL);
		this.setPreferredSize(new TerminalSize(width,height));
		respiratoryRateLabel=new Label("RR: ?", Terminal.Color.GREEN);
		this.addComponent(respiratoryRateLabel);
	}
	public void setRespiratoryRate(int respiratoryRateData){
		respiratoryRateLabel.setText("RR: "+respiratoryRateData+"");
	}
}
