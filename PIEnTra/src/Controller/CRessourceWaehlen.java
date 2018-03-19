package Controller;


import View.VRessourceWaehlen;

/**
 * 
 */
public class CRessourceWaehlen
{
	private VRessourceWaehlen view;
	private SuperController superController;
	private static CRessourceWaehlen instance;

    /**
     * Default constructor
     */
    private CRessourceWaehlen() 
    {
    	
    }
    
    public static CRessourceWaehlen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CRessourceWaehlen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VRessourceWaehlen(instance);
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
    
    public void createSubmitRessourceWaehlen()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    public void createZurueckTrainingKonfigurieren()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
}