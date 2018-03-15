package View;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class VComboBox 
{
	private JPanel		panel;
	private JLabel		label;
	private JComboBox	combobox;
	
	/** Konstruktor fuer die Combobox
	 * @author Leon
	 */

	public VComboBox(String pText)
	{
		panel = new JPanel(new GridLayout (1, 2));
		label = new JLabel (pText);
		panel.add(label);
		combobox = new JComboBox<String>();
		panel.add(combobox);
	}
	/**
	 * 
	 * @return die Beschreibung, welche vor der ComboBox stehen wird.
	 */
	public String getComboBoxBeschreibung()
	{
		return label.getText();
	}
	/**
	 * 
	 * @param pElement ist der Inhalt des Elements, welches in die ComboBox eingebunden wird.
	 */
	public void hinzufuegen(String pElement)
	{
		combobox.addItem(pElement);
	}
	/**
	 * 
	 * @return Gibt den Wert des ausgewählten Elements in der ComboBox zurueck.
	 */
	public String getCurrent()
	{
		return (String)combobox.getSelectedItem();
	}
	public JPanel getPanel()
	{
		return panel;
	}
}
