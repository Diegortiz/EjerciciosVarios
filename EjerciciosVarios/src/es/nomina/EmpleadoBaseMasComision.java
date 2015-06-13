package es.nomina;

public class EmpleadoBaseMasComision {

	public EmpleadoBaseMasComision() {
		super();
		
	}
	
	public void calcularSalario() {
		setCalcularSalario(getSalarioMes() * 2);
		
	}
	
	
	private void setCalcularSalario(int i) {
		
		
	}

	private int getSalarioMes() {
		
		return 0;
	}

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

		
}
