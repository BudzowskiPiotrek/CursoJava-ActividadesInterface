package Interface;

public class Main {

	public static void main(String[] args) {
		TarjetaCredito t1 = new TarjetaCredito();
		PayPal p1 = new PayPal();
		
		t1.procesarPago(10.23);
		t1.cancelarPago();
		p1.procesarPago(13.54);
		p1.cancelarPago();

	}

}
