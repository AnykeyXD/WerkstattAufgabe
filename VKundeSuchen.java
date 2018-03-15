package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.CKundeSuchen;

/**
 * @author toni
 */
public class VKundeSuchen extends VGrundFenster 
{
	private static final long serialVersionUID = 1L;

	private VLabelTextfeld ltf_kundenID;
	private VLabelTextfeld ltf_firmenname;
	private JButton btn_suchen;
	private JButton btn_abbrechen;

	private CKundeSuchen controller;
	//Panels
	private JPanel pnl_container_center;
	private JPanel  pnl_North;
	private JPanel  pnl_center;
	private JPanel  pnl_South;

	//PLaceholder
	private JPanel placeholderPanel;
	private JPanel placeholderPanel2;
	private JTextField placeholderTextfeld;
	private JTextField placeholderTextfeld2;
	private JPanel placeholderPanel3;
	private JTextField placeholderTextfeld3;

	/**
	 * Default constructor
	 */
	public VKundeSuchen(CKundeSuchen pCKundeSuchen) {
		controller = pCKundeSuchen;
		init();
	}

	public void init()
	{
		//super.init();
		//super.setTxt_Postion("PlEnTra/Produkt definieren");

		pnl_container_center= new JPanel(new BorderLayout());
		pnl_center = new JPanel();
		pnl_center.setLayout(new BorderLayout());
		pnl_South  = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnl_North = new JPanel(new BorderLayout());



		ltf_kundenID = new VLabelTextfeld("   Kunden-ID:  ",new Dimension(100,20) , new Dimension(150,20));
		ltf_firmenname = new VLabelTextfeld("   Firmenname:  ",new Dimension(100,20) , new Dimension(300,20));

		// Buttons zum Panel hinzufuegen und gleichzeitig initialisieren
		

		pnl_South.add(btn_suchen = new JButton("  Kunde suchen "));
		pnl_South.add(btn_abbrechen = new JButton("  Abbrechen  "));
		btn_suchen.setPreferredSize(new Dimension(200,25));
		btn_abbrechen.setPreferredSize(new Dimension(200,25));
		//ltf_kundenID.getPanel().setPreferredSize(new Dimension(300,20));
		//ltf_firmenname.getPanel().getTsetMaximumSize(new Dimension(300,20));

		//Placeholder...
		placeholderPanel= new JPanel();
		placeholderPanel.add(placeholderTextfeld= new JTextField());
		placeholderPanel2= new JPanel();
		placeholderPanel2.add(placeholderTextfeld2= new JTextField());
		placeholderPanel3= new JPanel();
		placeholderPanel3.add(placeholderTextfeld3= new JTextField());
		placeholderTextfeld.setVisible(false);
		placeholderTextfeld2.setVisible(false);
		placeholderTextfeld3.setVisible(false);

		pnl_North.add( ltf_kundenID.getPanel(), BorderLayout.CENTER );
		pnl_center.add( ltf_firmenname.getPanel(), BorderLayout.CENTER  );
		pnl_center.add(placeholderPanel2, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel, BorderLayout.SOUTH);	
		pnl_North.add(placeholderPanel3, BorderLayout.NORTH);	
		//ActionListener zu JButtons hinzufuegen

		btn_suchen.addActionListener(new btn_produkt_definieren_ActionListener());
		btn_abbrechen.addActionListener(new btn_zurueck_ActionListener());


		pnl_container_center.add(BorderLayout.NORTH, pnl_North);
		pnl_container_center.add(BorderLayout.CENTER, pnl_center);
		pnl_container_center.add(BorderLayout.SOUTH, pnl_South);

		this.setSize(450, 175);
		this.add(BorderLayout.CENTER, pnl_container_center);
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
