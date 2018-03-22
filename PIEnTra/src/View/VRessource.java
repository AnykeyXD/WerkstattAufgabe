package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * @author Leon & Chris
 * JComboBoxen nach dem VComboxformat,
 */
public abstract class VRessource extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
    
	private JLabel lbl_proBeschreibung;
    private JTextArea jta_preBeschreibung;
    protected JPanel pnl_center;
    protected JPanel pnl_button;
    protected JPanel pnl_fenster;
    protected JPanel pnl_beschreibung;
    protected JButton btn_zurueck;
   
    Dimension dim_lbl = new Dimension(100, 10);
    Dimension dim_cbx = new Dimension(100, 20);
    Dimension dim_textarea = new Dimension(300,100);
    
    protected VLabelComboBox cbx_produktName;
    protected VLabelComboBox cbx_trainer;
    protected VLabelComboBox cbx_ort;
    
    public void init()
    {
    	super.init();
    	/**
    	 * @author Leon und Chris
    	 * @param cbx_produktName: Die ComboBox, welche die Produktbezeichnungen enthält. 
    	 * @param cbx_trainer: Die ComboBox, welche die verschiedenen Trainer enthält.
    	 * @param cbx_ort: Die ComboBox, welche die verschiedenen Orte enthält.
    	 * Größe der ComboBoxen wird ebenfalls eingestellt
    	 */
		cbx_produktName = new VLabelComboBox("Produkt", dim_lbl, dim_cbx);
    	cbx_trainer     = new VLabelComboBox("Trainer", dim_lbl, dim_cbx);
    	cbx_ort         = new VLabelComboBox("Ort",     dim_lbl, dim_cbx);
    	String[] test = {"3", "2", "1"};
    	cbx_trainer.vieleHinzufuegen(test);
    	cbx_ort.vieleHinzufuegen(test);
    	
    	/**
    	 * @author Chris und Leon
    	 * Positionierung der verschiedenen Panels
    	 */
    	
    	this.add(BorderLayout.CENTER, pnl_fenster = new JPanel(new BorderLayout()));
    	pnl_fenster.add(BorderLayout.CENTER, pnl_center = new JPanel(new FlowLayout()));
    	pnl_fenster.add(BorderLayout.SOUTH, pnl_button  = new JPanel(new FlowLayout(FlowLayout.LEFT)));
    	pnl_fenster.add(BorderLayout.EAST, pnl_beschreibung = new JPanel(new FlowLayout()));
    	BoxLayout boxlayoutBeschreibung = new BoxLayout(pnl_beschreibung, BoxLayout.Y_AXIS);
    	BoxLayout boxlayout = new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	pnl_center.setLayout(boxlayout);
    	pnl_beschreibung.setLayout(boxlayoutBeschreibung);	
    	
    	/**
    	 * @author Leon und Chris
    	 * Hinzufügen des Panels
    	 */
    	pnl_center.add(cbx_produktName.getPanel());
    	pnl_center.add(cbx_trainer.getPanel());
    	pnl_center.add(cbx_ort.getPanel());
    	
    	/**
    	 * @author Chris und Leon
    	 * Die Textarea und das Beschreibungslabel sind in einer Vertikalen Box eingefügt, um sie genau untereinander
    	 * zu positionieren.
    	 */
    	Box VerticalBox = Box.createVerticalBox();
    	VerticalBox.add(lbl_proBeschreibung = new JLabel("Produktbeschreibung:             "));
    	VerticalBox.add(jta_preBeschreibung = new JTextArea());
    	
    	pnl_beschreibung.add(VerticalBox);
    	
    	
    	jta_preBeschreibung.setPreferredSize(dim_textarea);
    	jta_preBeschreibung.setMaximumSize(dim_textarea);
    	jta_preBeschreibung.setEditable(false);
    	
     	this.setSize(550,300);    	    
    	}
}
