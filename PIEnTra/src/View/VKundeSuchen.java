package View;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import View.VProduktDefinieren.btn_produkt_definieren_ActionListener;
import View.VProduktDefinieren.btn_zurueck_ActionListener;
import Controller.CKundeSuchen;

/**
 * @author toni
 */
public class VKundeSuchen extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;
	private JPanel  pnl_center;
    private VLabelTextfeld ltf_kundenID;
    private VLabelTextfeld ltf_firmenname;
    private JButton btn_suchen;
    private JButton btn_abbrechen;
    
    private CKundeSuchen controller;
    
    
    /**
     * Default constructor
     */
    public VKundeSuchen(CKundeSuchen pCKundeSuchen) {
    	controller = pCKundeSuchen;
    	init();
    }
    
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/Produkt definieren");
    	
    	pnl_center = new JPanel(new FlowLayout());
    	
    	ltf_kundenID = new VLabelTextfeld("   Kunden-ID:  ");
    	ltf_firmenname = new VLabelTextfeld("   Firmenname:  ");
    	
    	// Buttons zum Panel hinzufuegen und gleichzeitig initialisieren
    	pnl_center.add( ltf_kundenID.getPanel() );
    	pnl_center.add( ltf_firmenname.getPanel() );
    	
    	pnl_center.add(btn_suchen = new JButton("  Kunde suchen "));
    	pnl_center.add(btn_abbrechen = new JButton("  Abbrechen  "));
    	
    	//ActionListener zu JButtons hinzufuegen
    	
    	btn_suchen.addActionListener(new btn_produkt_definieren_ActionListener());
    	btn_abbrechen.addActionListener(new btn_zurueck_ActionListener());
    	
    	this.setSize(400, 150);
    	this.add(BorderLayout.CENTER, pnl_center);
    	this.setVisible(true);
    }
    /**
     * ActionListener fuer btn_produkt_definieren
     * 		zeigt VProduktDefinieren
     * 
     * @author toni
     */
    public class btn_produkt_definieren_ActionListener implements ActionListener{
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
			
		}
    	
    }
    
    /**
    * ActionListener fuer btn_zurueck
    * 		verlässt Produktdefinieren Fenster
    * 
    * @author toni
    */
    public class btn_zurueck_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			
		}
    	
    }
    
    
    
}
