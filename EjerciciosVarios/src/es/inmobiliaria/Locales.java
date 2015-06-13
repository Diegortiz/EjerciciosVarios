package es.inmobiliaria;

public abstract class Locales extends Inmobiliaria{

	private int numVentanas;
	private double precioDelInmueble;
	private boolean nuevo;
	

	public Locales() {
		super();
	}
	
	
	public Locales(int numVentanas, double precioDelInmueble, boolean nuevo) {
		super();
		this.numVentanas = numVentanas;
		this.precioDelInmueble = precioDelInmueble;
		this.nuevo = nuevo;
	}


	public int getNumVentanas() {
		return numVentanas;
	}
	
	
	public void setNumVentanas(int numVentanas) {
		this.numVentanas = numVentanas;
	}
	
	
	public double getPrecioDelInmueble() {
		return precioDelInmueble;
	}
	
	
	public void setPrecioDelInmueble(double precioDelInmueble) {
		this.precioDelInmueble = precioDelInmueble;
	}
	
	
	public boolean isNuevo() {
		return nuevo;
	}
	
	
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}










	public abstract double calcularPrecio(); 
		
		
	
	
}
	
	
