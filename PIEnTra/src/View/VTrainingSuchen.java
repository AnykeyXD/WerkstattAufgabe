package View;


import javax.swing.JButton;
import javax.swing.JList;

import Controller.CTrainingSuchen;

/**
 * 
 */
public class VTrainingSuchen 
{
	private JList<?> trainingsID;
    private JButton btn_auswaehlen;
    private JButton btn_abbrechen;
    private CTrainingSuchen controller;
    
    public VTrainingSuchen(CTrainingSuchen pController) {
    	controller = pController;
    }
}