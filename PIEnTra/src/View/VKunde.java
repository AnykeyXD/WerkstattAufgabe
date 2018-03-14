package View;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.CHauptMenu;
import Modell.MKunde;
import View.VHauptMenu.btn_kunde_verwalten_ActionListener;
import View.VHauptMenu.btn_produkt_definieren_ActionListener;
import View.VHauptMenu.btn_training_aendern_ActionListener;
import View.VHauptMenu.btn_training_konfigurieren_ActionListener;
import View.VHauptMenu.btn_training_loeschen_ActionListener;
import View.VHauptMenu.btn_verlassen_ActionListener;

/**
 * 
 */
public abstract class VKunde extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	private VLabelTextfeld ltf_KundenID;
    private VLabelTextfeld ltf_FirmenName;
    private VLabelTextfeld ltf_AnsprechPartner;
    private VLabelTextfeld ltf_Branche;
    private VLabelTextfeld ltf_Email;
    private VLabelTextfeld ltf_Rufnummer;
    private JLabel lbl_Adresse;
    private VLabelTextfeld ltf_Strasse;
    private VLabelTextfeld ltf_PLZ;
    private VLabelTextfeld ltf_Bundesland;
    private VLabelTextfeld ltf_Stadt;
    private JButton btn_KundeSuchen;
    private JPanel  pnl_center;
    private JPanel  pnl_south;
    private JPanel  pnl_rahmen;

    public void init()
    {
    	super.init();   	
    	
    	pnl_rahmen = new JPanel(new BorderLayout());
    	pnl_south = new JPanel(new FlowLayout());
    	pnl_center = new JPanel();
    	
    	BoxLayout boxLayout= new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	// Buttons zum Panel hinzufuegen und gleichzeitig inizialisieren
    	pnl_south.add(btn_KundeSuchen = new JButton("   Kunde suchen   "));
    	
    	//ActionListener zu JButtons hinzufuegen
    	btn_KundeSuchen.addActionListener(new btn_KundeSuchen_ActionListener());
    	
    	ltf_KundenID = new VLabelTextfeld("Kunden-ID:");
    	ltf_FirmenName = new VLabelTextfeld("Firmenname:");
    	ltf_AnsprechPartner = new VLabelTextfeld("Ansprechpartner:");
    	ltf_Branche = new VLabelTextfeld("Branche:");
    	ltf_Email = new VLabelTextfeld("EMail:");
    	ltf_Rufnummer = new VLabelTextfeld("Rufnummer:");
    	lbl_Adresse =new JLabel("Adresse"); //Rechtschreibfehler korrigiert "Addresse"
    	ltf_Strasse = new VLabelTextfeld("Strasse:");
    	ltf_PLZ = new VLabelTextfeld("Postleitzahl:");
    	ltf_Bundesland = new VLabelTextfeld("Bundesland:");
    	ltf_Stadt = new VLabelTextfeld("Stadt:");
    	
    	//Label und Textfelder zum Panel hinzufügen
    	pnl_center.add(ltf_KundenID.getPanel());
    	pnl_center.add(ltf_FirmenName.getPanel());
    	pnl_center.add(ltf_AnsprechPartner.getPanel());
    	pnl_center.add(ltf_Branche.getPanel());
    	pnl_center.add(ltf_Email.getPanel());
    	pnl_center.add(ltf_Rufnummer.getPanel());
    	pnl_center.add(lbl_Adresse);
    	pnl_center.add(ltf_Strasse.getPanel());
    	pnl_center.add(ltf_PLZ.getPanel());
    	pnl_center.add(ltf_Bundesland.getPanel());
    	pnl_center.add(ltf_Stadt.getPanel());

    	this.add(BorderLayout.CENTER, pnl_rahmen);
    	pnl_center.setLayout(boxLayout);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    	
    }

    public class btn_KundeSuchen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Kunde suchen");
		}
    	
    }    
    
   
    public void fillKunde(MKunde pKunde) {

    }

}