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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controller.CProduktDefinieren;
import Modell.MProdukt;

/**
 * @author toni
 */
public class VProduktDefinieren extends VGrundFenster 
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
	private JPanel  pnl_North_North;
	private JPanel placeholderPanel;
	private JPanel placeholderPanel2;
	private JPanel placeholderPanel3;
	private JPanel placeholderPanel4;

	//Labels
	private JLabel lbl_proBezeichnung;
	private JLabel lbl_proBeschreibung; 
	private JLabel lbl_proID;
	//Buttons
	private JButton btn_proDefinieren;
	private JButton btn_zurueck;
	//Textfields/Area
	private JTextArea txt_proBeschreibung;
	private JTextField txt_proBezeichnung;
	private JTextField txt_proID;
	//Textfield Placeholder
	private JTextField placeholderTextfeld;
	private JTextField placeholderTextfeld2;
	private JTextField placeholderTextfeld3;
	private JTextField placeholderTextfeld4;
	//Controllervariable
	public CProduktDefinieren controller;
	public MProdukt mprodukt;


	public VProduktDefinieren(CProduktDefinieren pCProduktDefinieren) {
		controller = pCProduktDefinieren;
		init();
	}

	public void init()	{
		super.init();
		super.setTxt_Postion("PlEnTra/Produkt definieren");

		//Hauptpanel mit Borderlayout das in das Center des Superklassen Borderlayout gehört
		pnl_container_center= new JPanel(new BorderLayout());


		//Boxes um Labels und TextArea/Field besser andzuordnen
		Box horizontalBox = Box.createHorizontalBox();
		Box VerticalBox = Box.createVerticalBox();
		VerticalBox.add(lbl_proBeschreibung = new JLabel("Produktbeschreibung:            "));
		txt_proBeschreibung = new JTextArea();

		//Zum Scrollen des Textareas
		txt_proBeschreibung.setLineWrap(true);
		txt_proBeschreibung.setWrapStyleWord(true);
		JScrollPane jpane = new JScrollPane(txt_proBeschreibung);
		horizontalBox.add(jpane);



		Box horizontalBox2 = Box.createHorizontalBox();
		Box VerticalBox2 = Box.createVerticalBox();
		VerticalBox2.add(lbl_proBeschreibung = new JLabel("Produktbezeichnung:             "));
		horizontalBox2.add(txt_proBezeichnung = new JTextField());
		
		//Neues Textfeld und Label nach Absprache mit Kunde
		Box horizontalBox3 = Box.createHorizontalBox();
		Box VerticalBox3 = Box.createVerticalBox();
		VerticalBox3.add(lbl_proID = new JLabel("ID                             :             "));
		horizontalBox3.add(txt_proID = new JTextField());

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
		pnl_North_North = new JPanel(new BorderLayout());

		pnl_center.add(placeholderPanel2, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel3, BorderLayout.NORTH);

		pnl_North_North.add(horizontalBox3, BorderLayout.CENTER);
		pnl_North_North.add(VerticalBox3, BorderLayout.WEST);
		pnl_North.add(horizontalBox2, BorderLayout.CENTER);
		pnl_North.add(VerticalBox2, BorderLayout.WEST);
		pnl_center.add(horizontalBox, BorderLayout.CENTER);
		pnl_center.add(VerticalBox, BorderLayout.WEST);


		//Dimensionen 
		txt_proBezeichnung.setPreferredSize(new Dimension(300,20));
		txt_proBezeichnung.setMaximumSize(new Dimension(300,20));

		txt_proID.setPreferredSize(new Dimension(300,20));
		txt_proID.setMaximumSize(new Dimension(300,20));
		
		
		txt_proBeschreibung.setPreferredSize(new Dimension(300, 500));
		txt_proBeschreibung.setMaximumSize(new Dimension(300, 700));
		jpane.setPreferredSize(new Dimension(300, 500));
		jpane.setMaximumSize(new Dimension(300, 700));

		//Buttons initialisieren
		pnl_South.add(btn_proDefinieren = new JButton("    Produkt definieren    "));                                             
		pnl_South.add(btn_zurueck = new JButton("  Zurueck zum Hauptmenue  "));

		//ActionListener zu JButtons hinzufuegen


		//txt_DocumentListener txt_List =new txt_DocumentListener();
		//txt_DocumentListener txt_List2 =new txt_DocumentListener();
		btn_proDefinieren.setEnabled(false);
		txt_proID.getDocument().addDocumentListener(new txt_DocumentListener());
		txt_proBezeichnung.getDocument().addDocumentListener(new txt_DocumentListener());
		txt_proBeschreibung.getDocument().addDocumentListener(new txt_DocumentListener());
		btn_proDefinieren.addActionListener(new Btn_produkt_definieren_ActionListener());
		btn_zurueck.addActionListener(new Btn_zurueck_ActionListener());



		// Ins Hauptpanel die Unterpanel einfuegen
		pnl_container_center.add(BorderLayout.NORTH, pnl_North);
		pnl_container_center.add(BorderLayout.CENTER, pnl_center);
		pnl_container_center.add(BorderLayout.SOUTH, pnl_South);
		//pnl_container_center.add(BorderLayout.WEST, placeholderPanel4);


		this.setSize(500, 600);

		this.add(BorderLayout.CENTER, pnl_container_center);
		this.add(BorderLayout.NORTH, pnl_North_North);

		this.setVisible(true);
	}
	
	
	//Get Inhalt der Textfelder

	public String get_txt_proBezeichnung(){
		return txt_proBezeichnung.getText();
	}
	public String get_txt_proBeschreibung(){
		return txt_proBeschreibung.getText();
	}
	
	public String get_txt_proID(){
		//Integer.parseInt
		return txt_proID.getText();
	}
	
	/**
	 * DocumentListener fuer btn_produktdef und die TextFields/Areas
	 * Bei jeglicher Änderung der Inhalte der TextFields/Areas wird überprüft ob sie leer sind
	 * Falls mindestens einer leer ist, ist der Button fürs Produktdefinieren ausgegraut,
	 * falls beide befüllt sind wird er anklickbar
	 * 
	 * @author toni
	 */
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
			if(txt_proBezeichnung.getText().equals("") == false 
					&& txt_proBeschreibung.getText().equals("") == false
					&& txt_proID.getText().equals("") == false){
				btn_proDefinieren.setEnabled(true);
			}else if(txt_proBezeichnung.getText().equals("") 
					|| txt_proBeschreibung.getText().equals("")
					||txt_proID.getText().equals("")){
				btn_proDefinieren.setEnabled(false);
			}

		}

	}


	/**
	 * ActionListener fuer btn_produkt_definieren
	 * zeigt VProduktDefinieren
	 * 
	 * @author toni
	 */
	public class Btn_produkt_definieren_ActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			controller.writeProduktDefiniert();
			setVisible(false);
			controller.createZurueckHaupt();
			
		}

	}

	/**
	 * ActionListener fuer btn_zurueck
	 * 		verlässt Produktdefinieren Fenster
	 * 
	 * @author toni
	 */
	public class Btn_zurueck_ActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			controller.createZurueckHaupt();

		}

	}




}
