package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controller.CHauptMenu;

/**
 * 
 */
public class VHauptMenu extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	
	private JButton btn_training_konfigurieren;
    private JButton btn_training_aendern;
    private JButton btn_training_loeschen;
    private JButton btn_produkt_definieren;
    private JButton btn_kunde_verwalten;
    private JButton btn_verlassen;
    private JPanel  pnl_center;
    private CHauptMenu controller;

    public VHauptMenu(CHauptMenu pCHauptMenu) 
    {
    	controller = pCHauptMenu;
    	init();
    }
    
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/Hauptmenue");
    	
    	pnl_center = new JPanel(new FlowLayout());
    	
    	// Buttons zum Panel hinzufuegen und gleichzeitig inizialisieren
    	pnl_center.add(btn_training_konfigurieren = new JButton("Training konfigurieren"));
    	pnl_center.add(btn_training_aendern = new JButton("Training Aendern"));
    	pnl_center.add(btn_training_loeschen = new JButton("Training loeschen"));
    	pnl_center.add(btn_produkt_definieren = new JButton("Produkt definieren"));
    	pnl_center.add(btn_kunde_verwalten = new JButton("Kunde verwalten"));
    	pnl_center.add(btn_verlassen = new JButton("PlEnTra verlassen"));
    	
    	Dimension dim_btn_size = new Dimension(150,24);
    	
    	btn_training_konfigurieren.setPreferredSize(dim_btn_size);
    	btn_training_aendern.setPreferredSize(dim_btn_size);
    	btn_training_loeschen.setPreferredSize(dim_btn_size);
    	btn_produkt_definieren.setPreferredSize(dim_btn_size);
    	btn_kunde_verwalten.setPreferredSize(dim_btn_size);
    	btn_verlassen.setPreferredSize(dim_btn_size);
    	
    	
    	//ActionListener zu JButtons hinzufuegen
    	btn_training_konfigurieren.addActionListener(new btn_training_konfigurieren_ActionListener());
    	btn_training_aendern.addActionListener(new btn_training_aendern_ActionListener());
    	btn_training_loeschen.addActionListener(new btn_training_loeschen_ActionListener());
    	btn_produkt_definieren.addActionListener(new btn_produkt_definieren_ActionListener());
    	btn_kunde_verwalten.addActionListener(new btn_kunde_verwalten_ActionListener());
    	btn_verlassen.addActionListener(new btn_verlassen_ActionListener());
    	
    	this.setSize(700, 350);
    	this.add(BorderLayout.CENTER, pnl_center);
    	this.setVisible(true);
    }
    
    /**
     * ActionListener fuer btn_training_konfigurieren
     * 		zeigt VTrainingKonfigurieren
b
     */
    public class btn_training_konfigurieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    /**
     * ActionListener fuer btn_training_aendern
     * 		zeigt VTrainingAendern
     * 
     * @author joern
     */
    public class btn_training_aendern_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    /**
     * ActionListener fuer btn_training_loeschen
     * 		zeigt VTrainingLoeschen
     * 
     * @author joern
     */
    public class btn_training_loeschen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    /**
     * ActionListener fuer btn_produkt_definieren
     * 		zeigt VProduktDefinieren
     * 
     * @author joern
     */
    public class btn_produkt_definieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    /**
     * ActionListener fuer btn_kunde_verwalten
     * 		zeigt VKundeVerwalten
     * 
     * @author joern
     */
    public class btn_kunde_verwalten_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    /**
     * ActionListener fuer btn_verlassen
     * 		verlaesst die Anwendung
     * 
     * @author joern
     */
    public class btn_verlassen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.exit(0); 	//Programm mit Return-code 0 beenden
		}
    	
    }
}