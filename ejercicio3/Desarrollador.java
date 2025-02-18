public class Desarrollador extends EmpleadoBase {

	private String lenguajeProgramacion;

	public Desarrollador(String nombre, String apellido, String documento, String oficio) {
		super(nombre, apellido, documento);
		this.lenguajeProgramacion = oficio;
	}

	public String getOficio() {
		return lenguajeProgramacion;
	}

	public void setOficio(String oficio) {
		this.lenguajeProgramacion = oficio;
	}

	@Override
	public void trabajar() {
		System.out.println("Un desarollador esta trabajando picando codigos");
	}

	@Override
	public void descansar() {
		System.out.println("Zzzzz Zzzzzz Zzz Zzzzz");
	}

	public void escribirCodigo() {
		System.out.println("El desarollador esta creando un codigo nuevo");
	}
}
