package Controller;


import View.VTrainingKonfigurieren;

/**
 * 
 */
public class CTrainingKonfigurieren
{
	private VTrainingKonfigurieren view;
	private SuperController superController;
	private static CTrainingKonfigurieren instance;

    private CTrainingKonfigurieren() 
    {
    	
    }
    
    public static CTrainingKonfigurieren getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingKonfigurieren();
    	}
    	return instance;
    }
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
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
    public void createKundeWaehlen()
    {
    	superController.zeigeKundeWaehlen();
    }
    public void createRessourceWaehlen()
    {
    	superController.zeigeRessourceWaehlen();
    }
}