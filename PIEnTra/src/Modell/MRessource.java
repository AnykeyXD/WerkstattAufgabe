package Modell;

/**
 * 
 */
public class MRessource 
{
	private MOrt ort;
    private MTrainer trainer;
    private MProdukt produkt;

    /**
     * Default constructor
     * @author Nils Winkel
     */
    public MRessource() {
    }

	public MOrt getOrt() {
		return ort;
	}

	public void setOrt(MOrt ort) {
		this.ort = ort;
	}

	public MTrainer getTrainer() {
		return trainer;
	}

	public void setTrainer(MTrainer trainer) {
		this.trainer = trainer;
	}

	public MProdukt getProdukt() {
		return produkt;
	}

	public void setProdukt(MProdukt produkt) {
		this.produkt = produkt;
	}
}