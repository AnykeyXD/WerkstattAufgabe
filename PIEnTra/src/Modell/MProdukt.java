package Modell;

/**
 * 
 */
public class MProdukt 
{
	private String produktID;
    private String bezeichnung;
    private String beschreibung;


    /**
     * Default constructor
     * @author Nils Winkel
     */
	public MProdukt(String pProduktID, String pBezeichnung, String pBeschreibung) 
	{
		this.produktID = pProduktID;
		this.bezeichnung = pBezeichnung;
		this.beschreibung = pBeschreibung;
	}

	public String getProduktID() 
	{
		return produktID;
	}

	public void setProduktID(String produktID)
	{
		this.produktID = produktID;
	}

	public String getBezeichnung()
	{
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) 
	{
		this.bezeichnung = bezeichnung;
	}

	public String getBeschreibung() 
	{
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) 
	{
		this.beschreibung = beschreibung;
	}
}