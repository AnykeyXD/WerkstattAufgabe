package Controller;


import Modell.MKunde;
import View.VKundeSuchen;

/**
 * 
 */
public class CKundeSuchen
{
    private VKundeSuchen view;
	
    private static CKundeSuchen instance;
    /**
     * Singleton pattern
     */
    
    /**
     * Default constructor
     */
    public CKundeSuchen() {
    }
    
    public static CKundeSuchen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeSuchen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VKundeSuchen(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }

    /**
     * @param long pId 
     * @return
     */
    public MKunde kundenIDSuchen(long pId) {
        // TODO implement here
        return null;
    }

    /**
     * @param String pFirmenName 
     * @return
     */
    public MKunde firmenNameSuchen(String pFirmenName) {
        // TODO implement here
        return null;
    }

}