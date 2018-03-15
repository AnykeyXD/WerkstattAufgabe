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
	
	private JButton btn_KundeWaehlen  = new JButton("   Kunde w�hlen   ");
    private JButton btn_Zur�ckTraining=new JButton("   Zur�ck zu Training konfigurieren  ");
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
    	pnl_south.add(btn_Zur�ckTraining );
    	
    	
    	btn_KundeWaehlen.addActionListener(new btn_KundeWaehlen_ActionListener());
    	btn_Zur�ckTraining.addActionListener(new btn_Zur�ckTraining_ActionListener());
    	this.setSize(700, 500);    	
    	setVisible(true);
    }
    public class btn_KundeWaehlen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test Kunde w�hlen");
		}
    }
    public class btn_Zur�ckTraining_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			System.out.println("Test zur�ck zu Training konfigurieren");
		}
    }
}