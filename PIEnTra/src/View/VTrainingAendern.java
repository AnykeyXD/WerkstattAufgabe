package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

import Controller.CTrainingAendern;

/**
 * 
 * 
 * @author joern
 */
public class VTrainingAendern extends VTraining 
{
	private static final long serialVersionUID = 1L;
	
	private JButton btn_trainingSuchen        = new JButton("Training suchen");
    private JButton btn_RessourcenAendern     = new JButton("Ressource Ändern");
    private JButton btn_trainingAktualisieren = new JButton("Training aktualisieren");
    
    private VLabelTextfeld ltf_trainingsID 
    		= new VLabelTextfeld("Trainings-ID:", dim_label, dim_textID_Tage);

    private CTrainingAendern controller;
	
    /**
     * Konstruktor
     */
    public VTrainingAendern(CTrainingAendern pController) 
    {
    	controller = pController;
    	
    	init();	//Initialisierung
    }
    
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/TrainingÄndern");
    	
    	//ltfs ihrem entsprechenden Panel in der korrekten Reihenfolge hinzufuegen
    	pnl_ltfs.add(ltf_trainingsID.getPanel());
    	pnl_ltfs.add(ltf_firmenName.getPanel());
    	pnl_ltfs.add(ltf_ansprechpartner.getPanel());
    	pnl_ltfs.add(ltf_proBeschreibung.getPanel());
    	pnl_ltfs.add(ltf_anfangsDatum.getPanel());
    	pnl_ltfs.add(ltf_endDatum.getPanel());
    	pnl_ltfs.add(ltf_tage.getPanel());
    	pnl_ltfs.add(ltf_trainer.getPanel());
    	pnl_ltfs.add(ltf_ort.getPanel());
    	pnl_ltfs.add(ltf_bemerkung.getPanel());
    	
    	//LabelTextfelder die nicht verändert werden sollen als solche setzten
    	ltf_trainingsID.setEditable(false);
    	ltf_firmenName.setEditable(false);
    	ltf_ansprechpartner.setEditable(false);
    	ltf_proBeschreibung.setEditable(false);
    	ltf_trainer.setEditable(false);
    	ltf_ort.setEditable(false);
    	
    	btn_RessourcenAendern.setEnabled(false);
    	btn_trainingAktualisieren.setEnabled(false);
    	
    	//Buttons ihrem entsprechenden Panel in der korrekten Reihenfolge hinzufuegen
    	pnl_buttons.add(btn_trainingSuchen);
    	pnl_buttons.add(btn_RessourcenAendern);
    	pnl_buttons.add(btn_trainingAktualisieren);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
    	//FocusListener für Datumsberechnung setzten
      	ltf_endDatum.getPanel().getComponent(1).addFocusListener(new ltf_EndDatum_FocusListener());
      	ltf_tage.getPanel().getComponent(1).addFocusListener(new ltf_Tage_FocusListener());
    	
    	//ActionListener zu Buttons hinzufuegen
    	btn_trainingSuchen.addActionListener(new Btn_training_suchen_ActionListener());
    	btn_RessourcenAendern.addActionListener(new Btn_ressource_aendern_ActionListener());
    	btn_trainingAktualisieren.addActionListener(new Btn_training_aktualisieren_ActionListener());
    	
    	this.setSize(700, 500);
    	this.setVisible(true);
    }

    /**
     * zeigt das Hauptmenu
     */
    @Override
	protected void setHauptmenue() 
    {
		controller.setHauptmenue();
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
    public void textfelderFuellen(String pTrainingID,
    							  String pFirmenname,
    							  String pAnsprechpartner,
    							  String pProBeschreibung,
    							  String pAnfangsDatum,
    							  String pEndDatum, 
    							  String pTage, 
    							  String pTrainer, 
    							  String pOrt,
    							  String pBemerkung)
    {
    	ltf_trainingsID.setText(pTrainingID);
    	ltf_firmenName.setText(pFirmenname);
    	ltf_ansprechpartner.setText(pAnsprechpartner);
    	ltf_proBeschreibung.setText(pProBeschreibung);
    	ltf_anfangsDatum.setText(pAnfangsDatum);
    	ltf_endDatum.setText(pEndDatum);
    	ltf_tage.setText(pTage);
    	ltf_trainer.setText(pTrainer);
    	ltf_ort.setText(pOrt);
    	ltf_bemerkung.setText(pBemerkung);
    }
    
    public String getTrainingsID()
    {
    	return ltf_trainingsID.getText();
    }
    
    /**
     * ActionListener fuer btn_trainingSuchen
     * 		zeigt VTrainingSuchen
     * 
     * @author joern
     */
    public class Btn_training_suchen_ActionListener implements ActionListener
    {	
    	@Override
    	public void actionPerformed(ActionEvent e)
    	{
    		btn_RessourcenAendern.setEnabled(true);
    		btn_trainingAktualisieren.setEnabled(true);
    		controller.btn_training_suchen(ltf_trainingsID.getText().trim());
    	}
    }
    
    /**
     * ActionListener fuer btn_ressourceAendern
     * 		zeigt VRessourceAendern
     * 
     * @author joern
     */
    public class Btn_ressource_aendern_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createRessourceAendern();
		}
    }
    
    /**
     * ActionListener fuer btn_trainingAktualisieren
     * 		Uebernimmt gemachte Veraenderungen
     * 
     * @author joern
     */
      public class Btn_training_aktualisieren_ActionListener implements ActionListener
      {
  		@Override
 		public void actionPerformed(ActionEvent e) 
 		{
			controller.training_aktualisieren(ltf_trainingsID.getText(),
											  ltf_firmenName.getText(),
											  ltf_ansprechpartner.getText(),
											  ltf_proBeschreibung.getText(),
											  ltf_anfangsDatum.getText(),
											  ltf_endDatum.getText(),
											  ltf_tage.getText(),
											  ltf_trainer.getText(),
											  ltf_ort.getText(),
											  ltf_bemerkung.getText());
 		}
      }
      
      /**
       * FocusListener für das EndDatum ltf
       * 	focusLost Methode nutzen, um daten zu berechen
       * 
       * @author joern
       */
      public class ltf_EndDatum_FocusListener implements FocusListener
      {

		@Override
		public void focusGained(FocusEvent e){}

		@Override
		public void focusLost(FocusEvent e) 
		{
			ltf_tage.setText(controller.datumsfelderBerechnen(ltf_anfangsDatum.getText(), ltf_endDatum.getText(), ltf_tage.getText(), "Enddatum"));
		}  
      }
      
      /**
       * FocusListener für das Tage ltf
       * 	focusLost Methode nutzen, um daten zu berechen
       * 
       * @author joern
       */
      public class ltf_Tage_FocusListener implements FocusListener
      {

		@Override
		public void focusGained(FocusEvent e) {}

		@Override
		public void focusLost(FocusEvent e) 
		{
			ltf_endDatum.setText(controller.datumsfelderBerechnen(ltf_anfangsDatum.getText(), ltf_endDatum.getText(), ltf_tage.getText(), "Tage"));
		}
      }
}