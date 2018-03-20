package Controller;


import Modell.MKunde;
import View.VKundeSuchen;

/**
 * 
 */
public class CKundeSuchen
{
    private VKundeSuchen view;
    
    private SuperController superController;
	
    private static CKundeSuchen instance;
    
    private int herkunft;
    /**
     * Singleton pattern
     */
    
    /**
     * Default constructor
     */
    private CKundeSuchen() {
    }
    
    public static CKundeSuchen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CKundeSuchen();
    	}
    	return instance;
    }
    
    public void createView(int pHerkunft)
    {
    	herkunft = pHerkunft;
    	if(view == null)
    	{
    		view = new VKundeSuchen(instance);
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

    /**
     * @param long pId 
     * @return
     */
    public MKunde kundenIDSuchen(long pId) {
        // TODO implement here
        return null;
    }

    /**
     * @param String pFirmenName 
     * @return
     */
    public MKunde firmenNameSuchen(String pFirmenName) {
        // TODO implement here
        return null;
    }

    public void createSubmitSuche()
    {
    	if (herkunft==0)
    	{
    		superController.zeigeKundeWaehlen();
    	}
    	else
    	{
    		superController.zeigeKundeVerwalten();
    	}
    	
    }
    public void createZurueckKundeWaehlen()
    {
    	if (herkunft==0)
    	{
    		superController.zeigeKundeWaehlen();
    	}
    	else
    	{
    		superController.zeigeKundeVerwalten();
    	}
    }
}