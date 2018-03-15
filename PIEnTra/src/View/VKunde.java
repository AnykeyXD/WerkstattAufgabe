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

import Modell.MKunde;


/**
 * 
 */
public abstract class VKunde extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	protected JTextField txt_Adresse;
	protected VLabelTextfeld ltf_KundenID;
    protected VLabelTextfeld ltf_FirmenName;
    protected VLabelTextfeld ltf_AnsprechPartner;
    protected VLabelTextfeld ltf_Branche;
    protected VLabelTextfeld ltf_Email;
    protected VLabelTextfeld ltf_Rufnummer;
    protected JLabel lbl_Adresse;
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

    	super.init();   	

    	
    	pnl_rahmen = new JPanel(new BorderLayout());
    	pnl_south = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	pnl_center = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 11));
    	pnl_innenrahmen =new JPanel(new FlowLayout(30, 40, 15));

    	pnl_center = new JPanel();
    	
    	BoxLayout boxLayout= new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	
    	// Buttons zum Panel hinzufuegen und gleichzeitig inizialisieren
    	pnl_south.add(btn_KundeSuchen = new JButton("   Kunde suchen   "));
    	
    	//ActionListener zu JButtons hinzufuegen
    	btn_KundeSuchen.addActionListener(new btn_KundeSuchen_ActionListener());
    	
    	//Größe der Textfelder und Labels festgelegt
    	Dimension dim_lbl = new Dimension(150, 24);
    	Dimension dim_txt = new Dimension(400, 24); 
    	
    	// erzeugung von Elementen
    	ltf_KundenID = new VLabelTextfeld("Kunden-ID:",dim_lbl,dim_txt);
    	ltf_FirmenName = new VLabelTextfeld("Firmenname:",dim_lbl,dim_txt);
    	ltf_AnsprechPartner = new VLabelTextfeld("Ansprechpartner:",dim_lbl,dim_txt);
    	ltf_Branche = new VLabelTextfeld("Branche:",dim_lbl,dim_txt);
    	ltf_Email = new VLabelTextfeld("EMail:",dim_lbl,dim_txt);
    	ltf_Rufnummer = new VLabelTextfeld("Rufnummer:",dim_lbl,dim_txt);
    	ltf_Strasse = new VLabelTextfeld("Strasse:",dim_lbl,dim_txt);
    	ltf_PLZ = new VLabelTextfeld("Postleitzahl:",dim_lbl,dim_txt);
    	ltf_Bundesland = new VLabelTextfeld("Bundesland:",dim_lbl,dim_txt);
    	ltf_Stadt = new VLabelTextfeld("Stadt:",dim_lbl,dim_txt);
    	lbl_East = new JLabel(""); 
    	lbl_North = new JLabel("");
    	lbl_West = new JLabel ("");   
    	
    	//Adresse manueles Label+Textfeld, textfeld unsichtbar
    	JLabel lbl_Adresse=new JLabel("Adresse"); //Rechtschreibfehler korrigiert "Addresse"
    	lbl_Adresse.setPreferredSize(dim_lbl);
    	JTextField txt_Adresse =new JTextField();
    	txt_Adresse.setPreferredSize(dim_txt);
    	
    	//panel Adresse mit not visible Textfeld als Platzhalter
    	JPanel pnl_Adresse=new JPanel(new GridLayout(1, 2));
    	pnl_Adresse.add(lbl_Adresse);
    	pnl_Adresse.add(txt_Adresse);
    	txt_Adresse.setVisible(false);
    	
    	/*Dimension dimensionwest = new Dimension(20 ,10);
    	lbl_West.setPreferredSize(dimensionwest);
    	Dimension dimensionnorth = new Dimension(10 ,20);
    	lbl_North.setPreferredSize(dimensionnorth);   
    	Dimension dimensioneast = new Dimension(20 ,10);
    	lbl_East.setPreferredSize(dimensioneast);*/
    	
    	
    	//Label und Textfelder zum Panel hinzufügen
    	pnl_center.add(ltf_KundenID.getPanel());
    	pnl_center.add(ltf_FirmenName.getPanel());
    	pnl_center.add(ltf_AnsprechPartner.getPanel());
    	pnl_center.add(ltf_Branche.getPanel());
    	pnl_center.add(ltf_Email.getPanel());
    	pnl_center.add(ltf_Rufnummer.getPanel());
    	pnl_center.add(pnl_Adresse);
    	pnl_center.add(ltf_Strasse.getPanel());
    	pnl_center.add(ltf_PLZ.getPanel());
    	pnl_center.add(ltf_Bundesland.getPanel());
    	pnl_center.add(ltf_Stadt.getPanel());

    	this.add(BorderLayout.CENTER, pnl_rahmen);
    	pnl_center.setLayout(boxLayout);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    	
    	//pnl_rahmen.add(BorderLayout.WEST, lbl_West);
    	//pnl_rahmen.add(BorderLayout.NORTH, lbl_North);
    	//pnl_rahmen.add(BorderLayout.EAST, lbl_East);
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