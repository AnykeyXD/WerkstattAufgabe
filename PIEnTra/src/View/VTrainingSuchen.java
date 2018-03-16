package View;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

import Controller.CTrainingSuchen;

/**
 * 
 */
public class VTrainingSuchen extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JList<?> trainingsID;
    private JButton btn_auswaehlen;
    private JButton btn_abbrechen;
    private CTrainingSuchen controller;
    
    public VTrainingSuchen(CTrainingSuchen pController) 
    {
    	controller = pController;
    }
}