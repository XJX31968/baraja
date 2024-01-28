package baraja;

import java.util.Arrays;

public class Baraja {

	
	private String[] baraja;
	private boolean vuelta;
	
	
	
	public Baraja() {
		
		 rellenarBaraja();
		 imprimirCartasDadasVuelta();
	}

	
	
	
	
	public void rellenarBaraja() {
        baraja = new String[52];
        for (int i = 0; i < baraja.length; i++) {
            int numeroCarta = (i % 13) + 1; 
            char simboloPalo = obtenerSimboloPalo(i / 13);

            
            String carta = obtenerNombreCarta(numeroCarta) + simboloPalo;

            
            baraja[i] = carta;
        }
    }

    private String obtenerNombreCarta(int numero) {
        switch (numero) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return Integer.toString(numero);
        }
    }

    private char obtenerSimboloPalo(int indice) {
        switch (indice) {
            case 0:
                return '\u2660'; 
            case 1:
                return '\u2665'; 
            case 2:
                return '\u2666'; 
            case 3:
                return '\u2663'; 
            default:
                return '?'; 
        }
    }
    
    
    public boolean vuelta (int i) {
    	
    	if (i >= 0 && i < baraja.length) {
    		
    		vuelta = !vuelta;
    		return !vuelta;
    	}
    	else {
            return false;
        }
    } 
    
    public void imprimirCartasDadasVuelta() {
        for (int i = 0; i < baraja.length; i++) {
            if (vuelta) {
                System.out.println(baraja[i]);
            }
        }
    }
    
    public String[] getBaraja() {
    	return baraja;
    }
    
    

	@Override
	public String toString() {
		return "Baraja [baraja=" + Arrays.toString(baraja) + ", vuelta=" + vuelta + "]";
	}

    	
    

    
}
	
	
	
	
	

