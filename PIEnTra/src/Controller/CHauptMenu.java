package Controller;
import View.VHauptMenu;

/**
 * 
 */
public class CHauptMenu 
{
	private VHauptMenu view;
	
	private SuperController superController;
	
	private static CHauptMenu instance;
    /**
     * Singleton pattern
     */
    private CHauptMenu() {
    }
    
    public static CHauptMenu getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CHauptMenu();
    	}
    	return instance;
    }
    
    public void superSetzten(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    public void createView()
    {
    	view = new VHauptMenu(instance);
    }
    
    public void createKundeVerwalten()
    {
    	System.out.println("LOL! Ich bin ein Test!"); 
    	superController.superKundeVerwalten();
    }
}