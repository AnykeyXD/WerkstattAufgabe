package Modell;

import java.time.LocalDate;
import java.util.Date;

/**
 * 
 */
public class MTraining 
{
	private String trainingsID;
    private LocalDate anfangsdatum;
    private LocalDate enddatum;
    private int tage;
    private String bemerkungen;
    private MKunde kunde;
    private MRessource ressource;
    
//	/**
//     * Default constructor
//     * @author Nils Winkel
//     */
//    public MTraining(String pTrainingsID, Date pAnfangsdatum, Date pEnddatum, int pTage, String pBemerkungen)
//    {
//    	this.trainingsID = pTrainingsID;
//    	this.anfangsdatum = pAnfangsdatum;
//    	this.enddatum = pEnddatum;
//    	this.tage = pTage;
//    	this.bemerkungen = pBemerkungen;
//    	
//    }
    /**
    * Default constructor  
    * @author Nils Winkel
    */
    public MTraining(String pTrainingsID, MKunde pKunde, MRessource pRessource, LocalDate pAnfangsdatum, LocalDate pEnddatum, int pTage, String pBemerkungen) {
    	this.trainingsID = pTrainingsID;
    	kunde = pKunde;
    	ressource = pRessource;
    	this.anfangsdatum = pAnfangsdatum;
    	this.enddatum = pEnddatum;
    	this.tage = pTage;
    	this.bemerkungen = pBemerkungen;
    	
	}

	public String getTrainingsID() 
    {
		return trainingsID;
	}

	public void setTrainingsID(String trainingsID) 
	{
		this.trainingsID = trainingsID;
	}

	public LocalDate getAnfangsdatum() 
	{
		return anfangsdatum;
	}

	public void setAnfangsdatum(LocalDate anfangsdatum) 
	{
		this.anfangsdatum = anfangsdatum;
	}

	public LocalDate getEnddatum() 
	{
		return enddatum;
	}

	public void setEnddatum(LocalDate enddatum) 
	{
		this.enddatum = enddatum;
	}

	public int getTage() 
	{
		return tage;
	}

	public void setTage(int tage) 
	{
		this.tage = tage;
	}

	public String getBemerkungen() 
	{
		return bemerkungen;
	}

	public void setBemerkungen(String bemerkungen) 
	{
		this.bemerkungen = bemerkungen;
	}
}