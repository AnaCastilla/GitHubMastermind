package mastermind;

/**
 * Clase que crea la partida donde jugarán los 2 jugadores en un modo de dificultad establecido previamente
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Partida {

	private static Jugador jugador1;
	private static Jugador jugador2;
	private ModoDeJuego modo;

	 /**
	  * Constructor Partida
	  * @see #Partida(Jugador, Jugador, ModoDeJuego)
	  * @param jugador1
	  * @param jugador2
	  * @param modo
	  */
	
	public Partida(Jugador jugador1, Jugador jugador2, ModoDeJuego modo) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.modo = modo;
	}
	
	/**
	 * @see #empezarPartida(ModoDeJuego)
	 * @param modo
	 * @return Devuelve una nueva partida para empezar a jugar con un modo de juego indicado
	 */
	
	public static Partida empezarPartida(ModoDeJuego modo) {
		Partida newPartida = new Partida(jugador1, jugador2, modo);
		return newPartida;
	}
	
	/**
	 * @see #terminarPartida()
	 */
	public void terminarPartida() {
		
	}
}
