package Controller;


import java.util.Vector;

import Modell.MKunde;
import Modell.MProdukt;
import Modell.MRessource;
import Modell.MTraining;

/**
 * 
 */
public class SuperController 
{
	private CKundeWaehlen ckundeWaehlen;
    private CKundeVerwalten ckundeVerwalten;
    private CKundeSuchen ckundeSuchen;
    private CRessourceWaehlen cressourceWaehlen;
    private CRessourceAendern cressourceAendern;
    private CHauptMenu chauptMenu;
    private CRessource cressource;

    private Vector<MRessource> resourcen;
    private Vector<MTraining> trainings;
    private Vector<MKunde> kunden;
    private Vector<MProdukt> produkt;
    
    private static SuperController instance;
    
    private SuperController()
    {
    	
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
    	
    }
    
    
    
    public void ressourceHinzufuegen(CRessource pRessource) {

    }

    /**
     * @param CTraining 
     * @return
     */
    public void trainingHinzufuegen(MTraining pTraining) {
        // TODO implement here
    }

    /**
     * @param CKunde 
     * @return
     */
    public void kundeHinzufuegen(MKunde pKunde) {
        // TODO implement here

    }

    /**
     * @param CProdukt 
     * @return
     */
    public void produktHinzufuegen(MProdukt pProdukt) {
        // TODO implement here

    }

    /**
     * @return
     */
    public Vector<MRessource> getRessource() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Vector<MTraining> getTraining() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Vector<MKunde> getKunden() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Vector<MProdukt> getProdukt() {
        // TODO implement here
        return null;
    }

}