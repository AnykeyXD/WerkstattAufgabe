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
    public MKunde kundenIDSuchen(MKunde mkunde) {
    	if(view.get_txt_KundenID() == superController.kundeSuchen(mkunde.getKundenID()).getKundenID()){
    		System.out.println(" Suche erfolgreich ID");
    		
    	}else{
    		System.out.println(" Suche nicht erfolgt");
    	}
    	
    	//view.get_txt_KundenID();
        return null;
    }

    /**
     * @param String pFirmenName 
     * @return
     */
    public MKunde firmenNameSuchen(MKunde mkunde) {
    	//superController.kundeSuchen(mkunde.getFirmenname());
    	//view.get_txt_Firmenname();
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