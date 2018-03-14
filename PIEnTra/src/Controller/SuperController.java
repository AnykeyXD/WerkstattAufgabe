package Controller;


import java.util.Vector;

import Modell.MKunde;
import Modell.MProdukt;
import Modell.MRessource;
import Modell.MTraining;

public class SuperController 
{
	private CKundeWaehlen ckundeWaehlen;
    private CKundeVerwalten ckundeVerwalten;
    private CKundeSuchen ckundeSuchen;
    private CRessourceWaehlen cressourceWaehlen;
    private CRessourceAendern cressourceAendern;
    private CHauptMenu chauptMenu;

    private Vector<MRessource> resourcen;
    private Vector<MTraining> trainings;
    private Vector<MKunde> kunden;
    private Vector<MProdukt> produkte;
    
    private static SuperController instance;
    
    private SuperController()
    {
    	
    	resourcen = new Vector<MRessource>();
    	trainings = new Vector<MTraining>();
    	kunden    = new Vector<MKunde>();
    	produkte  = new Vector<MProdukt>();
    }
    
    public static SuperController getInstance()
    {
    	if(instance == null)
    	{
    		instance = new SuperController();
    	}
    	return instance;
    }
    
    public void setHauptMenuView()
    {
    	chauptMenu = CHauptMenu.getInstance();
    	chauptMenu.createView();
    }
    
    
    
    public void ressourceHinzufuegen(MRessource pRessource) {

    }

    public void trainingHinzufuegen(MTraining pTraining) {
        // TODO implement here
    }

    public void kundeHinzufuegen(MKunde pKunde) 
    {
        // TODO implement here

    }

    public void produktHinzufuegen(MProdukt pProdukt)
    {
        // TODO implement here

    }

    public Vector<MRessource> getRessource() {
        // TODO implement here
        return null;
    }

    public Vector<MTraining> getTraining() 
    {
        return trainings;
    }

    public Vector<MKunde> getKunden() 
    {
        return kunden;
    }

    public Vector<MProdukt> getProdukt() 
    {
        return produkte;
    }

}