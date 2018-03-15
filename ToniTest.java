import Controller.CKundeSuchen;
import Controller.CProduktDefinieren;
import Controller.CTrainingSuchen;


public class ToniTest {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CProduktDefinieren cprod = CProduktDefinieren.getInstance();
		cprod.createView();
		
		CKundeSuchen cprod2 = CKundeSuchen.getInstance();
		cprod2.createView();
		
		CTrainingSuchen cprod3 = CTrainingSuchen.getInstance();
		cprod3.createView();
		
	}

	
	
	
	
	
	
}
