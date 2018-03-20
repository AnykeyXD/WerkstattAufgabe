package View;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;
import View.VTrainingKonfigurieren.Btn_kunde_Waehlen_ActionListener;

/**
 *  Author Leon & Chris
 */
public class VRessourceAendern extends VRessource 
{
	private static final long serialVersionUID = 1L;

    private CRessourceAendern controller;
    private JButton btn_SubmitRessoureceAendern;
    private JButton btn_ZurueckTrainingAendern;
    
    /**
     * Default constructor
     */
    public VRessourceAendern(CRessourceAendern pController)
    {
    	
    	controller = pController;
    	init();
        
    }
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/Training aendern/Ressource aendern");
    	pnl_button.add(btn_SubmitRessoureceAendern = new JButton("Ressource Aendern"));
    	pnl_button.add(btn_ZurueckTrainingAendern = new JButton("Zurueck zu Training konfigurieren")); 
    	
    	btn_ZurueckTrainingAendern.addActionListener(new Btn_Zurueck_Training_Aendern_ActionListener());
    	btn_SubmitRessoureceAendern.addActionListener(new Btn_Ressource_Aendern_ActionListener());
    	

    	setVisible(true);
    }
	
	
    
    
    public void fillRessource(MProdukt pProdukt) {
     
    }
    
    
    public class Btn_Zurueck_Training_Aendern_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			setVisible(false);
			controller.createZurueckTrainingAendern();
		}  	
    }
    public class Btn_Ressource_Aendern_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			setVisible(false);
			controller.createSubmitRessoureceAendern();
		}  	
    }

}