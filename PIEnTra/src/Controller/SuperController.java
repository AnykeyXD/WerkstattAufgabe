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
    	
    	ctrainingSuchen = CTrainingSuchen.getInstance();
    	cressourceAendern=CRessourceAendern.getInstance();
    	cressourceWaehlen =CRessourceWaehlen.getInstance();
    	ckundeVerwalten   = CKundeVerwalten.getInstance();
		cproduktDefinieren=CProduktDefinieren.getInstance();
		cproduktDefinieren.superSetzen(instance);

    	cressourceWaehlen  = CRessourceWaehlen.getInstance();
    	ckundeVerwalten    = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	
    	ckundeSuchen = new CKundeSuchen();
    	ckundeSuchen.superSetzen(instance);
    	
		cproduktDefinieren = CProduktDefinieren.getInstance();
    	ctrainingSuchen    = CTrainingSuchen.getInstance();
    	cressourceAendern  = CRessourceAendern.getInstance();
		cproduktDefinieren = CProduktDefinieren.getInstance();

		
		ckundeWaehlen = CKundeWaehlen.getInstance();
		ckundeWaehlen.superSetzen(instance);	
    
		cDbAccess = CDbAccess.getInstance();
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