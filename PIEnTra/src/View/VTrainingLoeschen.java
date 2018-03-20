package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CTrainingLoeschen;

/**
 * 
 */
public class VTrainingLoeschen extends VTraining 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_trainingSuchen = new JButton("Training suchen");
    private JButton btn_trainingLoeschen = new JButton("Training löschen");
    
    private VLabelTextfeld ltf_trainingsID 
	= new VLabelTextfeld("Trainings-ID", dim_label, dim_textID_Tage);
    
    private CTrainingLoeschen controller;

    public VTrainingLoeschen(CTrainingLoeschen pController) 
    {
    	controller = pController;
    	
    	init();
    }
    
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/TrainingLoeschen");
    	
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
    	pnl_buttons.add(btn_trainingLoeschen);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
    	btn_trainingSuchen.addActionListener(new Btn_training_Suchen_ActionListener());
    	btn_trainingLoeschen.addActionListener(new Btn_training_Loeschen_ActionListener());
    	this.setSize(700, 500);
    	this.setVisible(true);
    }

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
    
    /**
     * leert alle Textfelder
     */
    public void textfelderLeeren()
    {
    	ltf_trainingsID.setText("");
    	ltf_firmenName.setText("");
    	ltf_ansprechpartner.setText("");
    	ltf_proBeschreibung.setText("");
    	ltf_anfangsDatum.setText("");
    	ltf_endDatum.setText("");
    	ltf_tage.setText("");
    	ltf_trainer.setText("");
    	ltf_ort.setText("");
    	ltf_bemerkung.setText("");
    }
	
	 public class Btn_training_Suchen_ActionListener implements ActionListener
	    {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				controller.training_suchen(ltf_trainingsID.getText());
			}
	    }
	 public class Btn_training_Loeschen_ActionListener implements ActionListener
	    {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				controller.training_loeschen(ltf_trainingsID.getText());
			}
	    }
}