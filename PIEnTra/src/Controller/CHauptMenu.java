package Controller;
import View.VHauptMenu;

/**
 * 
 */
public class CHauptMenu 
{
	private VHauptMenu view;
	
	private static CHauptMenu instance;
    /**
     * Singleton pattern
     */
    private CHauptMenu() {
    }
    
    public CHauptMenu getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CHauptMenu();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	view = new VHauptMenu(instance);
    }
}