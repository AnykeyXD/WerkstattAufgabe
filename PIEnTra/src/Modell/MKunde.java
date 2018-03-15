package Modell;

/**
 * 
 */
public class MKunde 
{
	private int kundenID;
    private String firmenname;
    private String ansprechpartner;
    private MAdresse adresse;
    private String telefon;
    private String branche;
    private String bundesland;
    private String email;
    
    
	
    /**
     * Default constructor
     * @author Nils Winkel
     */
    public MKunde(int pKundenID, String pFirmenname, String pAnsprechpartner,int adresse, String pTelefon, String pBranche, String pBundesland, String pEmail)
    {
    	kundenID = pKundenID;
    	firmenname = pFirmenname;
    	ansprechpartner = pAnsprechpartner;
    	adresse = adresse;
    	telefon = pTelefon;
    	branche = pBranche;
    	bundesland = pBundesland;
    	email = pEmail;
    }

}