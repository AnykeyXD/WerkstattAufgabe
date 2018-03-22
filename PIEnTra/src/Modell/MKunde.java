package Modell;

/**
 * 
 */
public class MKunde 
{
	private int kundenID;
    private String   firmenname;
    private String   ansprechpartner;
    private MAdresse adresse;
    private String   telefon;
    private String   branche;
    private String   bundesland;
    private String   email;
    
    /**
     * Default constructor
     * @author Nils Winkel
     */
    public MKunde(int pKundenID, String pFirmenname, String pAnsprechpartner,MAdresse pAdresse, String pTelefon, String pBranche, String pBundesland, String pEmail)
    {
    	kundenID = pKundenID;
    	firmenname = pFirmenname;
    	ansprechpartner = pAnsprechpartner;
    	adresse = pAdresse;
    	telefon = pTelefon;
    	branche = pBranche;
    	bundesland = pBundesland;
    	email = pEmail;
    }



	public String getFirmenname() {
		return firmenname;
	}



	public void setFirmenname(String firmenname) {
		this.firmenname = firmenname;
	}



	public String getAnsprechpartner() {
		return ansprechpartner;
	}



	public void setAnsprechpartner(String ansprechpartner) {
		this.ansprechpartner = ansprechpartner;
	}



	public MAdresse getAdresse() {
		return adresse;
	}



	public void setAdresse(MAdresse adresse) {
		this.adresse = adresse;
	}



	public String getTelefon() {
		return telefon;
	}



	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}



	public String getBranche() {
		return branche;
	}



	public void setBranche(String branche) {
		this.branche = branche;
	}



	public String getBundesland() {
		return bundesland;
	}



	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getKundenID() {
		return kundenID;
	}
    
    

}