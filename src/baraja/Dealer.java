package baraja;

import java.util.Arrays;

public class Dealer {

	
	private Baraja baraja;
	private String[] mano;
	
	
	public Dealer() {
		
		baraja = new Baraja();
		barajar();
		
	}
	
	public void barajar() {
		
		String[] cartasBaraja = baraja.getBaraja();
		mano = new String[7];
		
		for(int i=0;i<7;i++) {
			
			int indice = (int) (Math.random() * baraja.getBaraja().length);
			mano[i] = cartasBaraja[indice];
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Dealer [mano=" + Arrays.toString(mano) + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
