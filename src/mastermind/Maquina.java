package mastermind;

/**
 * Clase dedicada a la máquina que participa como un jugador en el juego.
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Maquina extends Jugador{
	
	/**
	 * Constructor Maquina el cual heredará los atributos de su padre Jugador
	 * @see #Maquina(Tablero, Combinacion)
	 * @param tablero
	 * @param combinacionSecreta
	 */

	public Maquina(Tablero tablero, Combinacion combinacionSecreta) {
		super(tablero, combinacionSecreta);
	}
}
