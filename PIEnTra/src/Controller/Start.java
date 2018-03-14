package Controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Start {

	public static void main(String[] args) 
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//		System.out.println("Hallo ihr Enise");
//		System.out.println("Test");
//
//		System.out.println("Hallo Gruppe!");
//		System.out.println("Hallo Gruppe!");
//		System.out.println("Hallo Gruppe!");
//		
//		System.out.println("änderung");
		
		SuperController superController = SuperController.getInstance();
		superController.setHauptMenuView();
	}

}
