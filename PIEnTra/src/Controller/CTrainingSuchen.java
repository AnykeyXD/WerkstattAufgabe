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
    private int herkunftTraining;
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
    
    public void createView(int pHerkunftTraining)
    {
    	herkunftTraining=pHerkunftTraining;
    	if(view == null)
    	{
    		view = new VTrainingSuchen(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}  	
    }
    
    
    public String[] trainingIDFuellen(){
    	return superController.trainingSuchenFuellen();
    }
    
    
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    public void crateSubmitTrainingAuswaehlen()
    {
    	if (herkunftTraining==0)
    	{
    		superController.zeigeTrainingAendern();
    	}
    	else
    	{
    		superController.zeigeTrainingLoeschen();
    	}
    }
    public void createZurueck()
    {
    	if (herkunftTraining==0)
    	{
    		superController.zeigeTrainingAendern();
    	}
    	else
    	{
    		superController.zeigeTrainingLoeschen();
    	}
    }
}