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
@SuppressWarnings("serial")
public class VHauptMenu extends VGrundFenster 
{
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
    
    /**
     * Komponenten initialisieren
     */
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
    	
    	//Größe für die Buttons
    	Dimension dim_btn_size = new Dimension(150,24);
    	
    	//Buttons initialiseren
    	btn_training_konfigurieren.setPreferredSize(dim_btn_size);
    	btn_training_aendern.setPreferredSize(dim_btn_size);
    	btn_training_loeschen.setPreferredSize(dim_btn_size);
    	btn_produkt_definieren.setPreferredSize(dim_btn_size);
    	btn_kunde_verwalten.setPreferredSize(dim_btn_size);
    	btn_verlassen.setPreferredSize(dim_btn_size);
    	
    	
    	//ActionListener zu JButtons hinzufuegen
    	btn_training_konfigurieren.addActionListener(new Btn_training_konfigurieren_ActionListener());
    	btn_training_aendern.addActionListener(new Btn_training_aendern_ActionListener());
    	btn_training_loeschen.addActionListener(new Btn_training_loeschen_ActionListener());
    	btn_produkt_definieren.addActionListener(new Btn_produkt_definieren_ActionListener());
    	btn_kunde_verwalten.addActionListener(new Btn_kunde_verwalten_ActionListener());
    	btn_verlassen.addActionListener(new Btn_verlassen_ActionListener());
    	
    	this.setSize(700, 350);
    	this.add(BorderLayout.CENTER, pnl_center);
    	this.setVisible(true);
    }
    
    /**
     * ActionListener fuer btn_training_konfigurieren
     * 		zeigt VTrainingKonfigurieren
     */
    public class Btn_training_konfigurieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
    		setVisible(false);
			controller.createTrainigkonfigurieren();
		}
    	
    }
    
    /**
     * ActionListener fuer btn_training_aendern
     * 		zeigt VTrainingAendern
     * 
     * @author joern
     */
    public class Btn_training_aendern_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
    		setVisible(false);
			controller.createTrainigaendern();
		}
    	
    }
    
    /**
     * ActionListener fuer btn_training_loeschen
     * 		zeigt VTrainingLoeschen
     * 
     * @author joern
     */
    public class Btn_training_loeschen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
    		setVisible(false);
			controller.createTrainigLoeschen();
		}
    	
    }
    
    /**
     * ActionListener fuer btn_produkt_definieren
     * 		zeigt VProduktDefinieren
     * 
     * @author joern
     */
    public class Btn_produkt_definieren_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
    		setVisible(false);
			controller.createProduktDefinieren();
		}
    	
    }
    
    /**
     * ActionListener fuer btn_kunde_verwalten
     * 		zeigt VKundeVerwalten
     * 
     * @author joern
     */
    public class Btn_kunde_verwalten_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			setVisible(false);
    		controller.createKundeVerwalten();
		}
    	
    }
    
    /**
     * ActionListener fuer btn_verlassen
     * 		verlaesst die Anwendung
     * 
     * @author joern
     */
    public class Btn_verlassen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.exit(0); 	//Programm mit Return-code 0 beenden
		}
    	
    }
}