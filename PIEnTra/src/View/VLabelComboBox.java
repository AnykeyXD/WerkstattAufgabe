package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VLabelComboBox 
{
	private JPanel panel;
	private JLabel label;
	private JComboBox<String> combobox;
	
	/** Konstruktor fuer VComboBox mit GridLayout
	 * @param pText : Text f�r das Label vor der JComboBox
	 * 
	 * @author Leon
	 */
	
	
	  String produkte[]={};
	  String trainer[]={};
	  String ort[]={};
	  
	public VLabelComboBox(String pText)
	{
		//Panel initialisieren, GridLayout
		panel = new JPanel(new GridLayout (1, 2));
		
		init(pText);	//Komponenten initialisieren und dem Panel adden
	}
	
	/**
	 * Konstruktor f�r VComboBox mit FlowLayout und pr�ferierten Gr��en
	 * 
	 * @param pText   : text f�r das Label vor der JComboBox
	 * @param pDimLbl : Dimension f�r die pr�ferierte Gr��e des Labels
	 * @param pDimCbx : Dimension f�r die pr�ferierte Gr��e der ComboBox
	 * @author joern in Zusammenarbeit mit Leon
	 */
	public VLabelComboBox(String pText, Dimension pDimLbl, Dimension pDimCbx)
	{
		//Panel initialisieren, FlowLayout
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		init(pText);	//Komponenten initialisieren und dem Panel adden
		
		//bevorzugte groessen setzten
		label.setPreferredSize(pDimLbl);
		combobox.setPreferredSize(pDimCbx);
	}
	
	/**
	 * @param pText  : text f�r das Label Vor der JComboBox
	 * @author joern in Zusammenarbeit mit Leon
	 */
	private void init(String pText)
	{
		label = new JLabel (pText);
		combobox = new JComboBox<String>();
		panel.add(combobox);
		panel.add(label);
	}
	
	/**
	 * 
	 * @return die Beschreibung, welche vor der ComboBox stehen wird. (Text des Labels)
	 */
	public String getComboBoxBeschreibung()
	{
		return label.getText();
	}
	
	/**
	 * 
	 * @param pElement : ist der Inhalt des Elements, welches in die ComboBox hinzugefuegt
	 * 					 wird.
	 */
	public void hinzufuegen(String pElement)
	{
		combobox.addItem(pElement);
	}
	
	/** 
	 * @return Gibt das ausgew�hlten Element der ComboBox zurueck.
	 */
	public String getCurrent()
	{
		return (String)combobox.getSelectedItem();
	}
	
	/**
	 * Gibt das Panel zurueck, um es z.B. in ein anderes Panel einzuf�gen
	 * @return panel
	 */
	public JPanel getPanel()
	{
		return panel;
	}
	public void arrayTest()
	{
		
	}
	