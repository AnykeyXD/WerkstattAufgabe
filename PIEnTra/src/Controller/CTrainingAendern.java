package Controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Modell.MRessource;
import Modell.MTraining;
import View.VTrainingAendern;

/**
 * 
 */
public class CTrainingAendern {
	private VTrainingAendern view;
	private static CTrainingAendern instance;
	private SuperController superController;

	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu
	 * verhindern
	 */
	private CTrainingAendern() {
	}

	/**
	 * @return eigene Instance -> existiert immer nur eine gleichzeitig, da
	 *         SingeltonPattern
	 */
	public static CTrainingAendern getInstance() {
		if (instance == null) {
			instance = new CTrainingAendern();
		}
		return instance;
	}

	public void createView() {
		if (view == null) {
			view = new VTrainingAendern(instance);
		} else {
			view.setVisible(true);
		}
	}

	/**
	 * @param pSuperController
	 *            : instance des Supercontrollers
	 */
	public void superSetzten(SuperController pSuperController) {
		superController = pSuperController;
	}

	/**
	 * Zeigt das Hauptmenu
	 */
	public void setHauptmenue() {
		superController.zeigeHauptmenue();
	}

	/**
	 * @author toni
	 * @param MTraining
	 * @return
	 */
	public void fillTraining(String pTrainings_ID) {
		MTraining ergebniss = superController.trainingSuchen(pTrainings_ID);
		if (ergebniss != null) {
			view.textfelderFuellen(ergebniss.getTrainingsID(), ergebniss.getFirmenname(), ergebniss.getAnprechpartner(),
					ergebniss.getProduktBeschreibung(), SuperController.formatter.format(ergebniss.getAnfangsdatum()),
					SuperController.formatter.format(ergebniss.getEnddatum()), ergebniss.getTage() + "",
					ergebniss.getTrainer(), ergebniss.getOrt(), ergebniss.getBemerkungen());
		}
	}

	/**
	 * View navigation
	 * 
	 * @author Tim Spürkel
	 */
	public void createRessourceAendern() {
		superController.zeigeRessourceAendern();
	}

	/**
	 * View navigation
	 * 
	 * @author Tim Spürkel
	 */
	public void createTrainingSuchen() {
		superController.zeigeTrainingSuchen(0);
	}

	public String getTrainingsID() {
		return view.getTrainingsID();
	}

	public void ressourceUebernehmen(MRessource pRessource) {

	}

	/**
	 * Öffnet training suchen
	 * 
	 * @param pTrainings_ID
	 */
	public void btn_training_suchen(String pTrainings_ID) {
		view.setVisible(false);
		superController.zeigeTrainingSuchen(0);
	}

	/**
	 * aktualisiert das Training
	 * 
	 * @param pTraining_ID
	 * @param pFirmenname
	 * @param pAnsprechpartner
	 * @param pProBeschreibung
	 * @param pAnfang
	 * @param pEnde
	 * @param pTage
	 * @param pTrainer
	 * @param pOrt
	 * @param pBemerkung
	 *            Alle Parameter repräsentieren die Textfelder
	 */
	public void training_aktualisieren(String pTraining_ID, String pFirmenname, String pAnsprechpartner,
			String pProBeschreibung, String pAnfang, String pEnde, String pTage, String pTrainer, String pOrt,
			String pBemerkung) {
		// Daten von String in LocalDate umrechnen
		LocalDate start = LocalDate.parse(pAnfang, SuperController.formatter);
		LocalDate ende = LocalDate.parse(pEnde, SuperController.formatter);

		MTraining temp = superController.trainingSuchen(pTraining_ID);

		// if(temp != null) //Überpürfung, ob es das Training überhaupt schon gibt ->
		// eigenbtlich überflüssig falls keine anderen Prograammierfehler
		// {
		// Werte anpassen
		temp.setAnfangsdatum(start);
		temp.setEnddatum(ende);
		temp.setTage(Integer.parseInt(pTage));
		temp.setBemerkungen(pBemerkung);

		superController.trainingAendern(temp);
		// }
	}

	/**
	 * Berechnet die Daten automatisch
	 * 
	 * @param pAnfangsdat
	 *            : Anfangsdatum
	 * @param pEnddat
	 *            : Enddatum
	 * @param pTage
	 *            : Tage
	 * @param pAufrufer
	 *            : Aufrufer -> entscheidet, was berechnet wird
	 * @return
	 */
	public String datumsfelderBerechnen(String pAnfangsdat, String pEnddat, String pTage, String pAufrufer) {
		LocalDate start = LocalDate.parse(pAnfangsdat, SuperController.formatter);
		LocalDate ende = LocalDate.parse(pEnddat, SuperController.formatter);

		int tage = Integer.parseInt(pTage);

		switch (pAufrufer) {
		case "Enddatum":
			int diff = (int) ChronoUnit.DAYS.between(start, ende);
			return diff + "";
		case "Tage":
			ende = start.plusDays(Long.parseLong(pTage));
			return SuperController.formatter.format(ende);
		default:
			return "";
		}
	}
}
