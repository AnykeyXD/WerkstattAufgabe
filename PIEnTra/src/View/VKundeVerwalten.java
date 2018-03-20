package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CKundeVerwalten;


/**
 * 
 */
public class VKundeVerwalten extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
	//Buttons deklariert und initialisiert
    private JButton btn_KundeAktualisieren=new JButton("   Kunde aktualiesieren   ");
    private JButton btn_NeuerKunde= new JButton("   Kunde anlegen   ");
    private JButton btn_Zur�ckHaupt= new JButton("   Zur�ck zum Hauptmen�   ");
    
    private CKundeVerwalten controller;
	
    
    /**
     * Default constructor
     */
    public VKundeVerwalten(CKundeVerwalten pCKundeVerwalten) {
    	controller = pCKundeVerwalten;
    	this.init();
    }
    
    public void init() {
    	
    	super.init();
    	super.setTxt_Postion("PlEnTra/KundeVerwalten");
    	
    	//Button zum panel hinzugef�gt
    	pnl_south.add(btn_KundeAktualisieren);
    	pnl_south.add(btn_NeuerKunde);
    	pnl_south.add(btn_Zur�ckHaupt);
    	
    	//KundenID darf nicht ver�ndert werden
    	ltf_KundenID.setEditable(false);
    	
    	//Actionlistener hinzugef�gt
    	btn_KundeAktualisieren.addActionListener(new Btn_kunde_aktualisieren_ActionListener());
    	btn_NeuerKunde.addActionListener(new Btn_neuer_kunde_ActionListener());
    	btn_Zur�ckHaupt.addActionListener(new Btn_zur�ck_haupt_ActionListener());
    	
    	this.setSize(700, 500);
    	setVisible(true);
	}
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		aktualisiert den Kunden
     * 
     * @author Tim Sp�rkel
     */
    public class Btn_kunde_aktualisieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test aktualisieren");
		}
    }
    /**
     * ActionListener fuer btn_NeuerKunde
     * 		Funktion noch nicht implementiert
     * 
     * @author Tim Sp�rkel
     */
    public class Btn_neuer_kunde_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Neuer Kunde");
		}
    }
    /**
     * ActionListener fuer btn_Zur�ckHaupt
     * 		Funktion noch nicht implementiert
     * 
     * @author Tim Sp�rkel
     */
    public class Btn_zur�ck_haupt_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			setVisible(false);
			controller.createZurueckHauptmenue();
		}
    }
	@Override
	protected void zeigeKundeSuchen() 
	{
		controller.zeigeKundeSuchen();
	}
}