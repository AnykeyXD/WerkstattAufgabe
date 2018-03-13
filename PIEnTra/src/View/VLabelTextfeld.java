package View;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		panel.add(label = new JLabel(pText));
		panel.add(textfeld = new JTextField());
	}
	public String getText()
	{
		return textfeld.getText();
	}
	public String getName()
	{
		return label.getText();
	}
	public JPanel getPanel()
	{
		return panel;
	}
}
