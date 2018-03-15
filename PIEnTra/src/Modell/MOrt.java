package Modell;

/**
 * 
 */
public class MOrt 
{
	private int ortsID;
    private String geschaeftsstelle;
    private String gebaeude;
    private int etage;
    private String raum;
	
    /**
     * Default constructor
     */
    public MOrt(int portsID, String pGeschaeftsstelle, 
    		String pGebaeude, int pEtage, String pRaum) 
    {
    	ortsID 			 = portsID;
    	geschaeftsstelle = pGeschaeftsstelle;
    	gebaeude 		 = pGebaeude;
    	etage 			 = pEtage;
    	raum 			 = pRaum;
    }

	public int getOrtsID() {
		return ortsID;
	}

	public void setOrtsID(int ortsID) {
		this.ortsID = ortsID;
	}

	public String getGeschaeftsstelle() {
		return geschaeftsstelle;
	}

	public void setGeschaeftsstelle(String geschaeftsstelle) {
		this.geschaeftsstelle = geschaeftsstelle;
	}

	public String getGebaeude() {
		return gebaeude;
	}

	public void setGebaeude(String gebaeude) {
		this.gebaeude = gebaeude;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public String getRaum() {
		return raum;
	}

	public void setRaum(String raum) {
		this.raum = raum;
	}
}