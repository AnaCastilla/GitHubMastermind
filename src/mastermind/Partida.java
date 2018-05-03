package mastermind;

public class Partida {

	private Jugador jugador1, jugador2;
	private ModoDeJuego modo;
	
	public Partida(Jugador jugador1, Jugador jugador2, ModoDeJuego modo) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.modo = modo;
	}
}
