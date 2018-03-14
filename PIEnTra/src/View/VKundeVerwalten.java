package View;


import javax.swing.JButton;

import Controller.CKundeVerwalten;

/**
 * 
 */
public class VKundeVerwalten extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_KundeAktualisieren;
    private JButton btn_NeuerKunde;

    private CKundeVerwalten controller;
	
    public VKundeVerwalten(){
    	this.init();
    }
    /**
     * Default constructor
     */
    public VKundeVerwalten(CKundeVerwalten pCKundeVerwalten) {
    	controller = pCKundeVerwalten;
    	this.init();
    }
    
    public void init() {
		
    	super.init();
    	
    	this.setSize(600, 310);
    	
    	setVisible(true);
	}

}