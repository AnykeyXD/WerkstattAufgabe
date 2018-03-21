package Controller;
import Modell.MKunde;
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
    public void createSubmitKundeWaehlen(int pKundenID)
    {
    	superController.zeigeTrainingKonfigurieren();
    	superController.trainingKonfigurierenKundeEintragen(pKundenID);
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
    	
    	
    	
    }
    
    
