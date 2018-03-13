package View;


import Modell.MKunde;

/**
 * 
 */
public class VKunde extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	private VLabelTextfeld ltf_KundenID;
    private VLabelTextfeld ltf_FirmenName;
    private VLabelTextfeld ltf_AnsprechPartner;
    private VLabelTextfeld ltf_Branche;
    private VLabelTextfeld ltf_Email;
    private VLabelTextfeld ltf_Rufnummer;
    private VLabelTextfeld lbl_Adresse;
    private VLabelTextfeld ltf_Strasse;
    private VLabelTextfeld ltf_PLZ;
    private VLabelTextfeld ltf_Bundesland;
    private VLabelTextfeld ltf_Stadt;
    private VLabelTextfeld btn_Zurueck;
    private VLabelTextfeld btn_KundeSuchen;
    
    
    /**
     * Default constructor
     */
    public VKunde() {
    }

    public void fillKunde(MKunde pKunde) {

    }

}