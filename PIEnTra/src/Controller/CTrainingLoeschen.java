package Controller;

import javax.swing.JOptionPane;

import Modell.MTraining;
import View.VTrainingLoeschen;

/**
 * Controller zur View VTrainingLoeschen
 */
public class CTrainingLoeschen {
	private VTrainingLoeschen view;
	private static CTrainingLoeschen instance;
	private SuperController superController;

	/**
	 * leerer Konstruktor, Sichtbarkeit auf private gesetzt um Instanziierung zu
	 * verhindern
	 */
	private CTrainingLoeschen() {
	}

	/**
	 * @return eigene Instance -> existiert immer nur eine gleichzeitig, da
	 *         SingeltonPattern
	 */
	public static CTrainingLoeschen getInstance() {
		if (instance == null) {
			instance = new CTrainingLoeschen();
		}
		return instance;
	}

	public void createView() {
		if (view == null) {
			view = new VTrainingLoeschen(instance);
		} else {
			view.setVisible(true);
		}
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
	 * Supercontroller setzten
	 * 
	 * @param pSuperController
	 *            - instance des SuperControllers
	 */
	public void superSetzen(SuperController pSuperController) {
		superController = pSuperController;
	}

	/**
	 * View navigation
	 */
	public void setHauptmenue() {
		superController.zeigeHauptmenue();
	}

	/**
	 * View navigation
	 * 
	 * @author Tim Spürkel
	 */
	public void createTrainingSuchen() {
		superController.zeigeTrainingSuchen(1);
	}

	/**
	 * sucht das Training anhand der Übergebenen Trainings-ID und fuellt die Felder,
	 * wenn es eindeutig ist, sonst wird das Auswahlview "VTrainingSuchen" gezeigt
	 * 
	 * @param pTrainings_ID
	 */
	public void training_suchen(String pTrainings_ID) {
		view.setVisible(false);
		superController.zeigeTrainingSuchen(1); // 1 - Herkunft uebergeben
	}

	/**
	 * löscht das Training mit der Ausgewählten ID
	 * 
	 * @param pTrainings_ID
	 *            : Trainings-ID des zu löschenden Elements
	 */
	public void training_loeschen(String pTrainings_ID) {
		if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Möchten Sie das Training wirklich löschen?",
				"warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)) // Sicherheitsabfrage
		{
			superController.trainingLoeschen(pTrainings_ID.trim()); // TrainingsID mit trim() von Leerzeichen entfernen
																	// -> findet sonst ggf. nicht den Eintrag
			view.textfelderLeeren(); // nach dem löschen die Textfelder
		}
	}
}
