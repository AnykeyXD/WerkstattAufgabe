package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Erstellt ein Label und ein Textfeld, optional mit präferierter Größe
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
	 * Konstruktor für LabelTextfeld mit Parametern für die preferierte Größe der Elemente
	 * @param pText			:Text des Labels
	 * @param pDimLabel		:bevorrzugte Größe vom Label
	 * @param pDimTextfeld  :bevorrzugte Größe vom Textfeld
	 */
	public VLabelTextfeld(String pText, Dimension pDimLabel, Dimension pDimTextfeld)
	{
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		createLtf(pText);
		
		//setPreferredSize um die größe zu setzten, die vom FlowLayout bevorzugt wird
		label.setPreferredSize(pDimLabel);
		textfeld.setPreferredSize(pDimTextfeld);
	}
	
	/**
	 * Initialisiert das Label und das Textfeld und fügt es einem Panel hinzu
	 * @param pText
	 */
	private void createLtf(String pText)
	{
		panel.add(label = new JLabel(pText));
		panel.add(textfeld = new JTextField());
	}
	
	/**
	 * @return 	: gibt den Text des Textfelds zurück
	 */
	public String getText()
	{
		return textfeld.getText();
	}
	
	/**
	 * @return	: gibt den Text des Labels zurück
	 */
	public String getName()
	{
		return label.getText();
	}
	
	/** 
	 * @return	: gibt das Panel zurück, um es z.B. in einen anderen Container einzufügen
	 */
	public JPanel getPanel()
	{
		return panel;
	}
	
	/**
	 * Setzt den Text des Textfelds auf den Wert des Parameters 
	 * 
	 * @param pText: Text fuer das Textfeld
	 */
	public void setText(String pText)
	{
		textfeld.setText(pText);
	}
	
	/**
	 * Ruft setEditable(bool) fuer das Textfeld auf
	 * 
	 * @param pState: Boolischer Wert, der angeibt, ob das Textfeld Editierbar sein soll
	 */
	public void setEditable(boolean pState)
	{
		textfeld.setEditable(pState);
	}
}