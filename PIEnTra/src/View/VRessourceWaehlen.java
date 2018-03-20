package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

import Controller.CRessourceWaehlen;
import Modell.MProdukt;

/**
 * Author Leon & Chris
 */
public class VRessourceWaehlen extends VRessource {
	private static final long serialVersionUID = 1L;

	private CRessourceWaehlen controller;
	private JButton btn_RessourceWaehlen;
	private JButton btn_ZurueckTrainingKonfigurieren;

	public VRessourceWaehlen(CRessourceWaehlen pController) {

		controller = pController;
		init();

	}

	/**
	 * Default constructor
	 */

	public void init() {
		super.init();
		setVisible(true);
		super.setTxt_Postion("PlEnTra/Ressource/RessourceWählen");
		pnl_button.add(btn_RessourceWaehlen = new JButton("Ressource Waehlen"));
		pnl_button.add(btn_ZurueckTrainingKonfigurieren = new JButton(
				"Zurueck zu Training Konfigurieren "));
		btn_RessourceWaehlen.setEnabled(false);
		btn_RessourceWaehlen
				.addActionListener(new Btn_Ressource_Waehlen_ActionListener());
		btn_ZurueckTrainingKonfigurieren
				.addActionListener(new Btn_Zurueck_Training_Konfigurieren_ActionListener());
		cbx_trainer.addItemListener(new ItemChangeListener());
		cbx_produktName.addItemListener(new ItemChangeListener());
		cbx_ort.addItemListener(new ItemChangeListener());
		

	}

	/**
	 * @param Feldueberpruefung
	 *            kontrolliert, dass die Comboboxen in der richtigen Reihenfolge
	 *            befüllt werden.
	 * @author Leon und Christian
	 */

	/**
	 * @param ComboBoxenInhalt
	 *            : ueberprueft ob alle Comboboxen einen Wert bekommen haben
	 * @return Fehlermeldung: falls es eine gibt!
	 * @author Christian und Leon
	 * @return
	 */

	public class Btn_Ressource_Waehlen_ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			controller.createSubmitRessourceWaehlen();
		}
	}

	public class Btn_Zurueck_Training_Konfigurieren_ActionListener implements
			ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			controller.createZurueckTrainingKonfigurieren();
		}
	}

	public void actionPerformed(ActionEvent e) {

	}

	public String produktNameInhalt() {
		String selection = (String) cbx_produktName.getCurrent();
		if (selection.equals("")) {
			String fehlermeldung = "Bitte waehlen sie zuerst die Produktbezeichnung aus.";
			return fehlermeldung;
		} else {
			String fehlermeldung = "";
			return fehlermeldung;
		}
	}

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
			btn_RessourceWaehlen.setEnabled(true);
			String fehler_leeres_feld = "";
			return fehler_leeres_feld;

		}
	}
	
	
	class ItemChangeListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent event) {
			if (event.getStateChange() == ItemEvent.SELECTED) {
				Object item = event.getItem();
				produktNameInhalt();
				comboBoxenInhalt();
			}
		}
	}

	public void fillRessource(MProdukt pProdukt) {

	}
}