package View;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * 
 */
public abstract class VGrundFenster extends JFrame
{ 
	private static final long serialVersionUID = 1L;
	
	private JTextField txt_Position;
    private JPanel pnl_Main = new JPanel(new BorderLayout());

    public void init()
    {
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	this.setTitle("PlEnTra");	//Title fuer alle Views gleich
    	
    	this.setLayout(new BorderLayout());
    	this.txt_Position = new JTextField(this.getName().toString());
    	this.txt_Position.setEditable(false);

    	pnl_Main.setBorder(new EmptyBorder(15, 15, 15, 15));
    	super.add(BorderLayout.CENTER, pnl_Main);
    	
    	pnl_Main.add(BorderLayout.SOUTH, txt_Position);
    }
    
    /**
     * �berschreibt add(String, Component) Elemente nicht in den eigentlichen Frame einzufuegen,
     * sondern in ein Panel im Center
     * 
     * @param position : Position des BorderLayouts
     * @param component: Komponente, die eingef�gt werden
     */
    public Component add(String position, Component component)
    {
    	pnl_Main.add(position, component);
    	
    	return component;	//Super Methode hat auch einen R�ckgabewert
    						// 	daher auch ein R�ckgabewert
    }
    
    public void setTxt_Postion(String pText)
    {
    	txt_Position.setText(pText);
    }
}