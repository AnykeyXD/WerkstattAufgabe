package Modell;

import java.util.Date;

/**
 * 
 */
public class MTraining 
{
	private int trainingsID;
    private Date anfangsdatum;
    private Date enddatum;
    private int tage;
    private String bemerkungen;
    
	/**
     * Default constructor
     */
    public MTraining()
    {
    	
    }

    public int getTrainingsID() {
		return trainingsID;
	}

	public void setTrainingsID(int trainingsID) {
		this.trainingsID = trainingsID;
	}

	public Date getAnfangsdatum() {
		return anfangsdatum;
	}

	public void setAnfangsdatum(Date anfangsdatum) {
		this.anfangsdatum = anfangsdatum;
	}

	public Date getEnddatum() {
		return enddatum;
	}

	public void setEnddatum(Date enddatum) {
		this.enddatum = enddatum;
	}

	public int getTage() {
		return tage;
	}

	public void setTage(int tage) {
		this.tage = tage;
	}

	public String getBemerkungen() {
		return bemerkungen;
	}

	public void setBemerkungen(String bemerkungen) {
		this.bemerkungen = bemerkungen;
	}
}