package mastermind;

public class Jugador {

	protected Tablero tablero;
	protected Combinacion combinacionSecreta;
	
	
	public Jugador(Tablero tablero, Combinacion combinacionSecreta) {
		this.tablero = tablero;
		this.combinacionSecreta = combinacionSecreta;
	}
}
