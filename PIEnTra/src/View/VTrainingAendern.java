package View;


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
    	
    	this.setSize(700, 500);
    	this.setVisible(true);
    }

}