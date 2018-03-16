package Controller;


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
	    
	    public static CProduktDefinieren getInstance()
	    {
	    	if(instance == null)
	    	{
	    		instance = new CProduktDefinieren();
	    	}
	    	return instance;
	    }
	    
	    public void createView()
	    {
	    	if(view == null)
	    	{
	    		view = new VProduktDefinieren(instance);
	    	}
	    	else
	    	{
	    		view.setVisible(true);
	    	}
	    }
	
}