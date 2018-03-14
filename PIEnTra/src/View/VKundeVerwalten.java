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
    	//pnl_center.add(btn_KundeAktualisieren);
    	//pnl_center.add(btn_NeuerKunde);
    	this.setSize(300, 410);
    	
    	setVisible(true);
	}

}