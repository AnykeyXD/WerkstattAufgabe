package Controller;

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
    
    public static CRessourceAendern getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CRessourceAendern();
    	}
    	return instance;
    }
    
    public void  trainingFuellen(){
    	superController.trainingAendernFuellen(view.get_cbx_Ort(), view.get_cbx_Produktname(), view.get_cbx_Trainer());
    }

    public void createView()
    {
    	if(view == null)
    	{
    		view = new VRessourceAendern(instance);
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
}