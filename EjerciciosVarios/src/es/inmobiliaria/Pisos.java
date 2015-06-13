package es.inmobiliaria;

public abstract class Pisos extends Inmobiliaria{

	private String numPiso;
	private double precioDelInmueble;
	private boolean esNuevo;
	
	
	
	public Pisos() {
		super();
	}



	public Pisos(String numPiso, double precioDelInmueble, boolean esNuevo) {
		super();
		this.numPiso = numPiso;
		this.precioDelInmueble = precioDelInmueble;
		this.esNuevo = esNuevo;
	}



	public String getNumPiso() {
		return numPiso;
	}



	public void setNumPiso(String numPiso) {
		this.numPiso = numPiso;
	}



	public double getPrecioDelInmueble() {
		return precioDelInmueble;
	}



	public void setPrecioDelInmueble(double precioDelInmueble) {
		this.precioDelInmueble = precioDelInmueble;
	}



	public boolean isEsNuevo() {
		return esNuevo;
	}



	public void setEsNuevo(boolean esNuevo) {
		this.esNuevo = esNuevo;
	}



	public abstract double calcularPrecio();
		
		
	
	
	
}
