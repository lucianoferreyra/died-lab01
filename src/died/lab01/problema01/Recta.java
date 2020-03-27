package died.lab01.problema01;

public class Recta {

	public float pendiente = 0;
	public float origen = 0;
	
	public Recta() { //Crea una instancia de la recta identidad - y(x) = x  
		pendiente = 1;
	}
	
	public Recta(Punto p1, Punto p2) {
		pendiente = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		origen = (-(pendiente * p1.getX()) + p1.getY());
	}
	
	public float pendiente(Recta r) {
		return pendiente;
	}
	
	public boolean paralelas(Recta r1, Recta r2) {
		if(r1.pendiente == r2.pendiente) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Object otraRecta) {
		if(otraRecta instanceof Recta) {
			if(this.pendiente == ((Recta) otraRecta).pendiente && this.origen == ((Recta) otraRecta).origen) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
}
