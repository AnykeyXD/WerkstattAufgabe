package View;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

/**
 * 
 * @author Leon
 * JComboBoxen nach dem VComboxformat,
 */
public abstract class VRessource extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
    private VComboBox cbx_produktName;
    private VComboBox cbx_trainer;
    private VComboBox cbx_ort;
    private JButton btn_zurueck;
    private JLabel lbl_preBeschreibung;
    protected JPanel pnl_center;
   
    public void init()
    {
    	super.init();
		cbx_produktName = new VComboBox("Produkt");
    	cbx_trainer = new VComboBox("Trainer");
    	cbx_ort = new VComboBox("Ort");
    	pnl_center= new JPanel();
    	BoxLayout boxlayout = new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	pnl_center.setLayout(boxlayout);
       	pnl_center.add(cbx_produktName.getPanel());
    	pnl_center.add(cbx_trainer.getPanel());
    	pnl_center.add(cbx_ort.getPanel());
    	pnl_center.add(btn_zurueck = new JButton("Zurueck zu Training konfigurieren."));
    	this.add(BorderLayout.CENTER, pnl_center);
    	
    }
}