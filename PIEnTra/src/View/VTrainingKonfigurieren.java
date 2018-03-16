package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.CTrainingKonfigurieren;
import View.VTrainingAendern.Btn_zuruck_zum_hauptmenue_ActionListener;

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
    private JButton btn_trainingSpeichern ;
    private VLabelTextfeld ltf_ansprechpartner 
    		= new VLabelTextfeld("Ansprechenpartner", dim_label, dim_textStandart);
    private CTrainingKonfigurieren controller;

    
    public VTrainingKonfigurieren(CTrainingKonfigurieren pController) 
    {
    	controller = pController;
    	init();
    }
 
    public void init()
    {	
    	super.init();
    	super.setTxt_Postion("PlEnTra/TrainingKonfigurieren");
    	
    	//Buttons initialisieren
    	btn_kundeWaehlen      = new JButton("Kunde wählen");
    	btn_ressourcenWaehlen = new JButton("Ressourcen wählen");
    	btn_trainingSpeichern = new JButton("Training speichern");
    	
    	//LabelTextfelder dem entsprechenden Panel in der richtigen Reihenfolge hinzufuegen
    	pnl_ltfs.add(ltf_kunden_id.getPanel());
    	pnl_ltfs.add(ltf_firmenName.getPanel());
    	pnl_ltfs.add(ltf_proBeschreibung.getPanel());
    	pnl_ltfs.add(ltf_anfangsDatum.getPanel());
    	pnl_ltfs.add(ltf_endDatum.getPanel());
    	pnl_ltfs.add(ltf_tage.getPanel());
    	pnl_ltfs.add(ltf_trainer.getPanel());
    	pnl_ltfs.add(ltf_bemerkung.getPanel());
    	
    	//Buttons dem entsprechenden Panel in der richtigen Reihenfolge hinzufuegen
    	pnl_buttons.add(btn_kundeWaehlen);
    	pnl_buttons.add(btn_ressourcenWaehlen);
    	pnl_buttons.add(btn_trainingSpeichern);
    	pnl_buttons.add(btn_zurueckZumHauptmenu);
    	
    	//ActionListener setzten
    	btn_kundeWaehlen.addActionListener(new Btn_kunde_Waehlen_ActionListener());
    	btn_ressourcenWaehlen.addActionListener(new Btn_ressource_Waehlen_ActionListener());
    	btn_trainingSpeichern.addActionListener(new Btn_training_Speichern_ActionListener());
    	
    	this.setSize(700, 500);
    	this.setVisible(true);
    }
    
    private long erzeugeTrainingsID() {
        // TODO implement here
        return 0;
    }
    
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		Zeigt VRessourceWaehlen
     * 
     * @author joern
     */
    public class Btn_ressource_Waehlen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createRessourceWaehlen();
		}
    }
    
    /**
     * ActionListener fuer btn_kundeWaehlen
     * 		Zeigt VKundeWaehlen
     * 
     * @author joern
     */
    public class Btn_kunde_Waehlen_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			controller.createKundeWaehlen();
		}
    }
    
    /**
     * ActionListener fuer btn_trainingSpeichern
     * 		Speichert das Training
     * 		Zeigt VHauptmenu
     * 
     * @author joern
     */
    public class Btn_training_Speichern_ActionListener implements ActionListener
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
		}
    }
}