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
	private SuperController superController;
	
	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu verhindern
	 */
	private CTrainingLoeschen() 
    {
    }
    
    /**
     * @return eigene Instance -> existiert immer nur eine gleichzeitig, da SingeltonPattern
     */
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
    
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    public void setHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }

    /**
     * @param MTraining 
     * @return
     */
    public void fillTraining(MTraining pTraining) {
        // TODO implement here
    }

    public void createTrainingSuchen()
    {
    	superController.zeigeTrainingSuchen();
    }
}