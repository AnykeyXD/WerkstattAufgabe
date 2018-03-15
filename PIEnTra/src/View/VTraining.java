package View;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author joern
 */
public abstract class VTraining extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	protected VLabelTextfeld ltf_kunden_id;
	protected VLabelTextfeld ltf_firmenName;
    protected VLabelTextfeld ltf_ansprechpartner;
    protected VLabelTextfeld ltf_proBeschreibung;
    protected VLabelTextfeld ltf_anfangsDatum;
    protected VLabelTextfeld ltf_endDatum;
    protected VLabelTextfeld ltf_tage;
    protected VLabelTextfeld ltf_trainer;
    protected VLabelTextfeld ltf_ort;
    protected VLabelTextfeld ltf_training;
    protected VLabelTextfeld ltf_bemerkung;
    
    protected JPanel pnl_center;
    protected JPanel pnl_ltfs;
    protected JPanel pnl_buttons;
    
    protected JButton btn_zurueckZumHauptmenu;

    public void init()
    {
    	super.init();
    		
    	pnl_ltfs    = new JPanel(new FlowLayout());
    	pnl_buttons = new JPanel(new FlowLayout());
    	
    	//Boxlayout -> Elemente 
    	BoxLayout boxLayout= new BoxLayout(pnl_ltfs, BoxLayout.Y_AXIS);
    	pnl_ltfs.setLayout(boxLayout);
    	
    	//Panel für den CENTER Bereich des Grundfensters
    	this.add(pnl_center = new JPanel(new BorderLayout()));
    	
    	pnl_center.add(BorderLayout.CENTER, pnl_ltfs);
    	pnl_center.add(BorderLayout.SOUTH,  pnl_buttons);
    	
    	btn_zurueckZumHauptmenu = new JButton("Zurueck zum Hauptmenue");
    	//btn_zurueckZumHauptmenu.addActionListener(new btn_zurueckZumHauptmenu());
    }
    
    public class btn_zurueckZumHauptmenu implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			
		}  	
    }
}