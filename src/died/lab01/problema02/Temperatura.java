package died.lab01.problema02;

public class Temperatura {
	public Double grados;
	public Escala escala;
	
	public Temperatura() {
		grados = 0d;
		escala = Escala.CELCIUS;
	}
	
	public Temperatura(double grados, Escala escala) {
		this.grados = grados;
		this.escala = escala;
	}
	
	public String toString() {
		String t;
		t = Double.toString(grados);
		if(escala.equals(Escala.CELCIUS)) {
			t += " °C"; 
		}
		if(escala.equals(Escala.FAHRENHEIT)){
			t += " °F";
		}
		return t;
	}
	
	public Double asCelcius() {
		if(escala.equals(Escala.FAHRENHEIT)){
			return (grados-32)*(5d/9d);
		} else {
			return grados;
		}
	}
	
	public Double asFahrenheit() {
		if(escala.equals(Escala.CELCIUS)){
			return ((grados*(9d/5d)) + 32);
		} else {
			return grados;
		}
	}
	
	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			
			switch(temperatura.escala) {
			case CELCIUS:
				if(this.escala.equals(Escala.CELCIUS)) {
					this.grados += temperatura.grados;
				} else {
					this.grados += temperatura.asFahrenheit();
				}
			break;
			case FAHRENHEIT:
				if(this.escala.equals(Escala.FAHRENHEIT)) {
					this.grados += temperatura.grados;
				} else {
					this.grados += temperatura.asCelcius();
				}
			}
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if(temperatura.grados > 0.0) {
			
			switch(temperatura.escala) {
			case CELCIUS:
				if(this.escala.equals(Escala.CELCIUS)) {
					this.grados -= temperatura.grados;
				} else {
					this.grados -= temperatura.asCelcius();
				}
			break;
			case FAHRENHEIT:
				if(this.escala.equals(Escala.FAHRENHEIT)) {
					this.grados -= temperatura.grados;
				} else {
					this.grados -= temperatura.asFahrenheit();
				}
			}
		}
	}
}
