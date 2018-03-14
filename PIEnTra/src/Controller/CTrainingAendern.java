package Controller;


import Modell.MTraining;
import View.VTrainingAendern;

/**
 * 
 */
public class CTrainingAendern 
{
	private VTrainingAendern view;
	
	private static CTrainingAendern instance;

    /**
     * Default constructor
     */
    private CTrainingAendern() 
    {
    	
    }
    
    public static CTrainingAendern getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingAendern();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VTrainingAendern(instance);
    }

    /**
     * @param MTraining 
     * @return
     */
    public void fillTraining(MTraining pTraining)
    {
    }

}