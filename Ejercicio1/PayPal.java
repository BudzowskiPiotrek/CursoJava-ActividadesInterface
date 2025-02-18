package Interface;

public class PayPal implements Pago {
	

	public PayPal() {
	}

	@Override
	public void procesarPago(double cantidad) {
		System.out.println("Has Pagado con PayPal: " + cantidad);
	}

	@Override
	public void cancelarPago() {
		System.out.println("Has cancelado tu pago con Pay Pal");

	}

}
