package View;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton btn_zurueck;
    

    public void init()
    {
    	super.init();

    	pnl_button.add(btn_zurueck = new JButton("Zurueck zu Training konfigurieren.")); 
    	pnl_button.add(btn_aendern = new JButton("Ressource Aendern"));
    	super.setTxt_Postion("PlEnTra/Ressource/RessourceÄndern");

    	setVisible(true);
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
    
    
    class Btn_zurueck implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			setVisible(false);
			
		}  	
    }

}