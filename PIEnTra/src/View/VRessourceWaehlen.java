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
		/**
		 * Author Leon & Chris Die Buttons Ressource Wählen und Zurück zu
		 * Training konfigurieren werden dem Panel aus der VRessource Klasse
		 * hinzugefügt.
		 */
		super.setTxt_Postion("PlEnTra/Ressource/RessourceWählen");
		pnl_button.add(btn_RessourceWaehlen = new JButton("Ressource Waehlen"));
		pnl_button.add(btn_ZurueckTrainingKonfigurieren = new JButton(
				"Zurueck zu Training Konfigurieren "));

		/**
		 * Der Button Ressource Wählen wird standardmäßig Disabled, solange
		 * keine Werte in der ComboBox vorhanden sind.
		 */
		btn_RessourceWaehlen.setEnabled(false);

		btn_RessourceWaehlen
				.addActionListener(new Btn_Ressource_Waehlen_ActionListener());

		btn_ZurueckTrainingKonfigurieren
				.addActionListener(new Btn_Zurueck_Training_Konfigurieren_ActionListener());

		/**
		 * Aufruf des ItemListeners des Objektes
		 */
		cbx_trainer.addItemListenerWaehlen(new ItemChangeListener());
		cbx_produktName.addItemListenerWaehlen(new ItemChangeListener());
		cbx_ort.addItemListenerWaehlen(new ItemChangeListener());

		cbx_trainer.addItemListenerWaehlen(new ItemChangeListener());
		cbx_produktName.addItemListenerWaehlen(new ItemChangeListener());
		cbx_ort.addItemListenerWaehlen(new ItemChangeListener());

		setVisible(true);
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

	/**
	 * 
	 * @author Leon und Christian
	 * @param Methodenaufruf
	 *            bei Betätigung des Buttons Ressourcen Wählen
	 *
	 */
	public class Btn_Ressource_Waehlen_ActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			cbx_trainer.comboboxSetIndex();
			cbx_ort.comboboxSetIndex();
			cbx_produktName.comboboxSetIndex();
			cbx_produktName.comboboxReset();
			setVisible(false);
			controller.createSubmitRessourceWaehlen();
		}
	}

	/**
	 * 
	 * @author Leon und Christian
	 * @param Methodenaufruf
	 *            bei Betätigung des Buttons Zurück zu Training Konfigurieren
	 */
	public class Btn_Zurueck_Training_Konfigurieren_ActionListener implements
			ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			cbx_trainer.comboboxSetIndex();
			cbx_ort.comboboxSetIndex();
			cbx_produktName.comboboxSetIndex();
			cbx_produktName.comboboxReset();
			controller.createZurueckTrainingKonfigurieren();
		}
	}

	/**
	 * @author Leon
	 * @param Das
	 *            "Sperren der beiden ComboBoxen
	 */
	public void comboboxDisable() {
		cbx_trainer.setDisabled();
		cbx_ort.setDisabled();
	}

	/**
	 * @author Leon
	 * @param überprüft
	 *            ob die ComboBox cbx_produktName einen Wert hat, sollte dies
	 *            der Fall sein werden die ComboBoxen cbx_trainer und cbx_ort
	 *            aktiviert
	 */
	public void produktNameInhalt() {
		String selection = (String) cbx_produktName.getCurrent();
		if (!selection.equals("")) {
			cbx_trainer.setEnabled();
			cbx_ort.setEnabled();
		}
	}

	/**
	 * @author Leon
	 * @param überprüft
	 *            , ob alle ComboBoxen einen Wert haben, sollte dies der Fall
	 *            sein wird der Button "Ressource Wählen" aktiviert.
	 */

	public void comboBoxenInhalt() {
		String selection_cbx_produktName = (String) cbx_produktName
				.getCurrent();
		String selection_cbx_trainer = (String) cbx_trainer.getCurrent();
		String selection_cbx_ort = (String) cbx_ort.getCurrent();
		if (!selection_cbx_produktName.equals("")
				&& !selection_cbx_trainer.equals("")
				&& !selection_cbx_ort.equals("")) {

			btn_RessourceWaehlen.setEnabled(true);
		}
	}

	/**
	 * @author Leon und Joern
	 * @param pProNamen
	 *            : enthält die Produkte aus der cDBAccess Es werden der
	 *            Combobox cbx_produktName die werte des pPronamen hinzugefügt
	 */
	public void proNamefuellen(String[] pProNamen) {

		cbx_produktName.vieleHinzufuegen(pProNamen);
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
}
