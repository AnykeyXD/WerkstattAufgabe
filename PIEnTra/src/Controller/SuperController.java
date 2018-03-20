package Controller;


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
    
    private CDbAccess cDbAccess;

    
    private static SuperController instance;
    
    private SuperController(){}
    
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

    public void initcontroller(){
    	CHauptMenu cHauptMenu = CHauptMenu.getInstance();
    	cDbAccess = CDbAccess.getInstance();
    	chauptMenu.superSetzten(instance);
    	
    	
    	//Trainingscontrollero
		ctrainingAendern = CTrainingAendern.getInstance();
    	ctrainingAendern.superSetzten(instance);
    	ctrainingKonfigurieren = CTrainingKonfigurieren.getInstance();
    	ctrainingKonfigurieren.superSetzen(instance);
    	ctrainingLoeschen = CTrainingLoeschen.getInstance();
    	ctrainingLoeschen.superSetzen(instance);
    	ctrainingSuchen = CTrainingSuchen.getInstance();
    	ctrainingSuchen.superSetzen(instance);
    	cressourceAendern=CRessourceAendern.getInstance();
    	cressourceWaehlen =CRessourceWaehlen.getInstance();
    	cressourceWaehlen.superSetzen(instance);
    	ckundeVerwalten   = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	ckundeWaehlen = CKundeWaehlen.getInstance();
		ckundeWaehlen.superSetzen(instance);	
		cproduktDefinieren=CProduktDefinieren.getInstance();
		cproduktDefinieren.superSetzen(instance);
		//cproduktDefinieren.accessSetzen(cDbAccess);
    	cressourceWaehlen  = CRessourceWaehlen.getInstance();
    	cressourceWaehlen.superSetzen(instance);
    	ckundeVerwalten    = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	ckundeSuchen = CKundeSuchen.getInstance();
    	ckundeSuchen.superSetzen(instance);
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
	
	/**
	 * Sucht ein Training anhand seiner ID raus und gibt das Objekt zurueck
	 * @param pTrainingsID
	 * @return
	 */
	public MTraining trainingSuchen(String pTrainingsID)
	{
		return cDbAccess.getTraining_Map(pTrainingsID);
	}
}