package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author joern
 */
public abstract class VTraining extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	private VLabelTextfeld ltf_kunden_id;
    private VLabelTextfeld ltf_firmenName;
    private VLabelTextfeld ltf_ansprechpartner;
    private VLabelTextfeld ltf_proBeschreibung;
    private VLabelTextfeld ltf_anfangsDatum;
    private VLabelTextfeld ltf_endDatum;
    private VLabelTextfeld ltf_tage;
    private VLabelTextfeld ltf_trainer;
    private VLabelTextfeld ltf_ort;
    private VLabelTextfeld ltf_training;
    private VLabelTextfeld ltf_bemerkung;
    
    private JPanel pnl_center;
    private JPanel pnl_ltfs;
    private JPanel pnl_buttons;
    
    private JButton btn_zurueckZumHauptmenu;

    public void init()
    {
    	super.init();
   
    	ltf_training = new VLabelTextfeld("Trainings-ID:");
    	ltf_firmenName = new VLabelTextfeld("Firmenname:");
    	ltf_proBeschreibung = new VLabelTextfeld("Produk: ");
    	ltf_anfangsDatum = new VLabelTextfeld("Startdatum: ");
    	ltf_endDatum = new VLabelTextfeld("Enddatum:");
    	ltf_tage = new VLabelTextfeld("Tage: ");
    	ltf_trainer = new VLabelTextfeld("Trainer: ");
    	ltf_bemerkung = new VLabelTextfeld("Bemerkung:");
    	
    	btn_zurueckZumHauptmenu = new JButton("Zurueck zum Hauptmenue");
    	btn_zurueckZumHauptmenu.addActionListener(new btn_zurueckZumHauptmenu());
    }
    
    public class btn_zurueckZumHauptmenu implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			// TODO Auto-generated method stub	
		}  	
    }
}