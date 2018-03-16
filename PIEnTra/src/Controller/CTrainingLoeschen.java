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
    	if(view == null)
    	{
    		view = new VTrainingLoeschen(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }

    /**
     * @param MTraining 
     * @return
     */
    public void fillTraining(MTraining pTraining) {
        // TODO implement here
    }

}