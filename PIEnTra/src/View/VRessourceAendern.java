package View;


import java.awt.Container;

import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 * 
 */
public class VRessourceAendern extends VRessource 
{
	private static final long serialVersionUID = 1L;
	
	private JPanel pnl_center;
    private CRessourceAendern controller;
    private JButton btn_Ressource_Aendern;
    
    public void init()
    {
    	super.init();
    	setVisible(true);
		//pnl_center.add(btn_Ressource_Aendern = new JButton("Ressourcen Aendern"));
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