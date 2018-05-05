package mastermind;

import java.util.ArrayList;

/**
 * Clase que crea el tablero donde se colocarán todas las combinaciones y respuestas durante la partida
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */

public class Tablero implements DibujableTablero {

	Combinacion combinacion;
	ArrayList<Combinacion> combOculta;
	ArrayList<Combinacion> intentos;
	
	/**
	 * Constructor Tablero
	 * @see #Tablero(Combinacion)
	 * @param combinacion
	 */
	public Tablero(Combinacion combinacion) {
		this.combinacion = combinacion;
	}

	/**
	 * @see #dibujarTablero(Tablero)
	 * @param tablero
	 * @return Devuelve el tablero dibujado gracias a su interfaz
	 */
	@Override
	public String dibujarTablero(Tablero tablero) {
		
		return null;
	}
}
