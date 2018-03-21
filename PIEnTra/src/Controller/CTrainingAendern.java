package Controller;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

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
    private CTrainingAendern() {}
    
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
    
    public void createRessourceAendern()
    {
    	superController.zeigeRessourceAendern();
    }
    public void createTrainingSuchen()
    {
    	superController.zeigeTrainingSuchen(0);
    }
    
    public void btn_training_suchen(String pTrainings_ID)
    {
    	if(pTrainings_ID.trim().equals(""))
    	{
    		view.setVisible(false);
    		superController.zeigeTrainingSuchen(0);
    	}
    	else
    	{
    		MTraining ergebniss = superController.trainingSuchen(pTrainings_ID.trim());
    		if(ergebniss != null)
    		{
    			view.textfelderFuellen(ergebniss.getTrainingsID(),
						   ergebniss.getFirmenname(),
						   ergebniss.getAnprechpartner(),
						   ergebniss.getProduktBeschreibung(),
						   SuperController.formatter.format(ergebniss.getAnfangsdatum()),
						   SuperController.formatter.format(ergebniss.getEnddatum()), 
						   ergebniss.getTage() + "",
						   ergebniss.getTrainer(),
						   ergebniss.getOrt(),
						   ergebniss.getBemerkungen());
    		}
    	}
    }

	public void training_aktualisieren(String pTraining_ID,
									   String pFirmenname,
									   String pAnsprechpartner,
									   String pProBeschreibung, 
									   String pAnfang,
									   String pEnde,
									   String pTage,
									   String pTrainer, 
									   String pOrt, 
									   String pBemerkung) 
	{
		LocalDate start = LocalDate.parse(pAnfang, SuperController.formatter);
		LocalDate ende  = LocalDate.parse(pEnde  , SuperController.formatter);
		
		MTraining temp = superController.trainingSuchen(pTraining_ID);
		
		//Werte anpassen
		temp.setAnfangsdatum(start);
		temp.setEnddatum(ende);
		temp.setTage(Integer.parseInt(pTage));
		temp.setBemerkungen(pBemerkung);
		
		superController.trainingAendern(temp);
	}
}