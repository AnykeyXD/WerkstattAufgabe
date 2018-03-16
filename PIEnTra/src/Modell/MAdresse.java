package Modell;

/**
 * 
 */
public class MAdresse 
{
	private int adressID;
    private String strasse;
    private String bundesland;
    private String stadt;
    private String plz;
	
    /**
     * Default constructor
     * @author Nils Winkel
     */
    public MAdresse(int pAdressID, String pStrasse, String pBundesland, String pStadt, String pPlz) {
    	adressID = pAdressID;
    	strasse = pStrasse;
    	bundesland = pBundesland;
    	stadt = pStadt;
    	plz = pPlz;
    }

	public int getAdressID() {
		return adressID;
	}

	public void setAdressID(int adressID) {
		this.adressID = adressID;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getBundesland() {
		return bundesland;
	}

	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
}