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
 * Abstrakte Vorlagenklasse f�r VTrainingKonfigurieren
 * 								VTrainingAendern
 * 								VTrainingLoeschen
 * 
 * @author joern
 */
@SuppressWarnings("serial")
public abstract class VTraining extends VGrundFenster 
{
	//Dimensionen initialisieren und deklarieren
	protected Dimension dim_label         = new Dimension(150, 24);
	protected Dimension dim_textTage      = new Dimension( 50, 24);
	protected Dimension dim_textID_Tage   = new Dimension(150, 24);
    protected Dimension dim_textStandart  = new Dimension(300, 24);
    protected Dimension dim_textBemerkung = new Dimension(300, 24);
    
    //VLabelTextfelder deklarieren und initialisieren
	protected VLabelTextfeld ltf_firmenName 	 = new VLabelTextfeld("Firmenname:", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_ansprechpartner = new VLabelTextfeld("Ansprechpartner", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_proBeschreibung = new VLabelTextfeld("Produktbezeichnung", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_anfangsDatum    = new VLabelTextfeld("Anfangsdatum", dim_label, dim_textID_Tage);
    protected VLabelTextfeld ltf_endDatum 		 = new VLabelTextfeld("Enddatum", dim_label, dim_textID_Tage);
    protected VLabelTextfeld ltf_tage 			 = new VLabelTextfeld("Tage", dim_label, dim_textTage);	
    protected VLabelTextfeld ltf_trainer         = new VLabelTextfeld("Trainer", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_ort 			 = new VLabelTextfeld("Ort", dim_label, dim_textStandart);
    protected VLabelTextfeld ltf_bemerkung 		 = new VLabelTextfeld("Bemerkung:", dim_label, dim_textBemerkung);
    
    //JPanels deklarieren
    protected JPanel pnl_center;
    protected JPanel pnl_ltfs;
    protected JPanel pnl_buttons;
    
    protected JButton btn_zurueckZumHauptmenu;

    /**
     * Komponenten initialisieren
     */
    public void init()
    {
    	super.init();
    		
    	pnl_ltfs    = new JPanel(new FlowLayout());
    	pnl_buttons = new JPanel(new FlowLayout());
    	
    	//Boxlayout zur Anordnung der LabelTextfelder untereinandner
    	BoxLayout boxLayout= new BoxLayout(pnl_ltfs, BoxLayout.Y_AXIS);
    	pnl_ltfs.setLayout(boxLayout);
    	
    	//Panel f�r den CENTER Bereich des Grundfensters
    	this.add(BorderLayout.CENTER, pnl_center = new JPanel(new BorderLayout()));
    	
    	//Panels einfuegen
    	pnl_center.add(BorderLayout.CENTER, pnl_ltfs);
    	pnl_center.add(BorderLayout.SOUTH,  pnl_buttons);
    	
    	//btn_zurueckZumHauptmenu fuer alle Trainingsviews gleiche funktionallit�t und Aussehen
    	btn_zurueckZumHauptmenu = new JButton("Zurueck zum Hauptmenue");
    	btn_zurueckZumHauptmenu.addActionListener(new btn_zurueckZumHauptmenu());
    }
    
    /**
     * ActionListener fuer btn_zurueckZumHauptmenu
     * 		zeigt das Hauptmenue
     * 
     * @author joern
     */
    public class btn_zurueckZumHauptmenu implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			setVisible(false);
			setHauptmenue();
		}  	
    }
    
    /**
     * Abstracte Methode, von jedem View geht es ins Hauptmen� - Implementierung kann abweichen
     */
    protected abstract void setHauptmenue();
}