package Controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import Modell.MAdresse;
import Modell.MKunde;
import Modell.MOrt;
import Modell.MProdukt;
import Modell.MRessource;
import Modell.MTrainer;
import Modell.MTraining;

/**
 * Erstellt von Nils Winkel, zukünftige Datenbank Implementierung! Hashmap
 * Implementierung
 * 
 * @author Nils Winkel
 */

public class CDbAccess {

	private static CDbAccess instance;
	// private SuperController superController = SuperController.getInstance();

	/** Erstellung der einzelnen HashMaps */
	private HashMap<String, MProdukt> produkte_Map = new HashMap<String, MProdukt>();
	private HashMap<Integer, MOrt> ort_Map = new HashMap<Integer, MOrt>();
	private HashMap<Integer, MTrainer> trainer_Map = new HashMap<Integer, MTrainer>();
	private HashMap<Integer, MAdresse> adresse_Map = new HashMap<Integer, MAdresse>();
	private HashMap<Integer, MKunde> kunde_Map = new HashMap<Integer, MKunde>();
	private HashMap<String, MTraining> training_Map = new HashMap<String, MTraining>();

	/** Singelton Pattern */
	public static CDbAccess getInstance() {
		if (instance == null) {
			instance = new CDbAccess();
		}
		return instance;
	}

