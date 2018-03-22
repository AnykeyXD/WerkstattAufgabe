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
    /**
     * View navigation
     * 
     * @author Tim Spürkel
     */
    public void createKundeVerwalten()
    {
    	superController.zeigeKundeVerwalten();
    }
    /**
     * View navigation
     * 
     * @author Tim Spürkel
     */
    public void createTrainigkonfigurieren()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    /**
     * View navigation
     * 
     * @author Tim Spürkel
     */
    public void createTrainigaendern()
    {
    	superController.zeigeTrainingAendern();
    }
    /**
     * View navigation
     * 
     * @author Tim Spürkel
     */
    public void createTrainigLoeschen()
    {
    	superController.zeigeTrainingLoeschen();
    }
    /**
     * View navigation
     * 
     * @author Tim Spürkel
     */
    public void createProduktDefinieren()
    {
    	superController.zeigeProduktDefinieren();
    }
    
}