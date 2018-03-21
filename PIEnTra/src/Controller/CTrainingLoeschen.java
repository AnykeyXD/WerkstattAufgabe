package Controller;

import javax.swing.JOptionPane;

import Modell.MTraining;
import View.VTrainingLoeschen;

/**
 * 
 */
public class CTrainingLoeschen 
{
	private VTrainingLoeschen view;
	private static CTrainingLoeschen instance;
	private SuperController superController;
	
	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu verhindern
	 */
	private CTrainingLoeschen() 
    {
    }
    
    /**
     * @return eigene Instance -> existiert immer nur eine gleichzeitig, da SingeltonPattern
     */
    public static CTrainingLoeschen getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CTrainingLoeschen();
        }
    	return instance;
    }
    
    public void createView()
    {
    	if(view == null)
    	{
    		view = new VTrainingLoeschen(instance);
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
    
    public void setHauptmenue()
    {
    	superController.zeigeHauptmenue();
    }

    public void createTrainingSuchen()
    {
    	superController.zeigeTrainingSuchen(1);
    }
    
    /**
     * sucht das Training anhand der Übergebenen Trainings-ID und fuellt die Felder, wenn es eindeutig ist,
     * sonst wird das Auswahlview "VTrainingSuchen" gezeigt
     * @param pTrainings_ID
     */
    public void training_suchen(String pTrainings_ID)
    {
    	if(pTrainings_ID.trim().equals("") || view.isSuchbar())
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
						   ergebniss.getAnfangsdatum().toString(),
						   ergebniss.getEnddatum().toString(), 
						   ergebniss.getTage() + "",
						   ergebniss.getTrainer(),
						   ergebniss.getOrt(),
						   ergebniss.getBemerkungen());
    		}
    	}
    }
    
    public void training_loeschen(String pTrainings_ID)
    {
    	if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Möchten Sie das Training wirklich löschen?", "warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE))
    	{
        	superController.trainingLoeschen(pTrainings_ID.trim());
        	view.textfelderLeeren();
        	view.setSuchfeld(true);
    	}
    }
}