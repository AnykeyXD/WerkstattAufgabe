package View;


import javax.swing.JButton;

import Controller.CKundeSuchen;

/**
 * 
 */
public class VKundeSuchen extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
    private VLabelTextfeld ltf_kundenID;
    private VLabelTextfeld ltf_firmenname;
    private JButton btn_suchen;
    private JButton btn_abbrechen;
    
    private CKundeSuchen controller;
    
    
    /**
     * Default constructor
     */
    public VKundeSuchen(CKundeSuchen pCKundeSuchen) {
    	controller = pCKundeSuchen;
    }
}