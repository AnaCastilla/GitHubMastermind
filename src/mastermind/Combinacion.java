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
	 * @param modo
	 */
	public Combinacion(ModoDeJuego modo) {
		arrayFicha = new Ficha[modo.getNumCasillas()];
	}
	
	/**
	 * @see #aniadirFicha()
	 * @return 
	 */
	
	public static void aniadirFicha(String color) {
		Ficha newFicha = new Ficha(color);
	}
	
	public static void crearCombinacion(ModoDeJuego modo) {
		Combinacion newComb = new Combinacion(modo);
	}
	
	//respuesta es la combinación que el usuario introduce para averiguar la combinacion secreta  y combSecreta es 
	// dicha combinación secreta que se intenta averiguar (del usuario o de la máquina)
	public static void calcularRespuesta(Respuesta respuesta, Combinacion combSecreta) {
	}
	
	public static void modificarCombinacion(Combinacion comb) {
		
	}


	@Override
	public String dibujarCombinacion(Combinacion combinacion) {
		
		return null;
	}
	
}
