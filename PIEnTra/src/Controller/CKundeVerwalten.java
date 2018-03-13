package Controller;


import View.VKundeSuchen;
import View.VKundeVerwalten;

/**
 * 
 */
public class CKundeVerwalten
{
	private VKundeVerwalten view;
	
	private static CKundeVerwalten instance;
    /**
     * Default constructor
     */
    public CKundeVerwalten() {
    }
    
    public CKundeVerwalten getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeVerwalten();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VKundeVerwalten(instance);
    }
    
}