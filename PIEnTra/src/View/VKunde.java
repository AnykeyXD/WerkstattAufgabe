package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	
	protected VLabelTextfeld ltf_KundenID;
    protected VLabelTextfeld ltf_FirmenName;
    protected VLabelTextfeld ltf_AnsprechPartner;
    protected VLabelTextfeld ltf_Branche;
    protected VLabelTextfeld ltf_Email;
    protected VLabelTextfeld ltf_Rufnummer;
    protected VLabelTextfeld ltf_Adresse;
    protected VLabelTextfeld ltf_Strasse;
    protected VLabelTextfeld ltf_PLZ;
    protected VLabelTextfeld ltf_Bundesland;
    protected VLabelTextfeld ltf_Stadt;
    protected JLabel lbl_West;
    protected JLabel lbl_North;
    protected JLabel lbl_East;
    protected JButton btn_KundeSuchen;
    protected JPanel  pnl_center;
    protected JPanel  pnl_south;
    protected JPanel  pnl_rahmen;
    protected JPanel  pnl_innenrahmen;
    /**
     * Default constructor
     */
    public VKunde() { }

    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/KundeVerwalten");   	
    	
    	JLabel lbl_Adresse =new JLabel("Adresse");
    	JTextField txt_Adresse = new JTextField();
    	pnl_rahmen = new JPanel(new BorderLayout());
    	pnl_south = new JPanel(new FlowLayout());
    	pnl_center = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 11));
    	pnl_innenrahmen =new JPanel(new FlowLayout(30, 40, 15));
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
    	lbl_East = new JLabel(""); 
    	lbl_North = new JLabel("");
    	lbl_West = new JLabel ("");   
    	
    	Dimension dimensionwest = new Dimension(20 ,10);
    	lbl_West.setPreferredSize(dimensionwest);
    	
    	Dimension dimensionnorth = new Dimension(10 ,20);
    	lbl_North.setPreferredSize(dimensionnorth);
    	
    	Dimension dimensioneast = new Dimension(20 ,10);
    	lbl_East.setPreferredSize(dimensioneast);
    	//txt_East.setVisible(false);
    	//txt_North.setVisible(false);
    	//txt_West.setVisible(false);
    	
    	JPanel pnl_adresse = new JPanel(new GridLayout(1,2));
    	pnl_adresse.add(lbl_Adresse);
    	pnl_adresse.add(txt_Adresse);
    	txt_Adresse.setVisible(false);
    	
    	//Label und Textfelder zum Panel hinzufügen
    	pnl_center.add(ltf_KundenID.getPanel());
    	pnl_center.add(ltf_FirmenName.getPanel());
    	pnl_center.add(ltf_AnsprechPartner.getPanel());
    	pnl_center.add(ltf_Branche.getPanel());
    	pnl_center.add(ltf_Email.getPanel());
    	pnl_center.add(ltf_Rufnummer.getPanel());
    	pnl_center.add(pnl_adresse);
    	pnl_center.add(ltf_Strasse.getPanel());
    	pnl_center.add(ltf_PLZ.getPanel());
    	pnl_center.add(ltf_Bundesland.getPanel());
    	pnl_center.add(ltf_Stadt.getPanel());

    	this.add(BorderLayout.CENTER, pnl_rahmen);
    	pnl_center.setLayout(boxLayout);
    	pnl_rahmen.add(BorderLayout.WEST, lbl_West);
    	pnl_rahmen.add(BorderLayout.NORTH, lbl_North);
    	pnl_rahmen.add(BorderLayout.EAST, lbl_East);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    	//pnl_rahmen.add(BorderLayout.CENTER, pnl_innenrahmen);
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