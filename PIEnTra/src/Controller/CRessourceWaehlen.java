package Controller;


import View.VRessourceWaehlen;

/**
 * 
 */
public class CRessourceWaehlen
{
	private VRessourceWaehlen view;
	
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
    	view = new VRessourceWaehlen(instance);
    }
}