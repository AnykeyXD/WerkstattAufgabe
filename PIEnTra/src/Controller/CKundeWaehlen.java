package Controller;
import View.VKundeWaehlen;
/**
 * 
 */
public class CKundeWaehlen 
{
	private VKundeWaehlen view;
	private static CKundeWaehlen instance;
	private SuperController superController;
    /**
     * Singleton pattern
     */
	private CKundeWaehlen()
	{
		
    }
	
    public static CKundeWaehlen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeWaehlen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	if (view == null)
    	{
    		view = new VKundeWaehlen(instance);
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
    
    public void createZurueckTraining()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    
    public void zeigeKundeSuchen()
    {
    	superController.zeigeKundeSuchen(0);
    }
}