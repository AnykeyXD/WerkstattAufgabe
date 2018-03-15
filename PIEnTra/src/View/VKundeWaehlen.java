package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CKundeWaehlen;
import View.VKunde.btn_KundeSuchen_ActionListener;
import View.VKundeVerwalten.btn_KundeAktualisieren_ActionListener;

/**
 * 
 */
public class VKundeWaehlen extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
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
    	
    	pnl_south.add(btn_KundeWaehlen);
    	pnl_south.add(btn_ZurückTraining );
    	
    	
    	btn_KundeWaehlen.addActionListener(new btn_KundeWaehlen_ActionListener());
    	btn_ZurückTraining.addActionListener(new btn_ZurückTraining_ActionListener());
    	this.setSize(700, 500);    	
    	setVisible(true);
    }
    public class btn_KundeWaehlen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Kunde wählen");
		}
    }
    public class btn_ZurückTraining_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test zurück zu Training konfigurieren");
		}
    }
}