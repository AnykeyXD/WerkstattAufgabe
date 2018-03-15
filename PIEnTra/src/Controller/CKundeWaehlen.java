package Controller;
import View.VKundeWaehlen;
/**
 * 
 */
public class CKundeWaehlen 
{
	private VKundeWaehlen view;
	private static CKundeWaehlen instance;
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
    	view = new VKundeWaehlen(instance);
    }
}