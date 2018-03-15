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
    private JButton btn_Zur�ckTraining;
	private CKundeWaehlen controller;
    
    
    /**
     * Default constructor
     */
    public VKundeWaehlen(CKundeWaehlen pCKundeWaehlen) {
    	controller = pCKundeWaehlen;
    	this.init();
    }
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/KundeWaehlen");
    	
    	btn_KundeWaehlen = new JButton("   Kunde w�hlen   ");
    	pnl_south.add(btn_KundeWaehlen);
    	btn_Zur�ckTraining =new JButton("   Zur�ck zu Training konfigurieren  ");
    	pnl_south.add(btn_Zur�ckTraining);
    	
    	this.setSize(670, 500);    	
    	setVisible(true);
    }
}