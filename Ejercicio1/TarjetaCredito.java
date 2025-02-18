public class TarjetaCredito implements Pago {
	

	public TarjetaCredito() {
	}

	@Override
	public void procesarPago(double cantidad) {
		System.out.println("Has Pagado con Tarjeta de credito: "+ cantidad);
	}

	@Override
	public void cancelarPago() {
		System.out.println("Has cancelado tu pago con Pay Pal");
		
	}

}
