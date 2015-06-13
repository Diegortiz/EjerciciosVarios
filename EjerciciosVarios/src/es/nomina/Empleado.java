package es.nomina;

public abstract class Empleado {

	private String nombre;
	private String apellidos;
	private int numSeguridadSocial;
	private double salarioBase;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellidos, int numSeguridadSocial,
			double salarioBase) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numSeguridadSocial = numSeguridadSocial;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNumSeguridadSocial() {
		return numSeguridadSocial;
	}

	public void setNumSeguridadSocial(int numSeguridadSocial) {
		this.numSeguridadSocial = numSeguridadSocial;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	public abstract void calcularSalario();
		
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", numSeguridadSocial=" + numSeguridadSocial
				+ ", salarioBase=" + salarioBase + "]";
	}
	
	
	
}
