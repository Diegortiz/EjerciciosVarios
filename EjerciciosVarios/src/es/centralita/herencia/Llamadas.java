package es.centralita.herencia;

public abstract class Llamadas {
	
	private int numOrigen;
	private int numDestino;
	private int duracionSegundos;
	private float costeLlamada;
	private float tarifa;

	public Llamadas(){
		
		
	}
	
	
public Llamadas(int numOrigen, int numDestino, int duracionSegundos,
			float costeLlamada, float tarifa) {
		super();
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracionSegundos = duracionSegundos;
		this.costeLlamada = costeLlamada;
		this.tarifa = tarifa;
	}


public Llamadas(int numOrigen, int numDestino, int duracionSegundos) {
	super();
	this.numOrigen = numOrigen;
	this.numDestino = numDestino;
	this.duracionSegundos = duracionSegundos;
}




public int getNumOrigen() {
	return numOrigen;
}


public void setNumOrigen(int numOrigen) {
	this.numOrigen = numOrigen;
}


public int getNumDestino() {
	return numDestino;
}


public void setNumDestino(int numDestino) {
	this.numDestino = numDestino;
}


public int getDuracionSegundos() {
	return duracionSegundos;
}


public void setDuracionSegundos(int duracionSegundos) {
	this.duracionSegundos = duracionSegundos;
}


public float getCosteLlamada() {
	return costeLlamada;
}


public void setCosteLlamada(float costeLlamada) {
	this.costeLlamada = costeLlamada;
}


public float getTarifa() {
	return tarifa;
}


public void setTarifa(float tarifa) {
	this.tarifa = tarifa;
}


public void agregarLlamada(){
	
}



public abstract void calcularTarifa(); 
	
	


public void calcularTotal() {
	this.costeLlamada = this.tarifa * this.duracionSegundos;
	
}

public float getValor() {
	
	return 0;
}



}
