package View;


import javax.swing.JButton;

import Controller.CRessourceWaehlen;
import Modell.MProdukt;

/**
 *  Author Leon & Chris
 */
public class VRessourceWaehlen extends VRessource 
{
	private static final long serialVersionUID = 1L;

    private CRessourceWaehlen controller;
    private JButton btn_Waehlen;
    private JButton btn_zurueck;

    public void init()
    {
    	super.init();
    	setVisible(true);
    	super.setTxt_Postion("PlEnTra/Ressource/RessourceWählen");
    	pnl_button.add(btn_Waehlen = new JButton("Ressource Waehlen"));
    	pnl_button.add(btn_zurueck = new JButton("Zurueck zu Training Konfigurieren "));
    	
    }
	
	/**
     * Default constructor
     */
    public VRessourceWaehlen(CRessourceWaehlen pController)
    {
    	
    	controller = pController;
    	init();
        
    }
    
    
    public void fillRessource(MProdukt pProdukt) {
     
    }
}