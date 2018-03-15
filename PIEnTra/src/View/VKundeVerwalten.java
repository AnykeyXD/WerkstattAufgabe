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
    private JButton btn_Zur�ckHaupt;
    private CKundeVerwalten controller;
	
    
    /**
     * Default constructor
     */
    public VKundeVerwalten(CKundeVerwalten pCKundeVerwalten) {
    	controller = pCKundeVerwalten;
    	this.init();
    }
    
    public void init() {
    	
    	super.init();

    	super.setTxt_Postion("PlEnTra/KundeVerwalten");
    	//pnl_center.add(btn_NeuerKunde);
    	btn_KundeAktualisieren = new JButton("   Kunde aktualiesieren   ");
    	pnl_south.add(btn_KundeAktualisieren);
    	btn_NeuerKunde = new JButton("   Kunde anlegen   ");
    	pnl_south.add(btn_NeuerKunde);
    	btn_Zur�ckHaupt= new JButton("   Zur�ck zum Hauptmen�   ");
    	pnl_south.add(btn_Zur�ckHaupt);
    	
    	
    	this.setSize(670, 500);

    	
    	

    	
    	setVisible(true);
	}

}