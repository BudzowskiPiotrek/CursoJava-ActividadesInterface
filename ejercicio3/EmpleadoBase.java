public abstract class EmpleadoBase implements Empleado {

	protected String nombre;
	protected String apellido;
	protected String documento;

	public EmpleadoBase(String nombre, String apellido, String documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double calcularSalario(double a, double b) {
		return a * b;
	}

}
