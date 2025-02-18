public class Pruebas {
	public static void main(String[] args) {
		Disenador d1 = new Disenador("Pablo", "Lopez", "x12323f", "B8");
		Desarrollador d2 = new Desarrollador("Cleo", "Paquiao", "2311238k", "Python");

		System.out.println("\nEl diseñador " + d1.getNombre() + " ha ganado este mes: " + d1.calcularSalario(100, 10));
		d1.trabajar();
		d1.crearDiseno();
		d1.descansar();

		System.out
				.println("\nla desarolladora " + d2.getNombre() + " ha ganado este mes: " + d2.calcularSalario(121, 10));
		d2.trabajar();
		d2.escribirCodigo();
		d2.descansar();

	}

}
