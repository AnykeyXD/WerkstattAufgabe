package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CKundeWaehlen;


/**
 * 
 */
public class VKundeWaehlen extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
	//Buttons deklariert und initialisiert
	private JButton btn_KundeWaehlen  = new JButton("   Kunde wählen   ");
    private JButton btn_ZurückTraining=new JButton("   Zurück zu Training konfigurieren  ");
    
	private CKundeWaehlen controller;
    
    
    /**
     * Default constructor
     */
    public VKundeWaehlen(CKundeWaehlen pCKundeWaehlen) {
    	controller = pCKundeWaehlen;
    	this.init();
    }
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/KundeWaehlen");
    	
    	//Button zum panel hinzugefügt
    	pnl_south.add(btn_KundeWaehlen);
    	pnl_south.add(btn_ZurückTraining );
    	
    	//Actionlistener hinzugefügt
    	btn_KundeWaehlen.addActionListener(new Btn_kunde_waehlen_ActionListener());
    	btn_ZurückTraining.addActionListener(new Btn_zurück_training_ActionListener());
    	this.setSize(700, 500);    	
    	setVisible(true);
    }

    /** 
     * 
     *  @author toni
     *  **/
    
	public void textfelderFuellen(int pKundenID,
			String pFirmenname,
			String pAnsprechpartner,
			String pBranche,
			String pEmail,
			String pRufnummer, 
			String pStrasse, 
			String pPostleitzahl, 
			String pBundesland,
			String pStadt)
	{
		ltf_KundenID.setText(pKundenID +"");
		ltf_FirmenName.setText(pFirmenname);
		ltf_AnsprechPartner.setText(pAnsprechpartner);
		ltf_Branche.setText(pBranche);
		ltf_Email.setText(pEmail);
		ltf_Rufnummer.setText(pRufnummer);
		ltf_Strasse.setText(pStrasse);
		ltf_PLZ.setText(pPostleitzahl);
		ltf_Bundesland.setText(pBundesland);
		ltf_Stadt.setText(pStadt);
	}
    

    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		aktualisiert den Kunden
 **/
    public class Btn_kunde_waehlen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
    		setVisible(false);
			controller.createSubmitKundeWaehlen(Integer.parseInt(ltf_KundenID.getText()));
			
		}
    }
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		aktualisiert den Kunden
     * 
     * @author Tim Spürkel
     */
    public class Btn_zurück_training_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			setVisible(false);
			controller.createZurueckTraining();
		}
    }
	@Override
	protected void zeigeKundeSuchen() 
	{
		controller.zeigeKundeSuchen();
	}
}
