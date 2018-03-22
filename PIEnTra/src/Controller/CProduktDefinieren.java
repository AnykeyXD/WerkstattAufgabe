package Controller;


import Modell.MProdukt;
import View.VProduktDefinieren;

/**
 * author toni
 */
public class CProduktDefinieren 
{
	public VProduktDefinieren view;

	private static CProduktDefinieren instance;

	private SuperController superController;
	private MProdukt mprodukt;
	

	    /**
	     * Singleton pattern
	     */
	    private CProduktDefinieren() {
	    }
	    
	    public static CProduktDefinieren getInstance()
	    {
	    	if(instance == null)
	    	{
	    		instance = new CProduktDefinieren();
	    	}
	    	return instance;
	    }
	    
	    public void createView()
	    {
	    	if(view == null)
	    	{
	    		view = new VProduktDefinieren(instance);
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
	    public void createZurueckHaupt()
	    {
	    	superController.zeigeHauptmenue();
	    }
	    
	    public void superSetzen(SuperController pSuperController)
	    {
	    	superController = pSuperController;
	    }
	    
	    public void setHauptmenue()
	    {
	    	superController.zeigeHauptmenue();
	    }
	    
	    //Datenbankschnittstelle
	   public void writeProduktDefiniert(){
		   mprodukt = new MProdukt(view.get_txt_proID(),view.get_txt_proBezeichnung(),
				   view.get_txt_proBeschreibung());
		   superController.produktDefinieren(mprodukt);
	   }	
}