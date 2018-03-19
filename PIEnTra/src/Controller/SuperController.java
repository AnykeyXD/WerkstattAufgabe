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
    private CTrainingSuchen ctrainingSuchen;
    private CTrainingKonfigurieren ctrainingKonfigurieren;
    private CTrainingAendern ctrainingAendern;
    private CTrainingLoeschen ctrainingLoeschen;
    private CProduktDefinieren cproduktDefinieren;
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
    
    public void ressourceHinzufuegen(MRessource pRessource) 
    {

    }

    public void trainingHinzufuegen(MTraining pTraining)
    {
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

    public void initcontroller()
    {
    	CHauptMenu cHauptMenu = CHauptMenu.getInstance();
    	chauptMenu.superSetzten(instance);
    	
    	//Trainingscontrollero
		ctrainingAendern = CTrainingAendern.getInstance();
    	ctrainingAendern.superSetzten(instance);
    	ctrainingKonfigurieren = CTrainingKonfigurieren.getInstance();
    	ctrainingKonfigurieren.superSetzen(instance);
    	ctrainingLoeschen = CTrainingLoeschen.getInstance();
    	ctrainingLoeschen.superSetzen(instance);
    	
<<<<<<< HEAD
    	ctrainingSuchen = CTrainingSuchen.getInstance();
    	cressourceAendern=CRessourceAendern.getInstance();
    	cressourceWaehlen =CRessourceWaehlen.getInstance();
    	ckundeVerwalten   = CKundeVerwalten.getInstance();
		cproduktDefinieren=CProduktDefinieren.getInstance();
		cproduktDefinieren.superSetzen(instance);
=======
    	cressourceWaehlen  = CRessourceWaehlen.getInstance();
    	ckundeVerwalten    = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	
    	ckundeSuchen = new CKundeSuchen();
    	ckundeSuchen.superSetzen(instance);
    	
		cproduktDefinieren = CProduktDefinieren.getInstance();
    	ctrainingSuchen    = CTrainingSuchen.getInstance();
    	cressourceAendern  = CRessourceAendern.getInstance();
		cproduktDefinieren = CProduktDefinieren.getInstance();
>>>>>>> branch 'master' of https://github.com/AnykeyXD/WerkstattAufgabe.git
		
		ckundeWaehlen = CKundeWaehlen.getInstance();
		ckundeWaehlen.superSetzen(instance);	
    }

	public void zeigeKundeVerwalten() 
	{
		ckundeVerwalten.createView();
	}
	
	public void zeigeTrainingSuchen() 
	{
		ctrainingSuchen.createView();
	}
	public void zeigeTrainingKonfigurieren() 
	{
		ctrainingKonfigurieren.createView();
	}
	
	public void zeigeTrainingAendern() 
	{
		ctrainingAendern.createView();
	}
	
	public void zeigeTrainingLoeschen() 
	{
		ctrainingLoeschen.createView();
	}
	
	public void zeigeProduktDefinieren() 
	{
		cproduktDefinieren.createView();
	}
	
	public void zeigeKundeWaehlen() 
	{
		ckundeWaehlen.createView();
	}
	
	public void zeigeKundeSuchen()
	{
		ckundeSuchen.createView();
	}
	
	public void zeigeRessourceWaehlen() 
	{
		cressourceWaehlen.createView();
	}
	
	public void zeigeHauptmenue()
	{
		chauptMenu.createView();
	}
	public void zeigeRessourceAendern()
	{
		cressourceAendern.createView();
	}
}