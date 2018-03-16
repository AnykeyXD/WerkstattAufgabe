package Controller;

import java.util.HashMap;


import Controller.SuperController;
import Modell.MProdukt;
import Modell.MKunde;
import Modell.MOrt;
import Modell.MTrainer;
import Modell.MKunde;
import Modell.MAdresse;

/**
 * Erstellt von Nils Winkel, zukünftige Datenbank Implementierung! Hashmap Implementierung
 * @author Nils Winkel
 */

public class CDbAccess {

	private static CDbAccess instance;
	private SuperController superController = SuperController.getInstance();
	
	/** Erstellung der einzelnen HashMaps */
	private HashMap<Integer, MProdukt> produkte_Map = new HashMap<Integer, MProdukt>();
	private HashMap<Integer, MOrt> ort_Map = new HashMap<Integer, MOrt>();
	private HashMap<Integer, MTrainer> trainer_Map = new HashMap<Integer, MTrainer>();
	private HashMap<Integer, MAdresse> adresse_Map = new HashMap<Integer, MAdresse>();
	private HashMap<Integer, MKunde> kunde_Map = new HashMap<Integer, MKunde>();

	/** Singelton Pattern */
	public static CDbAccess getInstance() {
		if (instance == null) {
			instance = new CDbAccess();
		}
		return instance;
	}

	private CDbAccess() {

		/** Erstellung der Produkt-Objekte (Beispieldaten)
		 * @author Nils Winkel
		 *  */
		MProdukt produkt_GWW = new MProdukt(1, "Grundlagen Warenwirtschaft (Kürzel GWW)",
				"Systematisch werden Sie in die Funktionalität der Software eingewiesen. Sie lernen mit Kunden-, Lieferanten- und Artikelverwaltung zu arbeiten und erfahren, wie Sie das Programm nutzen. Sie sind Einsteiger in das Programm und haben bislang wenig Erfahrung mit der Anwendung des Programms gesammelt. Nun möchten Sie den sicheren Umgang mit der Software erlernen. Zielgruppe: Einsteiger Voraussetzungen: Keine Inhalte: Verwalten von Stammdaten (Einrichtung und Pflege von Stammdaten, Verwalten von Warengruppen und Artikeldaten, Preispflege, Benutzer- und Rechteverwaltung, Arbeiten mit Stücklistenartikeln) Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client",
				"1.0");
		MProdukt produkt_EWW = new MProdukt(2, "Erweiterte Grundlagen Warenwirtschaft (Kürzel GWW",
				"Systematisch werden Sie in die erweiterte Funktionalität der Software eingewiesen. Sie lernen mit den Funktionen der Auftragsbearbeitung zu arbeiten. Sie sind Anwender und haben Erfahrung mit dem Programm gesammelt. Zielgruppe: Anwender Voraussetzungen: GWW Inhalte: Auftragsbearbeitung (Erstellung von Angeboten, Lieferscheinen). Arbeiten mit/ohne Lagerhaltung, Inventur und Preispflege, Grundlagen des Mahnwesens und des Zahlungseingangs, Sammel-/Abschlagsrechnungen, Arbeiten mit der Projektverwaltung, Preisänderungen und Kalkulation, Inventur/-auswertungen. Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client",
				"2.0");
		MProdukt produkt_WWP = new MProdukt(3, "Produkt Warenwirtschaft Pro (Kürzel WWP)",
				"Systematisch werden Sie in die effiziente Anwendung der Software eingewiesen. Sie vertiefen Ihre Kenntnisse der Kunden-, Lieferanten- und Artikelverwaltung sowie die Auftragsbearbeitung. Sie liefern die Daten für eine professionelle Angebotserstellung. Sie erstellen Auswertungen und optimieren die Software für Ihr Unternehmen. Zielgruppe: Erfahrene Anwender Voraussetzungen: EWW Inhalte: Vertiefung der Inhalte aus GWW und EWW. Auswertungen (Aufbereitung der Daten für die Buchhaltung, Datentransfer, Druck von Listen und Berichten, Berichtszentrale konfigurieren). Dauer: 5-10 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client",
				"3.0");

		/**
		 * Erstellung der Ort-Objekte (Beispieldaten) WA=Wallau HO=Hofheim Nue=Nürnberg
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
		MTrainer trainer_LP = new MTrainer(1, "Lukas", "Poodolski", "Produkte GWW, EWW");
		MTrainer trainer_RK = new MTrainer(2, "Roland", "Kaiser", "Produkt GWW");
		MTrainer trainer_RS = new MTrainer(3, "Ralf", "Siehgel", "Produkte GWW, EWW, WWP");
		MTrainer trainer_KL = new MTrainer(4, "Karl", "Lager-Feld", "EWW");
		MTrainer trainer_HK = new MTrainer(5, "Heidi", "Kluhm", "Produkt WWP");
		MTrainer trainer_SI = new MTrainer(6, "Swanja", "Ikeah", "Produkt WWP");

		/** Erstellung der Adress-Objekte (Beispieldaten) */
		MAdresse adresse_Aeron = new MAdresse(1, "Rainer-Kausing-Straße 4", "Hessen", "Hochheim/Main", 65239);
		MAdresse adresse_Agosini = new MAdresse(2, "Kanzlereistraße 17", "Baden-Württemberg", "Pforzheim", 75175);
		MAdresse adresse_Eton = new MAdresse(3, "Hardterring 8", "Baden-Württemberg", "Stockach", 78333);

		/** Erstellung der Kunden-Objekte (Beispieldaten) */
		MKunde kunde_Aeron = new MKunde(1, "Aeron Pumpen GmbH", "Heinrich Klaist", adresse_Aeron.getAdressID(),
				"+49 6146 6939", "Pharmaindustrie", adresse_Aeron.getBundesland(), "info@aeronpump-it.de");
		MKunde kunde_Agosini = new MKunde(2, "Agosini", "Maria Jung", adresse_Agosini.getAdressID(), "+49 7231 9611",
				"Edelmetallverarbeitung", adresse_Agosini.getBundesland(), "info@agosini.de");
		MKunde kunde_Eton = new MKunde(3, "ETONGRUPPE", "Dietmar Bohlen", adresse_Eton.getAdressID(), "+49 7771 8191",
				"Automobilzulieferer", adresse_Eton.getBundesland(), "info@etongruppe.com");
		
		
		/** Wert Zuweisung der einzelnen HashMaps
		 * @author Nils Winkel
		 *  */
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
	}

}
