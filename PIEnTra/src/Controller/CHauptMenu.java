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
    	if(view == null)
    	{
    		view = new VHauptMenu(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }
    
    public void createKundeVerwalten()
    {
    	System.out.println("LOL! Ich bin ein Test!"); 
    	superController.superKundeVerwalten();
    }
    public void createTrainigkonfigurieren()
    {
    	System.out.println("LOL! Ich bin ein Training konfigurieren!"); 
    	superController.superTrainingKonfigurieren();
    }
    public void createTrainigaendern()
    {
    	System.out.println("LOL! Ich bin ein Training �ndern!"); 
    	superController.superTrainingAendern();
    }
    public void createTrainigLoeschen()
    {
    	System.out.println("LOL! Ich bin ein Training L�schen"); 
    	superController.superTrainingLoeschen();
    }
    public void createProduktDefinieren()
    {
    	superController.superProduktDefinieren();
    }
    
}