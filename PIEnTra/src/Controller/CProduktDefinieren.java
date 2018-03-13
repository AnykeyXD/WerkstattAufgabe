package Controller;


import View.VHauptMenu;
import View.VProduktDefinieren;

/**
 * 
 */
public class CProduktDefinieren 
{
	public VProduktDefinieren view;
	
		private static CProduktDefinieren instance;
	    /**
	     * Singleton pattern
	     */
	    private CProduktDefinieren() {
	    }
	    
	    public CProduktDefinieren getInstance()
	    {
	    	if(instance == null)
	    	{
	    		instance = new CProduktDefinieren();
	    	}
	    	return instance;
	    }
	    
	    public void createView()
	    {
	    	view = new VProduktDefinieren(instance);
	    }
	
}