	private CDbAccess() {
		/**
		 * Erstellung der Produkt-Objekte (Beispieldaten)
		 * 
		 * @author Nils Winkel
		 */
		MProdukt produkt_GWW = new MProdukt("GWW", "Grundlagen Warenwirtschaft (Kürzel GWW)",
				"Systematisch werden Sie in die Funktionalität der Software eingewiesen. Sie lernen mit Kunden-, Lieferanten- und Artikelverwaltung zu arbeiten und erfahren, wie Sie das Programm nutzen. Sie sind Einsteiger in das Programm und haben bislang wenig Erfahrung mit der Anwendung des Programms gesammelt. Nun möchten Sie den sicheren Umgang mit der Software erlernen. Zielgruppe: Einsteiger Voraussetzungen: Keine Inhalte: Verwalten von Stammdaten (Einrichtung und Pflege von Stammdaten, Verwalten von Warengruppen und Artikeldaten, Preispflege, Benutzer- und Rechteverwaltung, Arbeiten mit Stücklistenartikeln) Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client");
		MProdukt produkt_EWW = new MProdukt("EWW", "Erweiterte Grundlagen Warenwirtschaft (Kürzel EWW)",
				"Systematisch werden Sie in die erweiterte Funktionalität der Software eingewiesen. Sie lernen mit den Funktionen der Auftragsbearbeitung zu arbeiten. Sie sind Anwender und haben Erfahrung mit dem Programm gesammelt. Zielgruppe: Anwender Voraussetzungen: GWW Inhalte: Auftragsbearbeitung (Erstellung von Angeboten, Lieferscheinen). Arbeiten mit/ohne Lagerhaltung, Inventur und Preispflege, Grundlagen des Mahnwesens und des Zahlungseingangs, Sammel-/Abschlagsrechnungen, Arbeiten mit der Projektverwaltung, Preisänderungen und Kalkulation, Inventur/-auswertungen. Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client");
		MProdukt produkt_WWP = new MProdukt("WWP", "Produkt Warenwirtschaft Pro (Kürzel WWP)",
				"Systematisch werden Sie in die effiziente Anwendung der Software eingewiesen. Sie vertiefen Ihre Kenntnisse der Kunden-, Lieferanten- und Artikelverwaltung sowie die Auftragsbearbeitung. Sie liefern die Daten für eine professionelle Angebotserstellung. Sie erstellen Auswertungen und optimieren die Software für Ihr Unternehmen. Zielgruppe: Erfahrene Anwender Voraussetzungen: EWW Inhalte: Vertiefung der Inhalte aus GWW und EWW. Auswertungen (Aufbereitung der Daten für die Buchhaltung, Datentransfer, Druck von Listen und Berichten, Berichtszentrale konfigurieren). Dauer: 5-10 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client");

		/**
		 * Erstellung der Ort-Objekte (Beispieldaten) WA=Wallau HO=Hofheim Nue=Nürnberg
		 * 
		 * @author Nils Winkel
		 */
		// Wallau
		MOrt ort_WA01 = new MOrt(1, "Geschäftsstelle Wallau", "Gebäude A", 1, "01");
		MOrt ort_WA02 = new MOrt(2, "Geschäftsstelle Wallau", "Gebäude A", 1, "02");
		// Hofheim
		MOrt ort_HO01 = new MOrt(3, "Geschäftsstelle Hofheim", "Gebäude K", 2, "01");
		MOrt ort_HO02 = new MOrt(4, "Geschäftsstelle Hofheim", "Gebäude K", 2, "02");
		// Nürnberg
		MOrt ort_NUE01 = new MOrt(5, "Geschäftsstelle Nürnberg", "Gebäude L", 1, "03");
		MOrt ort_NUE02 = new MOrt(6, "Geschäftsstelle Nürnberg", "Gebäude L", 3, "01");

		/** Erstellung der Trainer-Objekte (Beispieldaten) */
		MTrainer trainer_LP = new MTrainer(1, "Lukas", "Poodolski", "GWW, EWW");
		MTrainer trainer_RK = new MTrainer(2, "Roland", "Kaiser", "GWW");
		MTrainer trainer_RS = new MTrainer(3, "Ralf", "Siehgel", "GWW, EWW, WWP");
		MTrainer trainer_KL = new MTrainer(4, "Karl", "Lager-Feld", "EWW");
		MTrainer trainer_HK = new MTrainer(5, "Heidi", "Kluhm", "WWP");
		MTrainer trainer_SI = new MTrainer(6, "Swanja", "Ikeah", "WWP");

		/** Erstellung der Adress-Objekte (Beispieldaten) */
		MAdresse adresse_Aeron = new MAdresse(1, "Rainer-Kausing-Straße 4", "Hessen", "Hochheim/Main", "65239");
		MAdresse adresse_Agosini = new MAdresse(2, "Kanzlereistraße 17", "Baden-Württemberg", "Pforzheim", "75175");
		MAdresse adresse_Eton = new MAdresse(3, "Hardterring 8", "Baden-Württemberg", "Stockach", "78333");

		/** Erstellung der Kunden-Objekte (Beispieldaten) */
		MKunde kunde_Aeron = new MKunde(1, "Aeron Pumpen GmbH", "Heinrich Klaist", adresse_Aeron, "+49 6146 6939",
				"Pharmaindustrie", adresse_Aeron.getBundesland(), "info@aeronpump-it.de");
		MKunde kunde_Agosini = new MKunde(2, "Agosini", "Maria Jung", adresse_Agosini, "+49 7231 9611",
				"Edelmetallverarbeitung", adresse_Agosini.getBundesland(), "info@agosini.de");
		MKunde kunde_Eton = new MKunde(3, "ETONGRUPPE", "Dietmar Bohlen", adresse_Eton, "+49 7771 8191",
				"Automobilzulieferer", adresse_Eton.getBundesland(), "info@etongruppe.com");

		MRessource ressource_Test = new MRessource(ort_WA01, trainer_SI, produkt_WWP);

		// MTraining training_Test = new MTraining("1",
		// LocalDate.parse("12.12.2017", SuperController.formatter),
		// LocalDate.parse("01.01.2000", SuperController.formatter), 2, "Test");
		MTraining training_Neu = new MTraining("1", kunde_Aeron, ressource_Test,
				LocalDate.parse("12.12.2017", SuperController.formatter),
				LocalDate.parse("01.01.2000", SuperController.formatter), 2, "test");
		MTraining training_Neu2 = new MTraining("2", kunde_Agosini, ressource_Test,
				LocalDate.parse("12.12.2017", SuperController.formatter),
				LocalDate.parse("01.01.2000", SuperController.formatter), 2, "test");

		/**
		 * Wert Zuweisung der einzelnen HashMaps
		 * 
		 * @author Nils Winkel
		 */
		produkte_Map.put(produkt_GWW.getProduktID(), produkt_GWW);
		produkte_Map.put(produkt_EWW.getProduktID(), produkt_EWW);
		produkte_Map.put(produkt_WWP.getProduktID(), produkt_WWP);

		ort_Map.put(ort_WA01.getOrtsID(), ort_WA01);
		ort_Map.put(ort_WA02.getOrtsID(), ort_WA02);
		ort_Map.put(ort_HO01.getOrtsID(), ort_HO01);
		ort_Map.put(ort_HO02.getOrtsID(), ort_HO02);
		ort_Map.put(ort_NUE01.getOrtsID(), ort_NUE01);
		ort_Map.put(ort_NUE02.getOrtsID(), ort_NUE02);

		trainer_Map.put(trainer_LP.getTrainerID(), trainer_LP);
		trainer_Map.put(trainer_RK.getTrainerID(), trainer_RK);
		trainer_Map.put(trainer_RS.getTrainerID(), trainer_RS);
		trainer_Map.put(trainer_KL.getTrainerID(), trainer_KL);
		trainer_Map.put(trainer_HK.getTrainerID(), trainer_HK);
		trainer_Map.put(trainer_SI.getTrainerID(), trainer_SI);

		adresse_Map.put(adresse_Aeron.getAdressID(), adresse_Aeron);
		adresse_Map.put(adresse_Agosini.getAdressID(), adresse_Agosini);
		adresse_Map.put(adresse_Eton.getAdressID(), adresse_Eton);

		kunde_Map.put(kunde_Aeron.getKundenID(), kunde_Aeron);
		kunde_Map.put(kunde_Agosini.getKundenID(), kunde_Agosini);
		kunde_Map.put(kunde_Eton.getKundenID(), kunde_Eton);

		training_Map.put(training_Neu.getTrainingsID(), training_Neu);
		training_Map.put(training_Neu2.getTrainingsID(), training_Neu2);
	}

