package mastermind;

/**
 * Clase que nos permitirá elegir la dificultad del juego (fácil, normal o difícil) e indicará el número de casillas,
 * colores, intentos y si se podrán repetir los colores de las fichas, dependiendo del modo seleccionado
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 *
 */

public enum ModoDeJuego {
	
	/**
	 * Enum con los distintos modos y sus valores
	 */
	
	FACIL(4, 8, false, 10), MEDIO(5, 8, false, 15), DIFICIL(8, 10, true, -1);

	private int numCasillas, numColores, numIntentos;
	private boolean repetirColores;
	
	/**
	 * Constructor del Enum con sus correspondientes valores atendiendo al modo que se elija
	 * @param numCasillas
	 * @param numColores
	 * @param repetirColores
	 * @param numIntentos
	 */

	ModoDeJuego(int numCasillas, int numColores, boolean repetirColores, int numIntentos) {
		this.numCasillas = numCasillas;
		this.numColores = numColores;
		this.repetirColores = repetirColores;
		this.numIntentos = numIntentos;
	}
	
	/**
	 * @see #getNumCasillas(int)
	 * @return Número de casillas del modo elegido 
	 */
	
	public int getNumCasillas() {
		return numCasillas;
	}
	
	/**
	 * @see #getNumColores()
	 * @return Número de colores disponibles del modo elegido
	 */
	
	
	public int getNumColores() {
		return numColores;
	}
	
	/**
	 * @see #getRepetirColores()
	 * @return Devuelve si se pueden repetir colores o no 
	 */
	
	public boolean getRepetirColores() {
		return repetirColores;
	}
	
	/**
	 * @see #getNumIntentos()
	 * @return Número de intentos disponibles del modo elegido
	 */
	
	
	public int getNumIntentos() {
		return numIntentos;
	}
}
