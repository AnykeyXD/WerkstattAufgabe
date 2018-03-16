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
    	if(view == null)
    	{
    		view = new VRessourceWaehlen(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }
}