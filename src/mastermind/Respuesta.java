package mastermind;

/**
 * Clase dedicada a la respuesta que se le da a una combinación introducida con
 * pinchos blancos y negros, dependiendo de cuántas casillas haya acertado o no 
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Respuesta extends Combinacion{

	private Combinacion comb; 
	
	/**
	 * Constructor Respuesta
	 * @see #Respuesta(ModoDeJuego, Combinacion)
	 * @param modo
	 * @param comb
	 */
	public Respuesta(ModoDeJuego modo, Combinacion comb) {
		super(modo);
		this.comb = comb;
	}
}
