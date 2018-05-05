package mastermind;

/**
 * Clase que crea las fichas que son los elementos esenciales del juego y con las cuales
 * se crean las combinaciones
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Ficha implements Cloneable, DibujableFicha {

	private String colorFicha;
	
	/**
	 * Constructor Ficha el hay que asignarle un color de la clase Colores para crear una ficha
	 * @see #Ficha(String)
	 * @param colorFicha
	 */

	public Ficha(String colorFicha) {
		this.colorFicha = colorFicha;
	}
	
	/**
	 * Comparar una ficha con el objeto especificado
	 * @param obj
	 * @return true: si son fichas iguales
	 * 		   false: si son fichas diferentes.
	 */
	
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Ficha && colorFicha.equals(((Ficha)obj).colorFicha)) {
			resultado = true;
		}
		return resultado;
	}
	
	/**
	 * Clonar la ficha especificada
	 * @return Devuelve la ficha clonada
	 */
	
	public Object clone() {
		Ficha clonado;
		try {
			clonado = (Ficha)super.clone();
		} catch (CloneNotSupportedException e) {
			clonado = null;
		}
		return clonado;
	}
	
	/**
	 * @see #toString()
	 * @return Devuelve la ficha
	 */
	
	public String toString() {
		return String.format("%s", colorFicha);
	}

	/**
	 * @see #dibujarFicha(Ficha)
	 * @param ficha
	 * @return Devuelve la ficha gracias a su interfaz
	 */
	@Override
	public String dibujarFicha(Ficha ficha) {
		
		return null;
	}
}
