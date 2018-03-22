package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CTrainingKonfigurieren;

/**
 * View Klasse für die View, mit der man Trainingskonfigurieren kann
 * 
 * @author joern
 */
@SuppressWarnings("serial")
public class VTrainingKonfigurieren extends VTraining 
{
	private JButton btn_kundeWaehlen;
    private JButton btn_ressourcenWaehlen;
    private JButton btn_trainingSpeichern ;
    
    private VLabelTextfeld ltf_kunden_id       = new VLabelTextfeld("Kunden-ID", dim_label, dim_textID_Tage);
    private VLabelTextfeld ltf_ansprechpartner = new VLabelTextfeld("Ansprechenpartner", dim_label, dim_textStandart);
   
    private CTrainingKonfigurieren controller;

    
    /**
     * Konstruktor
     * @param pController
     */
    public VTrainingKonfigurieren(CTrainingKonfigurieren pController) 
    {
    	controller = pController;
    	init();
    }
 
    /**
     * Komponenten initialisen
     */
    public void init()
    {	
    	super.init();	//Supercontroller Initialisierung
    	super.setTxt_Postion("PlEnTra/TrainingKonfigurieren");
    	
    	//Buttons initialisieren
    	btn_kundeWaehlen      = new JButton("Kunde wählen");
    	btn_ressourcenWaehlen = new JButton("Ressourcen wählen");
    	btn_trainingSpeichern = new JButton("Training speichern");
    	
    	//LabelTextfelder dem entsprechenden Panel in der richtigen Reihenfolge hinzufuegen
    	pnl_ltfs.add(ltf_kunden_id.getPanel());
    	pnl_ltfs.add(ltf_firmenName.getPanel());
    	pnl_ltfs.add(ltf_ansprechpartner.getPanel());
    	pnl_ltfs.add(ltf_proBeschreibung.getPanel());
    	pnl_ltfs.add(ltf_anfangsDatum.getPanel());
    	pnl_ltfs.add(ltf_endDatum.getPanel());
    	pnl_ltfs.add(ltf_tage.getPanel());
    	pnl_ltfs.add(ltf_trainer.getPanel());
    	pnl_ltfs.add(ltf_bemerkung.getPanel());
    	
    	//LabelTextfelder die nicht veraendert werden sollen als solche setzten
    	ltf_firmenName.setEditable(false);
    	ltf_ansprechpartner.setEditable(false);
    	ltf_proBeschreibung.setEditable(false);
    	ltf_trainer.setEditable(false);
    	ltf_ort.setEditable(false);
    	
    	//Buttons dem entsprechenden Panel in der richtigen Reihenfolge hinzufuegen
    	pnl_buttons.add(btn_kundeWaehlen);
    	pnl_buttons.add(btn_ressourcenWaehlen);
    	pnl_buttons.add(btn_trainingSpeichern);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
    	//ActionListener setzten
    	btn_kundeWaehlen.addActionListener(new Btn_kunde_Waehlen_ActionListener());
    	btn_ressourcenWaehlen.addActionListener(new Btn_ressource_Waehlen_ActionListener());
    	btn_trainingSpeichern.addActionListener(new Btn_training_Speichern_ActionListener());
    	
    	this.setSize(700, 500);
    	this.setVisible(true);
    }
    
    /**
     * Fuellt das Formualr mit den Uebergebenen Werten
     * @param pKundenID
     * @param pFirmenname
     * @param pProBeschreibung
     * @param pAnfangsDatum
     * @param pEndDatum
     * @param pTage
     * @param pTrainer
     * @param pBemerkung
     */
    public void textfelderFuellen(String pKundenID,
    							  String pFirmenname,
    							  String pAnsprechpartner,
    							  String pProBeschreibung,
    							  String pAnfangsDatum,
    							  String pEndDatum, 
    							  String pTage, 
    							  String pTrainer, 
    							  String pBemerkung)
    {
    	ltf_kunden_id.setText(pKundenID);
    	ltf_firmenName.setText(pFirmenname);
    	ltf_ansprechpartner.setText(pAnsprechpartner);
    	ltf_proBeschreibung.setText(pProBeschreibung);
    	ltf_anfangsDatum.setText(pAnfangsDatum);
    	ltf_endDatum.setText(pEndDatum);
    	ltf_tage.setText(pTage);
    	ltf_trainer.setText(pTrainer);
    	ltf_bemerkung.setText(pBemerkung);
    }
    
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		Zeigt VRessourceWaehlen
     * 
     * @author joern
     */
    public class Btn_ressource_Waehlen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createRessourceWaehlen();
		}
    }
    
    /**
     * ActionListener fuer btn_kundeWaehlen
     * 		Zeigt VKundeWaehlen
     * 
     * @author joern
     */
    public class Btn_kunde_Waehlen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createKundeWaehlen();
		}
    }
    
    /**
     * ActionListener fuer btn_trainingSpeichern
     * 		Speichert das Training
     * 		Zeigt VHauptmenu
     * 
     * @author joern
     */
    public class Btn_training_Speichern_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			controller.trainingSpeichern();
		}
    }

    /**
     * Hauptmenu setzten
     */
	@Override
	protected void setHauptmenue() 
	{
		controller.setHauptmenue();
	}

	/**
	 * Fuellt das Formular mit Kundeninformationen
	 * 	->	wird aufgerufen, wenn man ueber die View VKundeWaehlen einen Kunden auswaehlt
	 * @param pKundenID
	 * @param pFirmenname
	 * @param pAnsprechpartner
	 */
	public void kundenInformationenSetzen(int pKundenID, String pFirmenname, String pAnsprechpartner) 
	{
		ltf_kunden_id.setText(pKundenID + "");
		ltf_firmenName.setText(pFirmenname);
		ltf_ansprechpartner.setText(pAnsprechpartner);
	}
}