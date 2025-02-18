public class Coche extends Vehiculos implements Velocidad {

	@Override
	public void arrancar() {
		System.out.println("El coche ha arancado brumm brummmm va a camino de: " + VELOCIDAD_MAXIMA + " km/h");

	}

	@Override
	public void detener() {
		System.out.println("El coche ha parado.");

	}

}
