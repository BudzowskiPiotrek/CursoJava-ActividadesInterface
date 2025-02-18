public class Bicicletas extends Vehiculos implements Velocidad {

	@Override
	public void arrancar() {
		System.out.println("La bici ya se mueve pero no llegara: " + VELOCIDAD_MAXIMA + " km/h");

	}

	@Override
	public void detener() {
		System.out.println("La bici ha parado.");

	}

}
