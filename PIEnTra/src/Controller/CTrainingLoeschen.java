package Controller;

import Modell.MTraining;
import View.VTrainingLoeschen;

/**
 * 
 */
public class CTrainingLoeschen 
{
	private VTrainingLoeschen view;

	private static CTrainingLoeschen instance;
    private CTrainingLoeschen() 
    {
    }
    
    public static CTrainingLoeschen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingLoeschen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VTrainingLoeschen(instance);
    }

    /**
     * @param MTraining 
     * @return
     */
    public void fillTraining(MTraining pTraining) {
        // TODO implement here
    }

}