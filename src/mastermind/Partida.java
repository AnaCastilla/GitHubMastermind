package mastermind;

public class Partida {

	private static Jugador jugador1;
	private static Jugador jugador2;
	private ModoDeJuego modo;
	
	public Partida(Jugador jugador1, Jugador jugador2, ModoDeJuego modo) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.modo = modo;
	}
	
	public static Partida empezarPartida(ModoDeJuego modo) {
		Partida newPartida = new Partida(jugador1, jugador2, modo);
		return newPartida;
	}
	
	public void terminarPartida() {
		
	}
}
