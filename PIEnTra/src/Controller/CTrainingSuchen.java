package Controller;


import View.VTrainingSuchen;

/**
 * 
 */
public class CTrainingSuchen 
{
    public VTrainingSuchen view;
    
    private static CTrainingSuchen instance;
    
    private CTrainingSuchen() {
    }
    
    public static CTrainingSuchen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingSuchen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VTrainingSuchen(instance);
    }
}