package View;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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

	private CKundeSuchen controller_suchen;
	


	/**
	 * Default constructor
	 */
	public VKundeSuchen(CKundeSuchen pCKundeSuchen) {
		controller_suchen = pCKundeSuchen;
	
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

		btn_suchen.addActionListener(new Btn_Suchen_ActionListener());
		btn_abbrechen.addActionListener(new Btn_Zurueck_ActionListener());

		this.setSize(400, 150);
		this.add(BorderLayout.CENTER, pnl_center);
		this.setVisible(true);
	}


	public int get_txt_KundenID(){
		return Integer.parseInt(ltf_kundenID.getText());
	}

	public String get_txt_Firmenname(){
		return ltf_firmenname.getText();
	}

	/**
	 * ActionListener fuer btn_kunde suchen
	 * 		zeigt VProduktDefinieren
	 * 
	 * @author toni
	 */
	public class Btn_Suchen_ActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			if(controller_suchen.kundenIDSuchen()){
	    		
	    		controller_suchen.kundeFuellen();
	    		setVisible(false);
				controller_suchen.createSubmitSuche();
	    	}else{
	    		JOptionPane.showMessageDialog(null, " Fehler! Der Kunde existiert nicht! ");
	    	}
	    	
			//controller.btn_training_suchen(get_txt_KundenID()));
			//controller.kundenIDSuchen()
		}

	}

	/**
	 * ActionListener fuer btn_zurueck
	 * 		verlässt Produktdefinieren Fenster
	 * 
	 * @author toni
	 */
	public class Btn_Zurueck_ActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller_suchen.createZurueckKundeWaehlen();
		}

	}



}
