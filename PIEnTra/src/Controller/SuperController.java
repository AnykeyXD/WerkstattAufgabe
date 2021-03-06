package Controller;

import java.time.format.DateTimeFormatter;

import Modell.MAdresse;
import Modell.MKunde;
import Modell.MOrt;
import Modell.MProdukt;
import Modell.MRessource;
import Modell.MTrainer;
import Modell.MTraining;

public class SuperController 
{
	//Date-Format - ohne Instanziierung erreichbar 
	public static final DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	private CKundeWaehlen ckundeWaehlen;
    private CKundeVerwalten ckundeVerwalten;
    private CKundeSuchen ckundeSuchen;
    private CTrainingSuchen ctrainingSuchen;
    private CTrainingKonfigurieren ctrainingKonfigurieren;
    private CTrainingAendern ctrainingAendern;
    private CTrainingLoeschen ctrainingLoeschen;
    private CProduktDefinieren cproduktDefinieren;
    private CRessourceWaehlen cressourceWaehlen;
    private CRessourceAendern cressourceAendern;
    private CHauptMenu chauptMenu;
    
    private CDbAccess cDbAccess;

    
    private static SuperController instance;
    
    private SuperController(){}
    
    public static SuperController getInstance()
    {
    	if(instance == null)
    	{
    		instance = new SuperController();
    	}
    	return instance;
    }
    
    public void setHauptMenuView()
    {
    	chauptMenu = CHauptMenu.getInstance();
    	chauptMenu.createView();
    }

    public void initcontroller(){
    	CHauptMenu cHauptMenu = CHauptMenu.getInstance();
    	cDbAccess = CDbAccess.getInstance();
    	chauptMenu.superSetzten(instance);
  
    	//Trainingscontroller
		ctrainingAendern = CTrainingAendern.getInstance();
    	ctrainingAendern.superSetzten(instance);
    	ctrainingKonfigurieren = CTrainingKonfigurieren.getInstance();
    	ctrainingKonfigurieren.superSetzen(instance);
    	ctrainingLoeschen = CTrainingLoeschen.getInstance();
    	ctrainingLoeschen.superSetzen(instance);
    	ctrainingSuchen = CTrainingSuchen.getInstance();
    	ctrainingSuchen.superSetzen(instance);
    	cressourceAendern=CRessourceAendern.getInstance();
    	cressourceAendern.superSetzen(instance);
    	cressourceWaehlen =CRessourceWaehlen.getInstance();
    	cressourceWaehlen.superSetzen(instance);
    	ckundeVerwalten   = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	ckundeWaehlen = CKundeWaehlen.getInstance();
		ckundeWaehlen.superSetzen(instance);	
		cproduktDefinieren=CProduktDefinieren.getInstance();
		cproduktDefinieren.superSetzen(instance);
    	cressourceWaehlen  = CRessourceWaehlen.getInstance();
    	cressourceWaehlen.superSetzen(instance);
    	ckundeVerwalten    = CKundeVerwalten.getInstance();
    	ckundeVerwalten.superSetzen(instance);
    	ckundeSuchen = CKundeSuchen.getInstance();
    	ckundeSuchen.superSetzen(instance);
    }
    /**
     * View navigation KundeVerwalten
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeKundeVerwalten() 
	{
		ckundeVerwalten.createView();
	}
	 /**
     * View navigation TrainingSuchen
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeTrainingSuchen(int pHerkunftTraining) 
	{
		ctrainingSuchen.createView(pHerkunftTraining);
	}
	 /**
     * View navigation TrainingKonfigurieren
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeTrainingKonfigurieren() 
	{
		ctrainingKonfigurieren.createView();
	}
	 /**
     * View navigation TrainingAendern
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeTrainingAendern() 
	{
		ctrainingAendern.createView();
	}
	 /**
     * View navigation TrainingLoeschen
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeTrainingLoeschen() 
	{
		ctrainingLoeschen.createView();
	}
	 /**
     * View navigation ProduktDefinieren
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeProduktDefinieren() 
	{
		cproduktDefinieren.createView();
	}
	 /**
     * View navigation KundeWaehlen
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeKundeWaehlen() 
	{
		ckundeWaehlen.createView();
	}
	 /**
     * View navigation KundeSuchen
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeKundeSuchen(int pHerkunft)
	{
		ckundeSuchen.createView(pHerkunft);
	}
	 /**
     * View navigation RessourceWaehlen
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeRessourceWaehlen() 
	{
		cressourceWaehlen.createView();
	}
	 /**
     * View navigation Hauptmenue
     * 
     * @author Joern
     */
	public void zeigeHauptmenue()
	{
		chauptMenu.createView();
	}
	 /**
     * View navigation RessourceAendern
     * 
     * @author Tim Sp�rkel
     */
	public void zeigeRessourceAendern()
	{
		cressourceAendern.createView();
	}
	
