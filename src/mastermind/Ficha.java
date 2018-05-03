package mastermind;

public class Ficha implements Cloneable, DibujableFicha {

	private String colorFicha;

	public Ficha(String colorFicha) {
		this.colorFicha = colorFicha;
	}
	
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Ficha && colorFicha.equals(((Ficha)obj).colorFicha)) {
			resultado = true;
		}
		return resultado;
	}
	
	public Object clone() {
		Ficha clonado;
		try {
			clonado = (Ficha)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado = null;
		}
		return clonado;
	}
	
	public String toString() {
		return String.format("%s", colorFicha);
	}

	@Override
	public String dibujarFicha(Ficha ficha) {
		
		return null;
	}
}
