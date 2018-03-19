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
	
    private JButton btn_KundeAktualisieren=new JButton("   Kunde aktualiesieren   ");
    private JButton btn_NeuerKunde= new JButton("   Kunde anlegen   ");
    private JButton btn_ZurückHaupt= new JButton("   Zurück zum Hauptmenü   ");
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
    	//pnl_center.add(btn_NeuerKunde);
    	pnl_south.add(btn_KundeAktualisieren);
    	pnl_south.add(btn_NeuerKunde);
    	pnl_south.add(btn_ZurückHaupt);
    	
    	
    	btn_KundeAktualisieren.addActionListener(new Btn_kunde_aktualisieren_ActionListener());
    	btn_NeuerKunde.addActionListener(new Btn_neuer_kunde_ActionListener());
    	btn_ZurückHaupt.addActionListener(new Btn_zurück_haupt_ActionListener());
    	
    	this.setSize(700, 500);
    	setVisible(true);
	}
    
    public class Btn_kunde_aktualisieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test aktualisieren");
		}
    }
    
    public class Btn_neuer_kunde_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Neuer Kunde");
		}
    }
    
    public class Btn_zurück_haupt_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test zurück");
		}
    }
	@Override
	protected void zeigeKundeSuchen() 
	{
		controller.zeigeKundeSuchen();
	}
}