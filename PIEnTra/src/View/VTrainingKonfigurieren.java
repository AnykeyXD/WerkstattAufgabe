package View;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import Controller.CTrainingKonfigurieren;

/**
 * 
 * 
 * @author joern
 */
public class VTrainingKonfigurieren extends VTraining 
{
	private static final long serialVersionUID = 1L;
	
    private JButton btn_kundeWaehlen;
    private JButton btn_ressourcenWaehlen;
    private JButton btn_trainingSpeichern;
    private VLabelTextfeld ltf_ansprechpartner;
    private CTrainingKonfigurieren controller;

    
    public VTrainingKonfigurieren(CTrainingKonfigurieren pController) 
    {
    	controller = pController;
    	init();
    }
 
    public void init()
    {	
    	super.init();
    	
    	//Buttons initialisieren
    	btn_kundeWaehlen      = new JButton("Kunde wählen");
    	btn_ressourcenWaehlen = new JButton("Ressourcen wählen");
    	btn_trainingSpeichern = new JButton("Training speichern");
    	
    	//Buttons dem entsprechenden Panel hinzufuegen
    	pnl_buttons.add(btn_kundeWaehlen);
    	pnl_buttons.add(btn_ressourcenWaehlen);
    	pnl_buttons.add(btn_trainingSpeichern);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
    	ltf_kunden_id = new VLabelTextfeld("Kunden-ID");
    	ltf_training = new VLabelTextfeld("Trainings-ID:");
    	ltf_ansprechpartner = new VLabelTextfeld("Ansprechpartner: ");
    	ltf_firmenName = new VLabelTextfeld("Firmenname:");
    	ltf_proBeschreibung = new VLabelTextfeld("Produk: ");
    	ltf_anfangsDatum = new VLabelTextfeld("Startdatum: ");
    	ltf_endDatum = new VLabelTextfeld("Enddatum:");
    	ltf_tage = new VLabelTextfeld("Tage: ");
    	ltf_trainer = new VLabelTextfeld("Trainer: ");
    	ltf_bemerkung = new VLabelTextfeld("Bemerkung:");
    	
    	//LabelTextfelder dem entsprechenden Panel hinzufuegen
    	pnl_ltfs.add(ltf_kunden_id.getPanel());
    	pnl_ltfs.add(ltf_firmenName.getPanel());
    	pnl_ltfs.add(ltf_ansprechpartner.getPanel());
    	pnl_ltfs.add(ltf_proBeschreibung.getPanel());
    	pnl_ltfs.add(ltf_anfangsDatum.getPanel());
    	pnl_ltfs.add(ltf_endDatum.getPanel());
    	pnl_ltfs.add(ltf_tage.getPanel());
    	pnl_ltfs.add(ltf_trainer.getPanel());
    	pnl_ltfs.add(ltf_bemerkung.getPanel());
    	
    	this.setVisible(true);
    }
    
    private long erzeugeTrainingsID() {
        // TODO implement here
        return 0;
    }

}