package mastermind;

/**
 * Clase para crear combinaciones de fichas de los colores que elijamos durante el juego
 * y distintos métodos para manipularlas
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 *
 */

public class Combinacion implements DibujableCombinacion {
	
	/*
	 * Se crea una combinación con un array de Ficha donde se irán guardando las distintas fichas con su respectivo color
	 */

	protected Ficha[] arrayFicha;
	protected int negro, blanco;
	
	/**
	 * Constructor Combinacion acorde al modo de juego que se elija y dependiendo de ello, se podrán elegir un determinado número de fichas
	 * dado el número de casillas disponibles (modo fácil: 4 casillas; modo medio: 5 casillas; modo difícil: 8 casillas)
	 * @see #Combinacion(ModoDeJuego)
	 * @param modo
	 */
	public Combinacion(ModoDeJuego modo) {
		arrayFicha = new Ficha[modo.getNumCasillas()];
	}
	
	/**
	 * @see #aniadirFicha(String)
	 * @param color
	 * @return Nueva ficha creada con el color elegido
	 */
	
	public static Ficha aniadirFicha(String color) {
		Ficha newFicha = new Ficha(color);
		return newFicha;
	}
	
	/**
	 * @see #crearCombinacion(ModoDeJuego)
	 * @param modo
	 */
	public static void crearCombinacion(ModoDeJuego modo) {
		Combinacion newComb = new Combinacion(modo);
	}
	
	/**
	 * @see #calcularRespuesta(Respuesta, Combinacion)
	 * @param respuesta
	 * @param combSecreta
	 */
	//respuesta es la combinación que el usuario introduce para averiguar la combinacion secreta  y combSecreta es 
	// dicha combinación secreta que se intenta averiguar (del usuario o de la máquina)
	public static void calcularRespuesta(Respuesta respuesta, Combinacion combSecreta) {
	}
	
	/**
	 * @see #modificarCombinacion(Combinacion)
	 * @param comb
	 */
	public static void modificarCombinacion(Combinacion comb) {
		
	}

	/**
	 * @see #dibujarCombinacion(Combinacion)
	 * @param combinacion
	 * @return Devuelve la interfaz de la Combinacion
	 */
	@Override
	public String dibujarCombinacion(Combinacion combinacion) {
		
		return null;
	}
	
}
