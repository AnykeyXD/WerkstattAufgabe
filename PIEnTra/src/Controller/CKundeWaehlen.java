package Controller;


import View.VKundeSuchen;
import View.VKundeWaehlen;

/**
 * 
 */
public class CKundeWaehlen 
{
	private VKundeWaehlen view;
	
	private static CKundeWaehlen instance;
    /**
     * Singleton pattern
     */
	
    /**
     * Default constructor
     */
    public CKundeWaehlen() {
    }
    
    public CKundeWaehlen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeWaehlen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VKundeWaehlen(instance);
    }
}