package View;


import javax.swing.JButton;

import Controller.CKundeSuchen;

/**
 * 
 */
public class VTrainingKonfigurieren extends VTraining 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_kundeWaehlen;
    private JButton btn_ressourcenWaehlen;
    private JButton btn_trainingSpeichern;
    private CKundeSuchen controller;

    /**
     * Default constructor
     */
    public VTrainingKonfigurieren() {
    }
    
    private long erzeugeTrainingsID() {
        // TODO implement here
        return 0;
    }

}