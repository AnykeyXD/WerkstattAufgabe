package Modell;

/**
 * 
 */
public class MTrainer 
{
	private int trainerID;
    private String vorname;
    private String name;
    private String produkte;

    /**
     * Default constructor
     */
    public MTrainer(int pTrainerID, String pVorname, String pName, String pProdukte)
    {
    	trainerID = pTrainerID;
    	vorname = pVorname;
    	name = pName;
    	produkte = pProdukte;
    }

	public int getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}