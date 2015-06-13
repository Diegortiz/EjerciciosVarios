package es.centralita.herencia;



import java.util.ArrayList;

public class CentralitaTelefonica {
	
	private ArrayList <Llamadas> listaLlamadas;
	private float costeTotal;
	private int numLlamadas;
	
	public CentralitaTelefonica(){
		listaLlamadas = new ArrayList<Llamadas>();
		costeTotal = 0;
		numLlamadas = 0;
	}
		
	public void agregarLlamada(){
		listaLlamadas.add(null);
		
	}
	
	 public float getCosteTotal() {
	        return costeTotal;
	    }

	    public int getNumLlamadas() {
	        return numLlamadas;
	    }
	    
	    public void totalizar(){
	        for (int i = 0; i < listaLlamadas.size(); i++) {
	            Llamadas llamada = listaLlamadas.get(i);
	            llamada.calcularTarifa();
	            llamada.calcularTotal();
	            costeTotal= costeTotal+ llamada.getValor();
	        }
	        
	        
	    }
	    
	    public void contabilizar()
	    {
	         numLlamadas = listaLlamadas.size();
	    }
	    
	
	}
		
	
		
	
		
		
		
		
		


	
