package baraja;

import java.util.Arrays;

public class Baraja {

	
	private String[] baraja;
	private boolean vuelta=true;
	
	
	
	

	
	
	
	
	public void rellenarBaraja() {
		
		
		baraja = new String[52];
		for(int i=0;i<baraja.length;i++) {
			
			if(i<=12) {
			
			baraja[i]=i+("\u2660");
					
			
		}
		
			else if(i<=25) {
				
				
			baraja[i]=i+("\u2663");
			}
			
			
			
			else if(i<=38) {
				
			baraja[i]=i+("\u2665");	
				
			}
			
			else if(i<=52) {
				
			
			baraja[i]=i+("\u2666");
			}
		
	}
	
	
	
	
	
}




	@Override
	public String toString() {
		return "Baraja [baraja=" + Arrays.toString(baraja) + ", vuelta=" + vuelta + "]";
	}
	
	
	
	
	
}
