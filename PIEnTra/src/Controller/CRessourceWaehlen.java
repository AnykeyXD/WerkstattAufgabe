package Controller;


import View.VRessourceWaehlen;

/**
 * 
 */
public class CRessourceWaehlen
{
	
	private VRessourceWaehlen view;
	private SuperController superController;
	private static CRessourceWaehlen instance;

    /**
     * Hidden constructor
     */
    private CRessourceWaehlen(){}
    
    public static CRessourceWaehlen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CRessourceWaehlen();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	
    	if(view == null)	
    	{
    		view = new VRessourceWaehlen(instance);  
    		comboboxBefuellen(); 
    		view.comboboxDisable();
    	}
    	
    	else
    	{
    		view.setVisible(true);
    		comboboxBefuellen();
    		view.comboboxDisable();
    	}
    }
    
    public void superSetzen(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    public void createSubmitRessourceWaehlen()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    
    public void createZurueckTrainingKonfigurieren()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    
    public void comboboxBefuellen()
    {
    	view.proNamefuellen(superController.getProIds());
    }
}