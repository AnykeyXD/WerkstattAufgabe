package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Erstellt ein Label und ein Textfeld, optional mit pr�ferierter Gr��e
 * vereinfacht die Nutzung von Labels gefolgt von Textfeldern
 * 
 * @author joern
 */
public class VLabelTextfeld {
	private JPanel     panel;
	private JLabel     label;
	private JTextField textfeld;
	
	/**
	 * Konstruktor fuer LabelTextfeld
	 * @param pText : Text des Labels
	 */
	public VLabelTextfeld(String pText)
	{
		panel = new JPanel(new GridLayout(1, 2));
		
		createLtf(pText);
	}
	
	/**
	 * Konstruktor f�r LabelTextfeld mit Parametern f�r die preferierte Gr��e der Elemente
	 * @param pText			:Text des Labels
	 * @param pDimLabel		:bevorrzugte Gr��e vom Label
	 * @param pDimTextfeld  :bevorrzugte Gr��e vom Textfeld
	 */
	public VLabelTextfeld(String pText, Dimension pDimLabel, Dimension pDimTextfeld)
	{
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		createLtf(pText);
		
		//setPreferredSize um die gr��e zu setzten, die vom FlowLayout bevorzugt wird
		label.setPreferredSize(pDimLabel);
		textfeld.setPreferredSize(pDimTextfeld);
	}
	
	/**
	 * Initialisiert das Label und das Textfeld und f�gt es einem Panel hinzu
	 * @param pText
	 */
	private void createLtf(String pText)
	{
		panel.add(label = new JLabel(pText));
		panel.add(textfeld = new JTextField());
	}
	
	/**
	 * @return 	: gibt den Text des Textfelds zur�ck
	 */
	public String getText()
	{
		return textfeld.getText();
	}
	
	/**
	 * @return	: gibt den Text des Labels zur�ck
	 */
	public String getName()
	{
		return label.getText();
	}
	
	/** 
	 * @return	: gibt das Panel zur�ck, um es z.B. in einen anderen Container einzuf�gen
	 */
	public JPanel getPanel()
	{
		return panel;
	}
}
