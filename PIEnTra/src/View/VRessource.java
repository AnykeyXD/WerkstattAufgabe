package View;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 * 
 * @author Leon & Chris
 * JComboBoxen nach dem VComboxformat,
 */
public abstract class VRessource extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
    private VLabelComboBox cbx_produktName;
    private VLabelComboBox cbx_trainer;
    private VLabelComboBox cbx_ort;
    private JTextArea lbl_preBeschreibung;
    protected JPanel pnl_center;
    protected JPanel pnl_button;
    protected JPanel pnl_fenster;
    protected JButton btn_zurueck;
    public void init()
    {
    	super.init();
		cbx_produktName = new VLabelComboBox("Produkt");
    	cbx_trainer = new VLabelComboBox("Trainer");
    	cbx_ort = new VLabelComboBox("Ort");
    	cbx_produktName.hinzufuegen("");
    
    	this.add(BorderLayout.CENTER, pnl_fenster = new JPanel(new BorderLayout()));
    	pnl_fenster.add(BorderLayout.CENTER, pnl_center = new JPanel(new FlowLayout()));
    	pnl_fenster.add(BorderLayout.SOUTH, pnl_button  = new JPanel(new FlowLayout(FlowLayout.LEFT)));
    	
    	BoxLayout boxlayout = new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	pnl_center.setLayout(boxlayout);
    	
    	pnl_center.add(cbx_produktName.getPanel());
    	pnl_center.add(cbx_trainer.getPanel());
    	pnl_center.add(cbx_ort.getPanel());
    	
    	
     	
    
     	this.setSize(550,650);
    	
//      	pnl_button=new JPanel();
     
    	

    	//    	pnl_fenster.setLayout(new BorderLayout());
//    	pnl_fenster.add(pnl_center, boxlayout.Y_AXIS);
//    	pnl_center.setLayout(boxlayout);
       	
//    	pnl_fenster.add(pnl_button, borderlayout.SOUTH);
//    	lbl_preBeschreibung = new JTextArea();
    	
    	
    	
    	    
    	}
}