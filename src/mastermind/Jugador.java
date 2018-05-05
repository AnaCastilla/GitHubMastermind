package mastermind;

/**
 * Clase con la que se crean los jugadores del juego, su propio tablero donde jugarán para
 * adivinar la combinación secreta del contrincante y su propia combinacion secreta
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */

public class Jugador {

	protected Tablero tablero;
	protected Combinacion combinacionSecreta;
	
	/**
	 * Constructor de Jugador
	 * @see #Jugador(Tablero, Combinacion)
	 * @param tablero
	 * @param combinacionSecreta
	 */
	
	public Jugador(Tablero tablero, Combinacion combinacionSecreta) {
		this.tablero = tablero;
		this.combinacionSecreta = combinacionSecreta;
	}
	
	/**
	 * Método para que el jugador cree las combinaciones para averiguar las del contrario
	 * atendiendo al modo de juego en el que se juegue
	 * @see #introducirCombinacion(ModoDeJuego)
	 * @param modo
	 */
	
	public static void introducirCombinacion(ModoDeJuego modo) {
		Combinacion newComb = new Combinacion(modo);
	}
}
