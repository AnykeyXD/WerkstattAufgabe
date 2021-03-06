package Controller;


import View.VTrainingKonfigurieren;

/**
 * Controllerklasse f�r VTrainingKonfigurieren
 */
public class CTrainingKonfigurieren
{
	private        VTrainingKonfigurieren view;
	private static CTrainingKonfigurieren instance;
	private 	   SuperController 		  superController;
	
	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu verhindern
	 */
    private CTrainingKonfigurieren() 
    {}
    
    /**
     * @return eigene Instance -> existiert immer nur eine gleichzeitig, da SingeltonPattern
     */
    public static CTrainingKonfigurieren getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingKonfigurieren();
    	}
    	return instance;
    }
    
    /**
     * Immer nur ein View
     * ->falsches Singeltonpattern
     */
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VTrainingKonfigurieren(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }
    
    /**
     * Supercontrollerinstanz f�r Kommunikation setzten
     * @param pSuperController
     */
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    /**
     *	Hauptmen� view anzeigen 
     */
    public void setHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }
    
    /**
     * View navigation
     * 
     * @author Tim Sp�rkel
     */
    public void createKundeWaehlen()
    {
    	superController.zeigeKundeWaehlen();
    }
    /**
     * View navigation
     * 
     * @author Tim Sp�rkel
     */
    public void createRessourceWaehlen()
    {
    	superController.zeigeRessourceWaehlen();
    }
    
	/** 
	 * @author Nils Winkel, Tim Sp�rkel
	 * @param pID
	 * @return
	 * Automatische Erstellung der TrainingsID, if Exists neue erstellen!
	 */
	public String trainingsID()
	{
		String trainingID;
		do{
			trainingID = System.currentTimeMillis() + ""; 
			trainingID = trainingID.substring(trainingID.length()-4,trainingID.length());
		}
		while(superController.containsTrainingsID(trainingID));
		return trainingID;
	}
	
	//Noch nicht fertig -> warten auf Ressourcen
	public void trainingSpeichern()
	{
		String trainingsID = trainingsID();
	}
	
	/**
	 * @param pKundenID
	 * @param pFirmenname
	 * @param pAnsprechpartner
	 */
	public void kundenInformationenSetzen(int pKundenID, String pFirmenname, String pAnsprechpartner)
	{
		view.kundenInformationenSetzen(pKundenID, pFirmenname, pAnsprechpartner);
	}
}