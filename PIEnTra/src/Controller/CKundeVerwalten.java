package Controller;
import java.time.LocalDate;

import Modell.MAdresse;
import Modell.MKunde;
import Modell.MTraining;
import View.VKundeVerwalten;
/**
 * 
 */
public class CKundeVerwalten
{
	private VKundeVerwalten view;
	private static CKundeVerwalten instance;
	private SuperController superController;
	/**
	 * Singelton pattern
	 */
	private CKundeVerwalten() {}

	public static CKundeVerwalten getInstance()
	{
		if(instance == null)
		{
			instance = new CKundeVerwalten();
		}
		return instance;
	}

	public void createView()
	{
		if(view == null)
		{
			view = new VKundeVerwalten(instance);
		}
		else
		{
			view.setVisible(true);
		}
	}  

	public void kundeSuchenFuellen(int pKunden_ID){



		MKunde kunde = superController.kundeSuchen(pKunden_ID);
		view.textfelderFuellen(kunde.getKundenID(),
				kunde.getFirmenname(),
				kunde.getAnsprechpartner(),
				kunde.getBranche(),
				kunde.getEmail(),
				kunde.getTelefon(), 
				kunde.getAdresse().getStrasse(),
				kunde.getAdresse().getPlz(),
				kunde.getAdresse().getBundesland(),
				kunde.getAdresse().getStadt());
	}
	 /**
     * Übernimmt die gemachten aenderungen in VKundeVerwalten
     * 
     * @author Tim Spürkel
     */
	public void kunde_aktualisieren(int    pKundenID,
									String pFirmenname,
									String pAnsprechpartner,
									String pBranche, 
									String pEmail,
									String pRufnummer,
									String pStraße,
									String pPostleitzahl, 
									String pBundesland, 
									String pStadt) 
	{
		MKunde temp = superController.kundeSuchen(pKundenID);
		MAdresse temp2 = superController.adresseSuchen(pKundenID);
		temp.setFirmenname(pFirmenname);
		temp.setAnsprechpartner(pAnsprechpartner);
		temp.setBranche(pBranche);
		temp.setEmail(pEmail);
		temp.setTelefon(pRufnummer);
		temp2.setStrasse(pStraße);
		temp2.setPlz(pPostleitzahl);
		temp2.setBundesland(pBundesland);
		temp2.setStadt(pStadt);
		
		superController.kundeAendern(temp);
	}

	public void superSetzen(SuperController pSuperController)
	{
		superController = pSuperController;
	}

	public void zeigeKundeSuchen()
	{
		superController.zeigeKundeSuchen(1);

	}
	public void createZurueckHauptmenue()
	{
		superController.zeigeHauptmenue();
	}
}