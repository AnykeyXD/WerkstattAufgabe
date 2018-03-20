package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Controller.CKundeWaehlen;


/**
 * 
 */
public class VKundeWaehlen extends VKunde 
{
	private static final long serialVersionUID = 1L;
	
	//Buttons deklariert und initialisiert
	private JButton btn_KundeWaehlen  = new JButton("   Kunde wählen   ");
    private JButton btn_ZurückTraining=new JButton("   Zurück zu Training konfigurieren  ");
    
	private CKundeWaehlen controller;
    
    
    /**
     * Default constructor
     */
    public VKundeWaehlen(CKundeWaehlen pCKundeWaehlen) {
    	controller = pCKundeWaehlen;
    	this.init();
    }
    public void init()
    {
    	super.init();
    	super.setTxt_Postion("PlEnTra/KundeWaehlen");
    	
    	//Button zum panel hinzugefügt
    	pnl_south.add(btn_KundeWaehlen);
    	pnl_south.add(btn_ZurückTraining );
    	
    	//Actionlistener hinzugefügt
    	btn_KundeWaehlen.addActionListener(new Btn_kunde_waehlen_ActionListener());
    	btn_ZurückTraining.addActionListener(new Btn_zurück_training_ActionListener());
    	this.setSize(700, 500);    	
    	setVisible(true);
    }
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		aktualisiert den Kunden
     * 
     * @author Tim Spürkel
     */
    public class Btn_kunde_waehlen_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			controller.createSubmitKundeWaehlen();
			
		}
    }
    /**
     * ActionListener fuer btn_ressourceWaehlen
     * 		aktualisiert den Kunden
     * 
     * @author Tim Spürkel
     */
    public class Btn_zurück_training_ActionListener implements ActionListener
    {
    	@Override
		public void actionPerformed(ActionEvent e) 
    	{
			setVisible(false);
			controller.createZurueckTraining();
		}
    }
	@Override
	protected void zeigeKundeSuchen() 
	{
		controller.zeigeKundeSuchen();
	}
}