	public MProdukt getProdukte_Map(String key) {
		return produkte_Map.get(key);
	}

	public MOrt getOrt_Map(int key) {
		return ort_Map.get(key);
	}

	public MTrainer getTrainer_Map(int key) {
		return trainer_Map.get(key);
	}

	public MAdresse getAdresse_Map(int key) {
		return adresse_Map.get(key);
	}

	public MKunde getKunde_Map(int key) {
		

    if(kunde_Map.get(key) == null || (kunde_Map.get(key) != null && kunde_Map.containsKey(key) != true)){


			return null;
			}else{
			return kunde_Map.get(key);	
			}
		//}
		
	}

	public MTraining getTraining_Map(String key) {
		return training_Map.get(key);
	}

	public void setProdukte_Map(MProdukt pProdukt) {
		// Key wird automatisch aus dem Datenelement geholt
		produkte_Map.put(pProdukt.getProduktID(), pProdukt);
	}

	public void setOrt_Map(MOrt pOrt) {
		ort_Map.put(pOrt.getOrtsID(), pOrt);
	}

	public void setTrainer_Map(MTrainer pTrainer) {
		trainer_Map.put(pTrainer.getTrainerID(), pTrainer);
	}

	public void setAdresse_Map(MAdresse pAdresse) {
		adresse_Map.put(pAdresse.getAdressID(), pAdresse);
	}

	public void setKunde_Map(MKunde pKunde) {
		kunde_Map.put(pKunde.getKundenID(), pKunde);
	}

	public void setTraining_Map(MTraining pTraining) {
		training_Map.put(pTraining.getTrainingsID(), pTraining);
	}

