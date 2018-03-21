package Controller;


import View.VTrainingKonfigurieren;

/**
 * 
 */
public class CTrainingKonfigurieren
{
	private VTrainingKonfigurieren view;
	private static CTrainingKonfigurieren instance;
	private SuperController superController;
	
	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu verhindern
	 */
    private CTrainingKonfigurieren() 
    {
    }
    
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
    
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    public void setHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }
    
    public void createKundeWaehlen()
    {
    	superController.zeigeKundeWaehlen();
    }
    
    public void createRessourceWaehlen()
    {
    	superController.zeigeRessourceWaehlen();
    }
    
	/** 
	 * @author Nils Winkel, Tim Spürkel
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
			System.out.println(trainingID);
		}
		while(superController.containsTrainingsID(trainingID));
		return trainingID;
	}
	
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