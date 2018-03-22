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
	
	//JElemente deklariert
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
    	//erzeugen von Panels
    	pnl_rahmen = new JPanel(new BorderLayout());
    	pnl_south = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	pnl_center = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 11));
    	
    	BoxLayout boxLayout= new BoxLayout(pnl_center, BoxLayout.Y_AXIS);
    	
    	// Buttons zum Panel hinzufuegen und gleichzeitig inizialisieren
    	pnl_south.add(btn_KundeSuchen = new JButton("   Kunde suchen   "));
    	
    	//ActionListener zu JButtons hinzufuegen
    	btn_KundeSuchen.addActionListener(new Btn_kunde_suchen_ActionListener());
    	
    	//Dimensionen initialisieren und deklarieren
    	Dimension dim_lbl = new Dimension(150, 24);
    	Dimension dim_txt = new Dimension(400, 24); 
    	
    	// Erzeugung von Elementen
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
    	
    	//Adresse manueles Label+Textfeld, textfeld unsichtbar
    	JLabel lbl_Adresse=new JLabel("Adresse"); //Rechtschreibfehler korrigiert "Addresse"
    	lbl_Adresse.setPreferredSize(dim_lbl);
    	JTextField txt_Adresse =new JTextField();
    	txt_Adresse.setPreferredSize(dim_txt);
    	
    	//Panel Adresse mit "not visible" Textfeld als Platzhalter
    	JPanel pnl_Adresse=new JPanel(new GridLayout(1, 2));
    	pnl_Adresse.add(lbl_Adresse);
    	pnl_Adresse.add(txt_Adresse);
    	txt_Adresse.setVisible(false);
    
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

    	//Hinzufügen der Panels 
    	this.add(BorderLayout.CENTER, pnl_rahmen);
    	pnl_center.setLayout(boxLayout);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    	pnl_rahmen.add(BorderLayout.CENTER, pnl_center);
    	pnl_rahmen.add(BorderLayout.SOUTH, pnl_south);
    }
    
    /**
     * ActionListener fuer btn_kunde_suchen
     * 		zeigt VKundeSuchen
     * 
     * @author Tim Spürkel
     */
    public class Btn_kunde_suchen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			setVisible(false);
			zeigeKundeSuchen();
		}
    }
    
    protected abstract void zeigeKundeSuchen();
    
    public void fillKunde(MKunde pKunde) {
    }
}