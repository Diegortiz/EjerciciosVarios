package es.centralita.herencia;

public class LlamadasProvinciales extends Llamadas {
	
	private int franjaHoraria;
	
	

	public LlamadasProvinciales() {
		super();
		
	}



	public LlamadasProvinciales(int numOrigen, int numDestino,
			int duracionSegundos, float costeLlamada, float tarifa, int franjaHoraria) {
		super(numOrigen, numDestino, duracionSegundos, costeLlamada, tarifa);
		this.franjaHoraria = franjaHoraria;
	}



	public LlamadasProvinciales(int numOrigen, int numDestino,
			int duracionSegundos, int franjaHoraria) {
		super(numOrigen, numDestino, duracionSegundos);
		this.franjaHoraria = franjaHoraria;
	}


	

	public int getFranjaHoraria() {
		return franjaHoraria;
	}



	public void setFranjaHoraria(int franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}



	@Override
	public void calcularTarifa() {
		switch(this.franjaHoraria){
		case 1: setTarifa(8);
			break;
		case 2: setTarifa(12);
			break;
		case 3: setTarifa(16);
			break;
		
		}
		
	}

}
