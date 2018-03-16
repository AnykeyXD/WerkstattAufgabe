package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
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
	
	//Dimensionen initialisieren und deklarieren
	protected Dimension dim_label         = new Dimension(150, 24);
	protected Dimension dim_textTage      = new Dimension(50, 24);
	protected Dimension dim_textID_Tage   = new Dimension(150, 24);
    protected Dimension dim_textStandart  = new Dimension(300, 24);
    protected Dimension dim_textBemerkung = new Dimension(300, 24);
    
    //VLabelTextfelder deklarieren und initialisieren
	protected VLabelTextfeld ltf_kunden_id		 
			= new VLabelTextfeld("Kunden-ID", dim_label, dim_textID_Tage);
	protected VLabelTextfeld ltf_firmenName		 
			= new VLabelTextfeld("Firmenname:", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_ansprechpartner 
    		= new VLabelTextfeld("Ansprechpartner", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_proBeschreibung 
    		= new VLabelTextfeld("Produktbeschreibung", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_anfangsDatum	
    		= new VLabelTextfeld("Anfangsdatum", dim_label, dim_textID_Tage);
    protected VLabelTextfeld ltf_endDatum		 
    		= new VLabelTextfeld("Enddatum", dim_label, dim_textID_Tage);
    protected VLabelTextfeld ltf_tage			 
    		= new VLabelTextfeld("Tage", dim_label, dim_textTage);	
    protected VLabelTextfeld ltf_trainer		 
    		= new VLabelTextfeld("Trainer", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_ort			 
    		= new VLabelTextfeld("Ort", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_bemerkung 		
    		= new VLabelTextfeld("Bemerkung:", dim_label, dim_textBemerkung);
    
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