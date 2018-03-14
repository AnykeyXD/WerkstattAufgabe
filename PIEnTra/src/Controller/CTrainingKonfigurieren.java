package Controller;


import View.VTrainingKonfigurieren;

/**
 * 
 */
public class CTrainingKonfigurieren
{
	private VTrainingKonfigurieren view;
	
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
    
    public void createView()
    {
    	view = new VTrainingKonfigurieren(instance);
    }
}