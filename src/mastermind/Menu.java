package mastermind;


/**
 * Clase que se encarga de crear métodos para llamarlos desde la clase Main 
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Menu {

	/**
	 * Primera pantalla que se muestra al ejecutar el Main
	 * @see #bienvenida()
	 */
	public static void bienvenida() {
		final String IC = "\u1433";
		System.out.printf(
				" _     _                           _     _                                     _                      _           _ \r\n"
						+ "| |   (_)                         (_)   | |                                   | |                    (_)         | |\r\n"
						+ "| |__  _  ___ _ ____   _____ _ __  _  __| | ___     __ _   _ __ ___   __ _ ___| |_ ___ _ __ _ __ ___  _ _ __   __| |\r\n"
						+ "| '_ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` | | '_ ` _ \\ / _` / __| __/ _ \\ '__| '_ ` _ \\| | '_ \\ / _` |\r\n"
						+ "| |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| | | | | | | | (_| \\__ \\ ||  __/ |  | | | | | | | | | | (_| |\r\n"
						+ "|_.__/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_| |_| |_| |_|\\__,_|___/\\__\\___|_|  |_| |_| |_|_|_| |_|\\__,_|\r\n"
						+ "                                                                                                                    %n1%s Empezar%n2%s Ver instrucciones%n3%s Salir%n",
						IC, IC, IC);
	}

	/**
	 * Pantalla que se muestra al introducir 2 en la pantalla de bienvenida
	 * @see #instrucciones()
	 */
	public static void instrucciones() {
		System.out.println("INSTRUCCIONES DEL MASTERMIND:\r\n"
				+ "Mastermind es un juego de mesa, de ingenio y reflexión, para dos jugadores.\r\n"
				+ "Se juega en un tablero con fichas blancas y negras pequeñas y de otros colores. Ambos jugadores escogen un número de fichas de colores, depende del modo de juego, y pone un código secreto oculto del otro jugador. Este, tomando fichas de colores del mismo conjunto, aventura una posibilidad contestada con negras (fichas de color bien colocadas) o blancas (fichas de color con el color correcto, pero mal colocadas).\r\n"
				+ "Termina al averiguarse la combinación (es decir, se consigue una combinación con cuatro negras), o bien se agotan el número de intentos.\n  (1) Volver atrás\n  (2) Salir");
	}
	
	/**
	 * Pantalla que se muestra al querer salir del juego
	 * @see #despedida()
	 */
	public static void despedida() {
		System.out.println("¡Hasta pronto!");
	}
	
	/**
	 * Pantalla en la que se podrá seleccionar la dificultad (fácil, medio o difícil) de la partida
	 * @see #seleccionarDificultad()
	 */
	public static void seleccionarDificultad() {
		System.out.println("Selecciona dificultad de la partida: \n  " + Colores.LETRA_VERDE + "(1) Fácil" + Colores.RESET);
		System.out.println(Colores.LETRA_AMARILLO + "  (2) Medio" + Colores.RESET);
		System.out.println(Colores.LETRA_ROJO + "  (3) Difícil" + Colores.RESET);
	}
	
	/**
	 * @see #partidaFacil()
	 * @return Devuelve una partida en modo fácil
	 */
	public static Partida partidaFacil() {
		return Partida.empezarPartida(ModoDeJuego.FACIL);
	}
	
	/**
	 * @see #partidaMedio()
	 * @return Devuelve una partida en modo medio
	 */
	public static Partida partidaMedio() {
		return Partida.empezarPartida(ModoDeJuego.MEDIO);
	}
	
	/**
	 * @see #partidaDificil()
	 * @return Devuelve una partida en modo difícil
	 */
	public static Partida partidaDificil() {
		return Partida.empezarPartida(ModoDeJuego.MEDIO);
	}
}