	/**
	 * Sucht ein Training anhand seiner ID raus und gibt das Objekt zurueck
	 * @param pTrainingsID
	 * @return
	 */
	public MTraining trainingSuchen(String pTrainingsID)
	{
		return cDbAccess.getTraining_Map(pTrainingsID);
	}
	
	public MTrainer trainerSuchen(int pTrainerID)
	{
		return cDbAccess.getTrainer_Map(pTrainerID);
	}
	
	public MProdukt produktSuchen(String pProdukt)
	{
		return cDbAccess.getProdukte_Map(pProdukt);
	}
	
	public MOrt ortSuchen(int pOrt)
	{
		return cDbAccess.getOrt_Map(pOrt);
	}

	public MKunde kundeSuchen(int pkundeID)
	{
		return cDbAccess.getKunde_Map(pkundeID);
	}
	
	public MAdresse adresseSuchen(int pkundeID)
	{
		return cDbAccess.getAdresse_Map(pkundeID);
	}
	
//	public MKunde firmaSuchen(String firmenname)
//	{
//		return cDbAccess.getKunde_Map(firmenname);
//	}
	
	/**
	 * 
	 * @param pTraining
	 */
	public void trainingAendern(MTraining pTraining)
	{
		cDbAccess.updateTraining(pTraining);
	}
	
	public void kundeAendern(MKunde pKunden)
	{
		cDbAccess.updateKunde(pKunden);		
	}
		
	public void trainingLoeschen(String pTraining)
	{
		cDbAccess.deleteTraining(pTraining);
	}

	public void kundeSuchenFuellen(int pKunden_ID, int herkunft)
	{
		if(herkunft == 0)
		 {
			 ckundeWaehlen.kundeSuchenFuellen(pKunden_ID);
		 }
		 else
		 {
			 ckundeVerwalten.kundeSuchenFuellen(pKunden_ID);
		 }
	 }
		
	public void produktDefinieren(MProdukt mProdukt )
	{
		cDbAccess.setProdukte_Map(mProdukt);
	}
	
	/**
	 * @return Arrays mit allen ProIds
	 */
	public String[] getProIds()
	{
		return cDbAccess.getProduktIds();
	}



	public String[] trainingSuchenFuellen() {
		return  cDbAccess.getTrainingIds();}

	public void trainingAendernFuellen(String get_cbx_Ort,
			String get_cbx_Produktname, String get_cbx_Trainer) {

		
	}

	public void trainingSuchenFuellen(String listItemSelected,
			int herkunftTraining) {
		 if(herkunftTraining == 0)
		 {
			 ctrainingAendern.fillTraining(listItemSelected);
		 }
		 else
		 {
			 this.ctrainingLoeschen.fillTraining(listItemSelected);
		 }}

	
	
	public void trainingAendernFuellen(MRessource pRessource) 
	{
		MTraining training = trainingSuchen(ctrainingAendern.getTrainingsID());

		
		training.setRessource(pRessource);
		trainingAendern(training);
		

		ctrainingAendern.fillTraining(ctrainingAendern.getTrainingsID());

		//ctrainingAendern.fillTraining(training);TODO

	}
	
	/** 
	 * @author Nils Winkel
	 * @param pID
	 * @return
	 * Gibt den Boolean Wert zur�ck, ob die TrainingsID bereits exisitiert
	 */
	public boolean containsTrainingsID(String pID)
	{
		return cDbAccess.containsTrainingID(pID);
	}

	public void trainingKonfigurierenKundeEintragen(int pKundenID) 
	{
		MKunde kunde = kundeSuchen(pKundenID);
		
		ctrainingKonfigurieren.kundenInformationenSetzen(kunde.getKundenID(),
														 kunde.getFirmenname(),
														 kunde.getAnsprechpartner());
	}
}
