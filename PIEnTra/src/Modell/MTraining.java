package Modell;

import java.util.Date;

/**
 * 
 */
public class MTraining 
{
	private String trainingsID;
    private Date anfangsdatum;
    private Date enddatum;
    private int tage;
    private String bemerkungen;
    
	/**
     * Default constructor
     * @author Nils Winkel
     */
    public MTraining(String pTrainingsID, Date pAnfangsdatum, Date pEnddatum, int pTage, String pBemerkungen)
    {
    	this.trainingsID = pTrainingsID;
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

	public Date getAnfangsdatum() 
	{
		return anfangsdatum;
	}

	public void setAnfangsdatum(Date anfangsdatum) 
	{
		this.anfangsdatum = anfangsdatum;
	}

	public Date getEnddatum() 
	{
		return enddatum;
	}

	public void setEnddatum(Date enddatum) 
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