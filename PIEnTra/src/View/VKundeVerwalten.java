package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CKundeVerwalten;
import View.VKunde.btn_KundeSuchen_ActionListener;

/**
 * 
 */
public class VKundeVerwalten extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
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
    	//pnl_center.add(btn_NeuerKunde);
    	pnl_south.add(btn_KundeAktualisieren);
    	pnl_south.add(btn_NeuerKunde);
    	pnl_south.add(btn_Zur�ckHaupt);
    	
    	
    	btn_KundeAktualisieren.addActionListener(new btn_KundeAktualisieren_ActionListener());
    	btn_NeuerKunde.addActionListener(new btn_NeuerKunde_ActionListener());
    	btn_Zur�ckHaupt.addActionListener(new btn_Zur�ckHaupt_ActionListener());
    	
    	this.setSize(700, 500);
    	setVisible(true);
	}
    public class btn_KundeAktualisieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test aktualisieren");
		}
    }
    public class btn_NeuerKunde_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Neuer Kunde");
		}
    }
    public class btn_Zur�ckHaupt_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test zur�ck");
		}
    }

}