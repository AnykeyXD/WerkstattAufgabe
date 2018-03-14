package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 */
public abstract class VGrundFenster extends JFrame
{ 
	private static final long serialVersionUID = 1L;
	
	private JTextField txt_Position;
    

    public void init()
    {
		 
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	this.setTitle("PlEnTra");	//Title fuer alle Views gleich
    	
    	this.setLayout(new BorderLayout());
    	this.txt_Position = new JTextField(this.getName().toString());
    	
    	this.add(BorderLayout.SOUTH, txt_Position);
    }
    
    public void setTxt_Postion(String pText)
    {
    	txt_Position.setText(pText);
    }
}