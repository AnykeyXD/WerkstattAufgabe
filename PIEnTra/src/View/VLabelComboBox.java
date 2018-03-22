package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import View.VRessourceWaehlen.ItemChangeListener;

public class VLabelComboBox 
{
	private static final String CheckProduktName = null;
	private JPanel panel;
	private JLabel label;
	private JComboBox<String> combobox;
	
	/** Konstruktor fuer VComboBox mit GridLayout
	 * @param pText : Text für das Label vor der JComboBox
	 * 
	 * @author Leon
	 * @return 
	 */
	
	public VLabelComboBox(String pText)
	{
		//Panel initialisieren, GridLayout
		panel = new JPanel(new GridLayout (1, 2));
		
		init(pText);	//Komponenten initialisieren und dem Panel adden.
	}
	
	/**
	 * Konstruktor für VComboBox mit FlowLayout und präferierten Größen
	 * 
	 * @param pText   : text für das Label vor der JComboBox
	 * @param pDimLbl : Dimension für die präferierte Größe des Labels
	 * @param pDimCbx : Dimension für die präferierte Größe der ComboBox
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
	 * @param pText  : text für das Label Vor der JComboBox
	 * @author joern in Zusammenarbeit mit Leon
	 */
	private void init(String pText)
	{
		combobox = new JComboBox<String>();
		label = new JLabel (pText);
		
		panel.add(label);
		panel.add(combobox);
		
	}
	
	/**
	 * @return die Beschreibung, welche vor der ComboBox stehen wird. (Text des Labels)
	 */
	public String getComboBoxBeschreibung()
	{
		return label.getText();
	}
	
	/**
	 * 
	 * @param pElement : ist dasElements, welches in die ComboBox hinzugefuegt wird.
	 */
	public void hinzufuegen(String pElement)
	{
		combobox.addItem(pElement);
	}
	
	/**
	 * 
	 * @param pElements : String Array mit den neuen Einträgen
	 */
	public void vieleHinzufuegen(String[] pElements)
	{
		for(String pElement : pElements)
		{
			combobox.addItem(pElement);
		}
	}
	
	/** 
	 * @return Gibt das ausgewählte Element der ComboBox zurueck.
	 */
	public String getCurrent()
	{
		return (String)combobox.getSelectedItem();
	}
	
	/**
	 * Gibt das Panel zurueck, um es z.B. in ein anderes Panel einzufügen
	 * 
	 * @return panel
	 */
	public JPanel getPanel()
	{
		return panel;
	}
	
	/**
	 * Entfernt alle combobox einträge
	 */
	public void leeren()
	{
		combobox.removeAll();
		panel.revalidate();
	}

	public JComboBox<String> getCombobox() {
		return combobox;
	}

	public void addItemListenerAendern(View.VRessourceAendern.ItemChangeListener itemChangeListener) {
		combobox.addItemListener(itemChangeListener);
	}

	public void addItemListenerWaehlen(ItemChangeListener itemChangeListener) {
		combobox.addItemListener(itemChangeListener);
	}
	
	public void setDisabled(){
		combobox.setEnabled(false);
	}
	
	public void setEnabled(){
		combobox.setEnabled(true);
	}
	public String getText() {
		return (String) combobox.getSelectedItem();
	}
	public void comboboxReset(){
		
		combobox.removeAllItems();
	}
	public void comboboxSetIndex()
	{
		combobox.setSelectedIndex(0);
	}
}
		
