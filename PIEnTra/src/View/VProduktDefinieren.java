package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controller.CProduktDefinieren;

/**
 * @author toni
 */
public class VProduktDefinieren extends VKunde 
{
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public VProduktDefinieren() {

	}
	//Panels
	private JPanel pnl_container_center;
	private JPanel  pnl_North;
	private JPanel  pnl_center;
	private JPanel  pnl_South;
	private JPanel placeholderPanel;
	private JPanel placeholderPanel2;
	private JPanel placeholderPanel3;
	private JPanel placeholderPanel4;

	//Labels
	private JLabel lbl_proBezeichnung;
	private JLabel lbl_proBeschreibung; 
	//Buttons
	private JButton btn_proDefinieren;
	private JButton btn_zurueck;
	//Textfields/Area
	private JTextArea txt_proBeschreibung;
	private JTextField txt_proBezeichnung;
	//Textfield Placeholder
	private JTextField placeholderTextfeld;
	private JTextField placeholderTextfeld2;
	private JTextField placeholderTextfeld3;
	private JTextField placeholderTextfeld4;
	//Controllervariable
	public CProduktDefinieren controller;


	public VProduktDefinieren(CProduktDefinieren pCProduktDefinieren) {
		controller = pCProduktDefinieren;
		init();
	}

	public void init()
	{
		super.init();
		super.setTxt_Postion("PlEnTra/Produkt definieren");

		//Hauptpanel mit Borderlayout das in das Center des Superklassen Borderlayout gehört
		pnl_container_center= new JPanel(new BorderLayout());


		//Boxes um Labels und TextArea/Field besser andzuordnen
		Box horizontalBox = Box.createHorizontalBox();
		Box VerticalBox = Box.createVerticalBox();
		VerticalBox.add(lbl_proBeschreibung = new JLabel("Produktbeschreibung:            "));
		horizontalBox.add(txt_proBeschreibung = new JTextArea());

		Box horizontalBox2 = Box.createHorizontalBox();
		Box VerticalBox2 = Box.createVerticalBox();
		VerticalBox2.add(lbl_proBeschreibung = new JLabel("Produktbezeichnung:              "));
		horizontalBox2.add(txt_proBezeichnung = new JTextField());

		//Placeholder...
		placeholderPanel= new JPanel();
		placeholderPanel.add(placeholderTextfeld= new JTextField());
		placeholderPanel2= new JPanel();
		placeholderPanel2.add(placeholderTextfeld2= new JTextField());
		placeholderPanel3= new JPanel();
		placeholderPanel3.add(placeholderTextfeld3= new JTextField());
		placeholderPanel4= new JPanel();
		placeholderPanel4.add(placeholderTextfeld4= new JTextField());
		placeholderTextfeld.setVisible(false);
		placeholderTextfeld2.setVisible(false);
		placeholderTextfeld3.setVisible(false);
		placeholderTextfeld4.setVisible(false);


		pnl_center = new JPanel();
		pnl_center.setLayout(new BorderLayout());
		pnl_South  = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnl_North = new JPanel(new BorderLayout());


		pnl_center.add(placeholderPanel2, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel3, BorderLayout.NORTH);


		pnl_North.add(horizontalBox2, BorderLayout.CENTER);
		pnl_North.add(VerticalBox2, BorderLayout.WEST);
		pnl_center.add(horizontalBox, BorderLayout.CENTER);
		pnl_center.add(VerticalBox, BorderLayout.WEST);


		//Dimensionen 
		txt_proBezeichnung.setPreferredSize(new Dimension(300,20));
		txt_proBezeichnung.setMaximumSize(new Dimension(300,20));

		txt_proBeschreibung.setPreferredSize(new Dimension(300, 500));
		txt_proBeschreibung.setMaximumSize(new Dimension(300, 700));

		//Buttons initialisieren
		pnl_South.add(btn_proDefinieren = new JButton("    Produkt definieren    "));                                             
		pnl_South.add(btn_zurueck = new JButton("  Zurueck zum Hauptmenue  "));

		//ActionListener zu JButtons hinzufuegen

		
		txt_DocumentListener txt_List =new txt_DocumentListener();
		txt_DocumentListener txt_List2 =new txt_DocumentListener();
		btn_proDefinieren.setEnabled(false);
		txt_proBezeichnung.getDocument().addDocumentListener(txt_List);
		txt_proBeschreibung.getDocument().addDocumentListener(txt_List2);
		btn_proDefinieren.addActionListener(new btn_produkt_definieren_ActionListener());
		btn_zurueck.addActionListener(new btn_zurueck_ActionListener());



		// Ins Hauptpanel die Unterpanel einfuegen
		pnl_container_center.add(BorderLayout.NORTH, pnl_North);
		pnl_container_center.add(BorderLayout.CENTER, pnl_center);
		pnl_container_center.add(BorderLayout.SOUTH, pnl_South);
		//pnl_container_center.add(BorderLayout.WEST, placeholderPanel4);

		
			  
		
		
		
		
		this.setSize(500, 600);

		this.add(BorderLayout.CENTER, pnl_container_center);

		this.setVisible(true);
	}

	
	public class txt_DocumentListener implements DocumentListener{
		@Override
			public void changedUpdate(DocumentEvent e) {
			    changed();
			  }
			  public void removeUpdate(DocumentEvent e) {
			    changed();
			  }
			  public void insertUpdate(DocumentEvent e) {
			    changed();
			  }

			  public void changed() {
				    if( txt_proBezeichnung.getText().equals("")  && txt_proBeschreibung.getText().equals("") != true){
				    	
				    	System.out.println(txt_proBezeichnung.getText());
				    	System.out.println(txt_proBeschreibung.getText());
						btn_proDefinieren.setEnabled(true);
					}else if( txt_proBezeichnung.getText().equals("") || txt_proBeschreibung.getText().equals("")){
						btn_proDefinieren.setEnabled(false);
						System.out.println(txt_proBezeichnung.getText());
				    	System.out.println(txt_proBeschreibung.getText());
						
					}

			  }

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
