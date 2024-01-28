package baraja;

public class Start {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		Dealer dealer = new Dealer();
		baraja.rellenarBaraja();
		baraja.vuelta(12);
		baraja.imprimirCartasDadasVuelta();
		System.out.println(baraja);
		System.out.println(dealer);
	}

}
