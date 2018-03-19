package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CRessourceWaehlen;
import Modell.MProdukt;
import View.VTrainingKonfigurieren.Btn_kunde_Waehlen_ActionListener;

/**
 *  Author Leon & Chris
 */
public class VRessourceWaehlen extends VRessource 
{
	private static final long serialVersionUID = 1L;

    private CRessourceWaehlen controller;
    private JButton btn_RessourceWaehlen;
    private JButton btn_ZurueckTrainingKonfigurieren;

    public VRessourceWaehlen(CRessourceWaehlen pController)
    {
    	
    	controller = pController;
    	init();
        
    }
    /**
     * Default constructor
     */
   
    public void init()
    {
    	super.init();
    	setVisible(true);
    	super.setTxt_Postion("PlEnTra/Ressource/RessourceWählen");
    	pnl_button.add(btn_RessourceWaehlen = new JButton("Ressource Waehlen"));
    	pnl_button.add(btn_ZurueckTrainingKonfigurieren = new JButton("Zurueck zu Training Konfigurieren "));
    	
    	btn_RessourceWaehlen.addActionListener(new Btn_Ressource_Waehlen_ActionListener());
    	btn_ZurueckTrainingKonfigurieren.addActionListener(new Btn_Zurueck_Training_Konfigurieren_ActionListener());
    	
    }
    public class Btn_Ressource_Waehlen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createSubmitRessourceWaehlen();
		}
    }
    public class Btn_Zurueck_Training_Konfigurieren_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createZurueckTrainingKonfigurieren();
		}
    }
    
    
    public void fillRessource(MProdukt pProdukt) {
     
    }
}