package es.nomina;

public abstract class EmpleadoPorComision extends Empleado {

	private int numSeguridadSocial;
	private int salarioBase;
	private int valorDeVentas;
	private double ComisionPorVentas;
	
	

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getValorDeVentas() {
		return valorDeVentas;
	}

	public void setValorDeVentas(int valorDeVentas) {
		this.valorDeVentas = valorDeVentas;
	}

	public double getComisionPorVentas() {
		return ComisionPorVentas;
	}

	public void setComisionPorVentas(double comisionPorVentas) {
		ComisionPorVentas = comisionPorVentas;
	}

	
	
	public EmpleadoPorComision() {
		super();
	}

	public EmpleadoPorComision(String nombre, String apellidos, String dni,
			double salarioMes, int valorHoras, int numHoras) {
		//super(nombre, apellidos,numSeguridadSocial, salarioBase);
		this.valorDeVentas = valorDeVentas;
		this.ComisionPorVentas = ComisionPorVentas;
	}

	public abstract void calcularSalario();{
	setSalarioMes(this.getValorDeVentas() * this.getComisionPorVentas() );
	
}
	@Override
	public String toString() {
		return "EmpleadoPorComision [salarioBase=" + salarioBase
				+ ", valorDeVentas=" + valorDeVentas + ", ComisionPorVentas="
				+ ComisionPorVentas + "]";
	}

	private void setSalarioMes(double d) {
		
		
	}
	
	
	
}
