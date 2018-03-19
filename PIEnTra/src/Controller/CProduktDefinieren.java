package Controller;


import View.VProduktDefinieren;

/**
 * author toni
 */
public class CProduktDefinieren 
{
	public VProduktDefinieren view;
	private SuperController superController;
	private CDbAccess cDbAccess;
	
		private static CProduktDefinieren instance;
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
	    
	    public void superSetzen(SuperController pSuperController)
	    {
	    	superController = pSuperController;
	    }
	    
	    //Datenbankinstanz
	    public void accessSetzen(CDbAccess cDbAccess_s)
	    {
	    	cDbAccess = cDbAccess_s;
	    }
	    
	    public void setHauptmenue()
	    {
	    	superController.zeigeHauptmenue();
	    }
	    //Datenbankschnittstelle
	   public void writeProduktDefiniert(){
		   cDbAccess.createProdukt(view.get_txt_proID() ,view.get_txt_proBezeichnung(),view.get_txt_proBeschreibung());
		 
	   }
	
	    
	    
	
}