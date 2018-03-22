package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

import Controller.CRessourceAendern;
import Modell.MProdukt;

/**
 * Author Leon & Chris
 */
public class VRessourceAendern extends VRessource {
	private static final long serialVersionUID = 1L;

	private CRessourceAendern controller;
	private JButton btn_SubmitRessoureceAendern;
	private JButton btn_ZurueckTrainingAendern;

	/**
	 * Default constructor
	 */
	public VRessourceAendern(CRessourceAendern pController) {

		controller = pController;
		init();

	}

	/**
	 * Einbindung der super.init von VRessource Erstellen der Button Ressource
	 * Aendern und Zurueck zu Training konfigurieren AcctionListener zu Buttons
	 * hinzufügen Itemlistener zu Comboboxen hinzufügen
	 */

	public void init() {
		super.init();
		super.setTxt_Postion("PlEnTra/Training aendern/Ressource aendern");
		pnl_button.add(btn_SubmitRessoureceAendern = new JButton(
				"Ressource Aendern"));
		pnl_button.add(btn_ZurueckTrainingAendern = new JButton(
				"Zurueck zu Training konfigurieren"));
		btn_SubmitRessoureceAendern.setEnabled(false);

		btn_ZurueckTrainingAendern
				.addActionListener(new Btn_Zurueck_Training_Aendern_ActionListener());
		btn_SubmitRessoureceAendern
				.addActionListener(new Btn_Ressource_Aendern_ActionListener());

		cbx_trainer.addItemListenerAendern(new ItemChangeListener());
		cbx_produktName.addItemListenerAendern(new ItemChangeListener());
		cbx_ort.addItemListenerAendern(new ItemChangeListener());

		setVisible(true);
	}

	/**
	 * 
	 * Nutzt die Methode vieleHinzufuegen aus VLabelComboBox
	 * 
	 * 
	 */
	public void proNamefuellen(String[] pProNamen) {

		cbx_produktName.vieleHinzufuegen(pProNamen);
	}

	public String get_cbx_Trainer() {
		return cbx_trainer.getText();
	}

	public String get_cbx_Ort() {
		return cbx_ort.getText();
	}

	public String get_cbx_Produktname() {
		return cbx_produktName.getText();
	}

	/**
	 * @param comboBoxenInhalt
	 *
	 *            ueberprueft ob alle Comboboxen einen Wert bekommen haben
	 * @return Fehlermeldung: falls es eine gibt!
	 * @author Christian und Leon
	 *
	 **/
	public String comboBoxenInhalt() {
		String selection_cbx_produktName = (String) cbx_produktName
				.getCurrent();
		String selection_cbx_trainer = (String) cbx_trainer.getCurrent();
		String selection_cbx_ort = (String) cbx_ort.getCurrent();

		if (selection_cbx_produktName.equals("")
				|| selection_cbx_trainer.equals("")
				|| selection_cbx_ort.equals("")) {
			String fehler_leeres_feld = "Bitte befuellen Sie alle Felder!";
			return fehler_leeres_feld;
		} else {
			btn_SubmitRessoureceAendern.setEnabled(true);
			String fehler_leeres_feld = "";
			return fehler_leeres_feld;

		}
	}

	/**
	 * Einbindung des ItemListener
	 *
	 */
	class ItemChangeListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent event) {
			if (event.getStateChange() == ItemEvent.SELECTED) {
				Object item = event.getItem();
				comboBoxenInhalt();
			}
		}
	}

	public void fillRessource(MProdukt pProdukt) {

	}

	/**
	 * Actionlistner für beide Button hinzufügen Bezweckt das das man zur
	 * vorherigen View zurueck kommt und das die Comboboxen nen reset kriegen.
	 **/
	public class Btn_Zurueck_Training_Aendern_ActionListener implements
			ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			cbx_ort.comboboxReset();
			cbx_produktName.comboboxReset();
			cbx_trainer.comboboxReset();
			controller.createZurueckTrainingAendern();
		}
	}

	/**
	 * 
	 * Ressource Ändern Button Action Listener Übergabe der Änderungen an
	 * CRessourceAendern
	 *
	 */
	public class Btn_Ressource_Aendern_ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			controller.createSubmitRessoureceAendern();
			controller.trainingFuellen();
			cbx_ort.comboboxReset();
			cbx_produktName.comboboxReset();
			cbx_trainer.comboboxReset();
		}
	}
}
