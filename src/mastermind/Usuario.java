package mastermind;

/**
 * Clase dedicada al usuario que participa como un jugador en el juego. Además, es la
 * persona física que juega contra la máquina
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Usuario extends Jugador{
	
	/**
	 * Constructor Usuario el cual heredará los atributos de su padre Jugador
	 * @see #Usuario(Tablero, Combinacion)
	 * @param tablero
	 * @param combinacionSecreta
	 */

	public Usuario(Tablero tablero, Combinacion combinacionSecreta) {
		super(tablero, combinacionSecreta);
		
	}
}
