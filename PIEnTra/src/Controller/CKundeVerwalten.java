package Controller;
import View.VKundeVerwalten;
/**
 * 
 */
public class CKundeVerwalten
{
	private VKundeVerwalten view;
	private static CKundeVerwalten instance;
	private SuperController superController;
	
	/**
	 * Singelton pattern
	 */
    private CKundeVerwalten() {}
    
    public static CKundeVerwalten getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeVerwalten();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VKundeVerwalten(instance);
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
    
    public void zeigeKundeSuchen()
    {
    	superController.zeigeKundeSuchen();
    }
    public void createZurueckHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }
}