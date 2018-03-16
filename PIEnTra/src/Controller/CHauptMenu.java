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
    	superController.zeigeKundeVerwalten();
    }
    
    public void createTrainigkonfigurieren()
    {
    	superController.zeigeTrainingKonfigurieren();
    }
    
    public void createTrainigaendern()
    {
    	superController.zeigeTrainingAendern();
    }
    
    public void createTrainigLoeschen()
    {
    	superController.zeigeTrainingLoeschen();
    }
    
    public void createProduktDefinieren()
    {
    	superController.zeigeProduktDefinieren();
    }
    
}