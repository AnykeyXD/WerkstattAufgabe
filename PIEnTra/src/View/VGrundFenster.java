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
    	this.setTitle("PlEnTra");	//Title fuer alle Views gleich
    	
    	this.setLayout(new BorderLayout());
    	this.txt_Position = new JTextField(this.getName().toString());
    	this.txt_Position.setEditable(false);

    	pnl_Main.setBorder(new EmptyBorder(15, 15, 15, 15));
    	super.add(BorderLayout.CENTER, pnl_Main);
    	
    	pnl_Main.add(BorderLayout.SOUTH, txt_Position);
    }
    
    /**
     * Überschreibt add(String, Component) Elemente nicht in den eigentlichen Frame einzufuegen,
     * sondern in ein Panel im Center
     * 
     * @param position : Position des BorderLayouts
     * @param component: Komponente, die eingefügt werden
     */
    public Component add(String position, Component component)
    {
    	if(position == BorderLayout.NORTH)
    	{
    		pnl_Main.add(BorderLayout.NORTH, component);
    	}
    	else if(position == BorderLayout.EAST)
    	{
    		pnl_Main.add(BorderLayout.EAST, component);
    	}
    	else if(position == BorderLayout.WEST)
    	{
    		pnl_Main.add(BorderLayout.WEST, component);
    	}
    	else if(position == BorderLayout.CENTER)
    	{
    		pnl_Main.add(BorderLayout.CENTER, component);
    	}
    	else	//kein BorderLayout.SOUTH -> reserviert fuer txt_Position
    	{
    		System.out.println("Falsche Eingabe");
    	}
    	
    	return component;	//Super Methode hat auch einen Rückgabewert
    						// 	daher auch ein Rückgabewert
    }
    
    public void setTxt_Postion(String pText)
    {
    	txt_Position.setText(pText);
    }
}