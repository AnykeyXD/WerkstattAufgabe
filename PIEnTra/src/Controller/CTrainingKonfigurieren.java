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
}