	/**
	 * Funktion zur Erstellung eines neuen Kunden + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createKunde(int pKundenID, String pFirmenname, String pAnsprechpartner, MAdresse adresse,
			String pTelefon, String pBranche, String pBundesland, String pEmail) {
		kunde_Map.put(pKundenID,
				new MKunde(pKundenID, pFirmenname, pAnsprechpartner, adresse, pTelefon, pBranche, pBundesland, pEmail));
	}

	/**
	 * Funktion zur Erstellung einer neuen Adresse + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createAdresse(int pAdressID, String pStrasse, String pBundesland, String pStadt, String pPlz) {
		adresse_Map.put(pAdressID, new MAdresse(pAdressID, pStrasse, pBundesland, pStadt, pPlz));
	}

	/**
	 * Funktion zur Erstellung eines neuen Trainers + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createTrainer(int pTrainerID, String pVorname, String pName, String pProdukte) {
		trainer_Map.put(pTrainerID, new MTrainer(pTrainerID, pVorname, pName, pProdukte));
	}

	/**
	 * Funktion zur Erstellung eines neuen Orts + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createOrt(int portsID, String pGeschaeftsstelle, String pGebaeude, int pEtage, String pRaum) {
		ort_Map.put(portsID, new MOrt(portsID, pGeschaeftsstelle, pGebaeude, pEtage, pRaum));
	}

	/**
	 * Funktion zur Erstellung eines neuen Produkts + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createProdukt(String pProduktID, String pBezeichnung, String pBeschreibung) {
		produkte_Map.put(pProduktID, new MProdukt(pProduktID, pBezeichnung, pBeschreibung));
	}

	/**
	 * Funktion zur Erstellung eines neuen Trainings + Hinzufügen in der HashMap
	 * 
	 * @autohr Nils Winkel
	 */

	public void createTraining(String pTrainingID, MKunde pKunde, MRessource pRessource, LocalDate pAnfangsdatum,
			LocalDate pEnddatum, int pTage, String pBemerkungen) {
		training_Map.put(pTrainingID,
				new MTraining(pTrainingID, pKunde, pRessource, pAnfangsdatum, pEnddatum, pTage, pBemerkungen));
	}

	public void deleteTraining(String pTraining) {
		training_Map.remove(pTraining);
	}

	public void updateTraining(MTraining pTraining) {
		training_Map.replace(pTraining.getTrainingsID(), pTraining);
	}

	public void updateKunde(MKunde pKunde) {
		kunde_Map.replace(pKunde.getKundenID(), pKunde);
	}

	/**
	 * @author Nils Winkel
	 * @param pID
	 * @return Gibt den Boolean Wert zurück, ob die TrainingsID bereits exisitiert
	 */
	public boolean containsTrainingID(String pID) {
		return training_Map.containsKey(pID);
	}

	/**
	 * Gibt alle Produkt-Ids zurück
	 * 
	 * @return String[] mit allen ProduktIds
	 * @author joern
	 */
	public String[] getProduktIds() {
		Set<String> keySet = produkte_Map.keySet();
		String[] str_keys = new String[keySet.size()]; // .toArray() nicht möglich, da ein Object[] nicht zu einem
														// String[] gecastet werden kann
		int i = 0; // Variable, die sich je Schleifendurchlauf für den Index des Arrays erhöht
		for (String currKey : keySet) // Jedes Objekt des KeySets in das String[] speichern
		{
			str_keys[i++] = currKey;
		}
		return str_keys;
	}

	/**
	 * Gibt alle Trainings-Ids zurück
	 * 
	 * @return String[] mit allen TrainingsIds
	 * @author joern
	 */
	public String[] getTrainingIds() {
		Set<String> keySet = training_Map.keySet();
		String[] str_keys = new String[keySet.size()]; // .toArray() nicht möglich, da ein Object[] nicht zu einem
														// String[] gecastet werden kann
		int i = 0; // Variable, die sich je Schleifendurchlauf für den Index des Arrays erhöht
		for (String currKey : keySet) // Jedes Objekt des KeySets in das String[] speichern
		{
			str_keys[i++] = currKey;
		}
		return str_keys;
	}

	/**
	 * @return MTrainer[] mit allen Trainern
	 */
	public MTrainer[] getTrainer()
	{ 
		Collection<MTrainer> values = trainer_Map.values();
		MTrainer[] trainer_obj = new MTrainer[values.size()];
		int i = 0;	//Laufvariable
		for(MTrainer currTrainer : values)
		{
			trainer_obj[i++] = currTrainer;
		}
		
		return trainer_obj; 
	}
	
	/**
	 * @return MOrt[] mit allen Orten
	 */
	public MOrt[] getOrte()
	{ 
		Collection<MOrt> values = ort_Map.values();
		MOrt[] orte_obj = new MOrt[values.size()];
		int i = 0;	//Laufvariable
		for(MOrt currOrt : values)
		{
			orte_obj[i++] = currOrt;
		}
		
		return orte_obj; 
	}
}