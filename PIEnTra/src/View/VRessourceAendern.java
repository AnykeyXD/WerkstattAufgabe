package View;


import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;

/**
 * 
 */
public class VRessourceAendern extends VRessource 
{
	private static final long serialVersionUID = 1L;
	
	private JButton btn_Ressource_Aendern;
    private CRessourceAendern controller;
	
	/**
     * Default constructor
     */
    public VRessourceAendern(CRessourceAendern pController) 
    {
    	controller = pController;
    }

    public void fillRessource(MProdukt pProdukt) {
     
    }

}