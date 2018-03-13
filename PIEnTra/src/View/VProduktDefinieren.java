package View;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controller.CProduktDefinieren;

/**
 * 
 */
public class VProduktDefinieren extends VKunde {

    /**
     * Default constructor
     */
    public VProduktDefinieren() {
    }

    /**
     * 
     */
    private VLabelTextfeld ltf_proBezeichnung;

    /**
     * 
     */
    private JLabel lbl_proBeschreibung; 
    /**
     * 
     */
    private JTextField txt_proBeschreibung;

    /**
     * 
     */
    private JButton btn_proDefinieren;

    /**
     * 
     */
    private JButton btn_zurueck;

    /**
     * 
     */
    public CProduktDefinieren controller;

}