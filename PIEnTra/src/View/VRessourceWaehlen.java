package View;

import javax.swing.JButton;

import Controller.CRessourceWaehlen;
import javax.swing.JComboBox;
import javax.swing.JPanel;


/**
 * @author Leon & Chris
 */
public class VRessourceWaehlen extends VRessource 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_Ressource_waehlen;
    private CRessourceWaehlen controller;
    
    public void init()
    {
    	super.init();
    	pnl_center.add(btn_Ressource_waehlen = new JButton ("Ressource auswaehlen"));
    	
    }

    /**
     * Default constructor
     * @param instance 
     */
    public VRessourceWaehlen(CRessourceWaehlen instance) {
    }

}