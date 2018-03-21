package View;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.CTrainingSuchen;


/**
 * 
 */
@SuppressWarnings("serial")
public class VTrainingSuchen extends JFrame
{
	private JList<String[]> trainingsID;
    private JButton btn_auswaehlen;
    private JButton btn_abbrechen;
    private CTrainingSuchen controller;
    
    
    private JPanel pnl_container_center;
	private JPanel  pnl_North;
	private JPanel  pnl_center;
	private JPanel  pnl_South;
	
	//PLaceholder
		private JPanel placeholderPanel;
		private JPanel placeholderPanel2;
		private JTextField placeholderTextfeld;
		private JTextField placeholderTextfeld2;
		private JPanel placeholderPanel3;
		private JTextField placeholderTextfeld3;
    
    public VTrainingSuchen(CTrainingSuchen pController) 
    {
    	controller = pController;
    	init();
    }
    
    public void init()
	{
    	
    	/**
    	 * TODO: Eigene Liste implementieren, statt Beispiel Liste
    	 */
    	String interessen[] = {"Politik", "Autos", "Mode", 
                "Film- und Fernsehen", "Computer", "Tiere", "Sport"};
    	
    	
    	pnl_container_center= new JPanel(new BorderLayout());
		pnl_center = new JPanel();
		pnl_center.setLayout(new BorderLayout());
		pnl_South  = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnl_North = new JPanel(new BorderLayout());

		// Buttons zum Panel hinzufuegen und gleichzeitig initialisieren
	
		pnl_South.add(btn_auswaehlen = new JButton("  Training suchen "));
		pnl_South.add(btn_abbrechen = new JButton("  Abbrechen  "));
		btn_auswaehlen.setPreferredSize(new Dimension(200,25));
		btn_abbrechen.setPreferredSize(new Dimension(200,25));


		//Placeholder...
		placeholderPanel= new JPanel();
		placeholderPanel.add(placeholderTextfeld= new JTextField());
		placeholderPanel2= new JPanel();
		placeholderPanel2.add(placeholderTextfeld2= new JTextField());
		placeholderPanel3= new JPanel();
		placeholderPanel3.add(placeholderTextfeld3= new JTextField());
		placeholderTextfeld.setVisible(false);
		placeholderTextfeld2.setVisible(false);
		placeholderTextfeld3.setVisible(false);

<<<<<<< HEAD
		pnl_North.add( trainingsID = new JList(getTrainingIDs()), BorderLayout.CENTER );
=======
		pnl_North.add( trainingsID = new JList<String>(interessen), BorderLayout.CENTER );
>>>>>>> branch 'master' of https://github.com/AnykeyXD/WerkstattAufgabe.git
		//pnl_center.add( ltf_firmenname.getPanel(), BorderLayout.CENTER  );
		pnl_center.add(placeholderPanel2, BorderLayout.SOUTH);
		pnl_North.add(placeholderPanel, BorderLayout.SOUTH);	
		pnl_North.add(placeholderPanel3, BorderLayout.NORTH);	
		//ActionListener zu JButtons hinzufuegen

		btn_auswaehlen.addActionListener(new btn_training_auswaehlen_ActionListener());
		btn_abbrechen.addActionListener(new btn_zurueck_ActionListener());


		pnl_container_center.add(BorderLayout.NORTH, pnl_North);
		pnl_container_center.add(BorderLayout.CENTER, pnl_center);
		pnl_container_center.add(BorderLayout.SOUTH, pnl_South);

		this.setSize(450, 450);
		this.add(BorderLayout.CENTER, pnl_container_center);
		this.setVisible(true);
	}
    
    
    public String[] getTrainingIDs(){
    	return controller.trainingIDFuellen();
    	
    	
    	
    }
    	
	public class btn_training_auswaehlen_ActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			controller.crateSubmitTrainingAuswaehlen();
		}

	}
	
	

	/**
	 * ActionListener fuer btn_zurueck
	 * 		verlässt Produktdefinieren Fenster
	 * 
	 * @author toni
	 */
	public class btn_zurueck_ActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			controller.createZurueck();
		}

	}
    
    
    
	}
    
    
    
    
    
    
    
