package View;


import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;

/**
 *  Author Leon & Chris
 */
public class VRessourceAendern extends VRessource 
{
	private static final long serialVersionUID = 1L;

    private CRessourceAendern controller;
    private JButton btn_aendern;
    

    public void init()
    {
    	super.init();
    	setVisible(true);
    	super.setTxt_Postion("PlEnTra/Ressource/RessourceÄndern");
    	pnl_center.add(btn_aendern = new JButton("Ressource Aendern"));
    	pnl_center.add(btn_zurueck);
    }
	
	/**
     * Default constructor
     */
    public VRessourceAendern(CRessourceAendern pController)
    {
    	
    	controller = pController;
    	init();
        
    }
    
    
    public void fillRessource(MProdukt pProdukt) {
     
    }

}