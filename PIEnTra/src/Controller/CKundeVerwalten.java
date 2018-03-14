package Controller;


import View.VKundeVerwalten;

/**
 * 
 */
public class CKundeVerwalten
{
	private VKundeVerwalten view;
	
	private static CKundeVerwalten instance;

    private CKundeVerwalten() {
    }
    
    public static CKundeVerwalten getInstance()
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