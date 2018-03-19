package Controller;


import Modell.MTraining;
import View.VTrainingAendern;

/**
 * 
 */
public class CTrainingAendern 
{
	private VTrainingAendern view;
	private static CTrainingAendern instance;
	private SuperController superController;
	
	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu verhindern
	 */
    private CTrainingAendern() 
    {	
    }
    
    /**
     * @return eigene Instance -> existiert immer nur eine gleichzeitig, da SingeltonPattern
     */
    public static CTrainingAendern getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingAendern();
    	}
    	return instance;
    }
    
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VTrainingAendern(instance);
    	}
    	else
    	{
    		view.setVisible(true);
    	}
    }

    /**
     * @param pSuperController : instance des Supercontrollers
     */
    public void superSetzten(SuperController pSuperController)
    {
    	superController = pSuperController;
    }
    
    /**
     * Zeigt das Hauptmenu
     */
    public void setHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }

    /**
     * @param MTraining 
     * @return
     */
    public void fillTraining(MTraining pTraining)
    {
    }
}