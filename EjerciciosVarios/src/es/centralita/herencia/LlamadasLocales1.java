package es.centralita.herencia;

public class LlamadasLocales1 extends Llamadas {

	
	
	
	public LlamadasLocales1() {
		super();
		
	}

	public LlamadasLocales1(int numOrigen, int numDestino, int duracionSegundos) {
		super(numOrigen, numDestino, duracionSegundos);
		
	}


	

	

	@Override
	public void calcularTarifa() {
		this.setTarifa(5);
		
	}

	
	
	
}
