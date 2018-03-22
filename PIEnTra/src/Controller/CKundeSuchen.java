package Controller;


import Modell.MKunde;
import View.VKundeSuchen;

/**
 * @author toni
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
    /**
     * prüft den übergebenen Wert "herkunft" und öffnet damit die View aus der VKundeSuchen geöffnet wurde 
     * 
     * @author Tim Spürkel
     */
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
     * @param 
     * @return
     */
    public boolean kundenIDSuchen() {
    	boolean bool = false;
    //if(view.get_txt_KundenID() == superController.kundeSuchen(view.get_txt_KundenID()).getKundenID()&&
  if(  		 superController.kundeSuchen(view.get_txt_KundenID()) !=null)
  // if(superController.kundeSuchen(view.get_txt_KundenID()).getKundenID()) == view.get_txt_KundenID()
   {
    		bool = true;
    	}
    	
        return bool;
    }
    
    
    public void  kundeFuellen(){
    	superController.kundeSuchenFuellen(view.get_txt_KundenID(), herkunft);
    }

    /**
     * @param String pFirmenName 
     * @return
     */
    public MKunde firmenNameSuchen(MKunde mkunde) {
    	
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
