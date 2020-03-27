package died.lab01.problema01;

public class Punto {
	float punto[]=new float[2];
	
	public Punto(float x, float y) { //Punto de la forma [x,y]
		punto[0]=x;
		punto[1]=y;
	}

	public float getX() {
		return punto[0];
	}
	
	public float getY() {
		return punto[1];
	}

	public void setX(float punto) {
		this.punto[0] = punto;
	}
	
	public void setY(float punto) {
		this.punto[1] = punto;
	}
	
	public boolean equals(Object otroPunto) {
		if(otroPunto instanceof Punto) {
			if((((Punto) otroPunto).punto[0]==this.punto[0]) && (((Punto) otroPunto).punto[1]==this.punto[1])) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
