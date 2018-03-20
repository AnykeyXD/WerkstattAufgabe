package Controller;
import Modell.MKunde;
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
    
    public void kundeSuchenFuellen(int pKunden_ID){
    	

    	
		MKunde kunde = superController.kundeSuchen(pKunden_ID);
		view.textfelderFuellen(kunde.getKundenID(),
							   kunde.getFirmenname(),
							   kunde.getAnsprechpartner(),
							   kunde.getBranche(),
							   kunde.getEmail(),
							   kunde.getTelefon(), 
							   kunde.getAdresse().getStrasse(),
							   kunde.getAdresse().getPlz(),
							   kunde.getAdresse().getBundesland(),
							   kunde.getAdresse().getStadt());
	}
	
	
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    public void zeigeKundeSuchen()
    {
    	superController.zeigeKundeSuchen(1);
    	
    }
    public void createZurueckHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }
}