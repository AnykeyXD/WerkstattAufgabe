package View;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

/**
 * 
 * @author Leon
 *
 */
public abstract class VRessource extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
    private VComboBox cbx_produktName;
    private VComboBox cbx_trainer;
    private VComboBox cbx_ort;
    private VLabelTextfeld ltf_proBezeichnung;
    private VLabelTextfeld ltf_trainer;
    private VLabelTextfeld ltf_ort;
    private JButton btn_zurueck;
    private JLabel lbl_preBeschreibung;
    private JPanel pnl_center;
    private JPanel pnl2;
    /**
     * Default constructor
     */


    public void init()
    {
    	super.init();
    	
		cbx_produktName = new VComboBox("Produkt");
    	cbx_trainer = new VComboBox("Trainer");
    	cbx_ort = new VComboBox("Ort");
    	pnl_center = new JPanel(new FlowLayout(FlowLayout.LEFT));
       	pnl_center.add(cbx_produktName.getPanel());
    	pnl_center.add(cbx_trainer.getPanel());
    	pnl_center.add(cbx_ort.getPanel());
    	pnl_center.add(btn_zurueck = new JButton("Zurueck zu Training konfigurieren."));
    	add(BorderLayout.CENTER,pnl_center);
    }
}