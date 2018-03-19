package Controller;


import View.VTrainingSuchen;

/**
 * 
 */
public class CTrainingSuchen 
{
    private VTrainingSuchen view;
    private SuperController superController;
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
    	if(view == null)
    	{
    		view = new VTrainingSuchen(instance);
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
    public void crateSubmitTrainingAuswaehlen()
    {
    	superController.zeigeTrainingAendern();
    }
    public void createZurueck()
    {
    	superController.zeigeTrainingLoeschen();
    }
}