package Controller;

import Controller.SuperController;
import Modell.MProdukt;

/** Erstellt von Nils Winkel, zukünftige Datenbank Implementierung! Hashmap Implementierung*/

public class CDbAccess {

	private static CDbAccess instance;
	
	private CDbAccess() {
		
	}


	/** Singelton Pattern */
    public static CDbAccess getInstance()
    {
    	if(instance == null)
    	{
    		instance = new CDbAccess();
    	}
    	return instance;
    }
    
    
    /** Erstellung der Produkt-Objekte (Beispieldaten) */
    MProdukt produkt_GWW = new MProdukt(1, "Grundlagen Warenwirtschaft (Kürzel GWW)", "Systematisch werden Sie in die Funktionalität der Software eingewiesen. Sie lernen mit Kunden-, Lieferanten- und Artikelverwaltung zu arbeiten und erfahren, wie Sie das Programm nutzen. Sie sind Einsteiger in das Programm und haben bislang wenig Erfahrung mit der Anwendung des Programms gesammelt. Nun möchten Sie den sicheren Umgang mit der Software erlernen. Zielgruppe: Einsteiger Voraussetzungen: Keine Inhalte: Verwalten von Stammdaten (Einrichtung und Pflege von Stammdaten, Verwalten von Warengruppen und Artikeldaten, Preispflege, Benutzer- und Rechteverwaltung, Arbeiten mit Stücklistenartikeln) Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "1.0");
    MProdukt produkt_EWW = new MProdukt(2, "Erweiterte Grundlagen Warenwirtschaft (Kürzel GWW", "Systematisch werden Sie in die erweiterte Funktionalität der Software eingewiesen. Sie lernen mit den Funktionen der Auftragsbearbeitung zu arbeiten. Sie sind Anwender und haben Erfahrung mit dem Programm gesammelt. Zielgruppe: Anwender Voraussetzungen: GWW Inhalte: Auftragsbearbeitung (Erstellung von Angeboten, Lieferscheinen). Arbeiten mit/ohne Lagerhaltung, Inventur und Preispflege, Grundlagen des Mahnwesens und des Zahlungseingangs, Sammel-/Abschlagsrechnungen, Arbeiten mit der Projektverwaltung, Preisänderungen und Kalkulation, Inventur/-auswertungen. Dauer: 2-5 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "2.0");
    MProdukt produkt_WWP = new MProdukt(3, "Produkt Warenwirtschaft Pro (Kürzel WWP)", "Systematisch werden Sie in die effiziente Anwendung der Software eingewiesen. Sie vertiefen Ihre Kenntnisse der Kunden-, Lieferanten- und Artikelverwaltung sowie die Auftragsbearbeitung. Sie liefern die Daten für eine professionelle Angebotserstellung. Sie erstellen Auswertungen und optimieren die Software für Ihr Unternehmen. Zielgruppe: Erfahrene Anwender Voraussetzungen: EWW Inhalte: Vertiefung der Inhalte aus GWW und EWW. Auswertungen (Aufbereitung der Daten für die Buchhaltung, Datentransfer, Druck von Listen und Berichten, Berichtszentrale konfigurieren). Dauer: 5-10 Tage Teilnehmer: 6-10 Methoden: Vortrag, Vorführung und praktische Übungen Anforderungen: MyERP Version 2.01 Server Edition, Beamer, MyERP Version 2.01, Windows Client", "3.0");
    
    
    
    
    
    
    
    
    
	
}
