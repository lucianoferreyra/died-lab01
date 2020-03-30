package died.lab01.problema03;
import died.lab01.problema02.*;

public class Registro {
	
	static final int MAX = 10;
	
	private String ciudad;
	private Temperatura[] historico;
	
	public Registro() {
		ciudad = "-";
		historico = new Temperatura[MAX];
	}
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		historico = new Temperatura[MAX];
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void imprimir() {
		int i = 1;
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+ ciudad);
		for(Temperatura unaTemp : historico) {
			if(unaTemp != null) {
				System.out.println(i +"- "+ unaTemp.toString());
				i++;
			}
		}
	}
	
	public void agregar(Temperatura t) {
		if(historico[MAX-1] == null) {    //Compruebo si la ultima posicion es vacia.
			int cont = 0;
			while(historico[cont] != null) { //Recorro el arreglo hasta encontrar la pos. vacia.
				cont++;
			}
			historico[cont] = t;
		}
	}
	
	public Double mediaAsCelcius() {
		Double aux = 0d;

		for(Temperatura unaTemp : historico) {
			if(unaTemp.escala.equals(Escala.FAHRENHEIT)) {
				aux += unaTemp.asCelcius();
			} else {
				aux += unaTemp.grados;
			}
		}
		return (aux/MAX);
	}
	
	public Double mediaAsFahrenheit() {
		Double aux = 0d;

		for(Temperatura unaTemp : historico) {
			if(unaTemp.escala.equals(Escala.CELCIUS)) {
				aux += unaTemp.asFahrenheit();
			} else {
				aux += unaTemp.grados;
			}
		}
		return (aux/MAX);
	}
	
	public Temperatura maximo() {
		int indice = 0;
		
		indice = obtenerIndice();
		
		return historico[indice];
	}
	
	private int obtenerIndice() {
		int indice = 0, i=0;
		Double mayor = 0d;
		
		Double aux[] = new Double[MAX];
		
		
		for(Temperatura unaTemp : historico) {
			if(unaTemp.escala.equals(Escala.FAHRENHEIT)) {
				aux[i] = unaTemp.asCelcius();
				i++;
			}else {
				aux[i] = unaTemp.grados;
				i++;
			}
		}
		
		for(int j=0; j<MAX; j++) {
			if(aux[j]>mayor) {
				mayor = aux[j];
				indice = j;
			}
		}
		return indice;
	}
	
}
