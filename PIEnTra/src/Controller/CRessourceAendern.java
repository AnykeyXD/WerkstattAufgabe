package Controller;

import Modell.MRessource;
import View.VRessourceAendern;

/**
 * 
 */
public class CRessourceAendern
{
	private VRessourceAendern view;
	private SuperController superController;
	private static CRessourceAendern instance;

    private CRessourceAendern() 
    {
    	
    }
    
    /**
     * Hidden constructor
     */
    
    public static CRessourceAendern getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CRessourceAendern();
    	}
    	return instance;
    }
    
    public void  trainingFuellen(){
    	MRessource ressource = new MRessource(superController.ortSuchen(Integer.parseInt(view.get_cbx_Ort())),
    										  superController.trainerSuchen(Integer.parseInt(view.get_cbx_Trainer())),
    										  superController.produktSuchen(view.get_cbx_Produktname()));
    	superController.trainingAendernFuellen(ressource);
    
    }
    
  

    public void createView()
    {
    	if(view == null)
    	{
    		view = new VRessourceAendern(instance);
    		comboboxBefuellen();
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
    public void createZurueckTrainingAendern()
    {
    	superController.zeigeTrainingAendern();
    }
    public void createSubmitRessoureceAendern()
    {
    	superController.zeigeTrainingAendern();
    }
    	
    	  public void comboboxBefuellen()
    	    {
    	    	view.proNamefuellen(superController.getProIds());
    	    }
    }
