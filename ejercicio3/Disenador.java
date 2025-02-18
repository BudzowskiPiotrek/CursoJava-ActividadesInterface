public class Disenador extends EmpleadoBase {

	private String lapizFavorito;

	public String getLapizFavorito() {
		return lapizFavorito;
	}

	public void setLapizFavorito(String lapizFavorito) {
		this.lapizFavorito = lapizFavorito;
	}

	public Disenador(String nombre, String apellido, String documento, String lapizFavorito) {
		super(nombre, apellido, documento);
		this.lapizFavorito = lapizFavorito;
	}

	@Override
	public void trabajar() {
		System.out.println("Un diseñador esta trabajando editando fotos");
	}

	@Override
	public void descansar() {
		System.out.println("Yummy Yuuuumiiiii Yumi");

	}

	public void crearDiseno() {
		System.out.println("El diseñador esta creando un diseño nuevo");
	}
}
