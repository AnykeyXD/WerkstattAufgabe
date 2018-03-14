package Controller;

import View.VRessourceAendern;

/**
 * 
 */
public class CRessourceAendern
{
	private VRessourceAendern view;
	
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
    
    public void createView()
    {
    	view = new VRessourceAendern(instance);
    }
}