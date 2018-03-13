package View;


import javax.swing.JButton;

import Controller.CKundeWaehlen;

/**
 * 
 */
public class VKundeWaehlen extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
	private JButton btn_KundeWaehlen;
    private CKundeWaehlen controller;
    
    /**
     * Default constructor
     */
    public VKundeWaehlen(CKundeWaehlen pCKundeWaehlen) {
    	controller = pCKundeWaehlen;
    }
}