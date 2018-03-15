package View;


import javax.swing.JButton;

import java.awt.Container;

import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

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
    	pnl_center.add(btn_aendern = new JButton("Ressource Aendern"));
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