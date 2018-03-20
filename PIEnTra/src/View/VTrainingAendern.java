package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;

import Controller.CTrainingAendern;
import Controller.SuperController;

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
    	
    	init();
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
    	
    	//Buttons ihrem entsprechenden Panel in der korrekten Reihenfolge hinzufuegen
    	pnl_buttons.add(btn_trainingSuchen);
    	pnl_buttons.add(btn_RessourcenAendern);
    	pnl_buttons.add(btn_trainingAktualisieren);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
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
    	ltf_anfangsDatum.setText(pAnfangsDatum.format(SuperController.formatter.ofPattern()));
    	ltf_endDatum.setText(pEndDatum);
    	ltf_tage.setText(pTage);
    	ltf_trainer.setText(pTrainer);
    	ltf_ort.setText(pOrt);
    	ltf_bemerkung.setText(pBemerkung);
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
}