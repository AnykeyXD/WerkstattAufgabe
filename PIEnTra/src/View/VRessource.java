package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
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
    
	private JLabel lbl_proBeschreibung;
	private String test = "Test";
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
		cbx_produktName = new VLabelComboBox("Produkt", dim_lbl, dim_cbx);
    	cbx_trainer     = new VLabelComboBox("Trainer", dim_lbl, dim_cbx);
    	cbx_ort         = new VLabelComboBox("Ort",     dim_lbl, dim_cbx);
    	cbx_produktName.hinzufuegen("");
    	String[] test = {"", "Test1", "Test2", "Test3"};
    	cbx_trainer.vieleHinzufuegen(test);
    	cbx_produktName.vieleHinzufuegen(test);
    	cbx_ort.vieleHinzufuegen(test);
    
    	this.add(BorderLayout.CENTER, pnl_fenster = new JPanel(new BorderLayout()));
    	pnl_fenster.add(BorderLayout.CENTER, pnl_center = new JPanel(new FlowLayout()));
    	pnl_fenster.add(BorderLayout.SOUTH, pnl_button  = new JPanel(new FlowLayout(FlowLayout.LEFT)));
    	pnl_fenster.add(BorderLayout.EAST, pnl_beschreibung = new JPanel(new FlowLayout()));
    	
    	BoxLayout boxlayoutBeschreibung = new BoxLayout(pnl_beschreibung, BoxLayout.Y_AXIS);
    	BoxLayout boxlayout = new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	
    	pnl_center.setLayout(boxlayout);
    	pnl_beschreibung.setLayout(boxlayoutBeschreibung);	
    	
    	pnl_center.add(cbx_produktName.getPanel());
    	pnl_center.add(cbx_trainer.getPanel());
    	pnl_center.add(cbx_ort.getPanel());
    	
    	Box VerticalBox = Box.createVerticalBox();
    	VerticalBox.add(lbl_proBeschreibung = new JLabel("Produktbeschreibung:            "));
    	VerticalBox.add(jta_preBeschreibung = new JTextArea());
    	
    	pnl_beschreibung.add(VerticalBox);
    	
    	
    	jta_preBeschreibung.setPreferredSize(dim_textarea);
    	jta_preBeschreibung.setMaximumSize(dim_textarea);
    	jta_preBeschreibung.setEditable(false);
    	
     	this.setSize(550,300);
    	
//      	pnl_button=new JPanel();
     
    	

    	//    	pnl_fenster.setLayout(new BorderLayout());
//    	pnl_fenster.add(pnl_center, boxlayout.Y_AXIS);
//    	pnl_center.setLayout(boxlayout);
       	
//    	pnl_fenster.add(pnl_button, borderlayout.SOUTH);
    	
    	
    	
    	    
    	}
}