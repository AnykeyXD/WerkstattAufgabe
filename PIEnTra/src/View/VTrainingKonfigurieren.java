package View;


import javax.swing.JButton;

import Controller.CTrainingKonfigurieren;

/**
 * 
 */
public class VTrainingKonfigurieren extends VTraining 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_kundeWaehlen;
    private JButton btn_ressourcenWaehlen;
    private JButton btn_trainingSpeichern;
    private CTrainingKonfigurieren controller;

    public VTrainingKonfigurieren(CTrainingKonfigurieren pController) 
    {
    	controller = pController;
    }
    
    private long erzeugeTrainingsID() {
        // TODO implement here
        return 0;
    }

}