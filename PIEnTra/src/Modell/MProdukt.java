package Modell;

/**
 * 
 */
public class MProdukt 
{
	private String produktID;
    private String bezeichnung;
    private String beschreibung;
    private String version;

    /**
     * Default constructor
     * @author Nils Winkel
     */
	public MProdukt(String pProduktID, String pBezeichnung, String pBeschreibung, String pVersion) {
		this.produktID = pProduktID;
		this.bezeichnung = pBezeichnung;
		this.beschreibung = pBeschreibung;
		this.version = pVersion;
	}

	public String getProduktID() {
		return produktID;
	}

	public void setProduktID(String produktID) {
		this.produktID = produktID;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}