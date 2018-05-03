package mastermind;

public class Menu {

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

	public static void instrucciones() {
		System.out.println("INSTRUCCIONES DEL MASTERMIND:\r\n"
				+ "Mastermind es un juego de mesa, de ingenio y reflexión, para dos jugadores.\r\n"
				+ "Se juega en un tablero con fichas blancas y negras pequeñas y de otros colores. Ambos jugadores escogen un número de fichas de colores, depende del modo de juego, y pone un código secreto oculto del otro jugador. Este, tomando fichas de colores del mismo conjunto, aventura una posibilidad contestada con negras (fichas de color bien colocadas) o blancas (fichas de color con el color correcto, pero mal colocadas).\r\n"
				+ "Termina al averiguarse la combinación (es decir, se consigue una combinación con cuatro negras), o bien se agotan el número de intentos.\n  (1) Volver atrás\n  (2) Salir");
	}
	
	public static void despedida() {
		System.out.println("¡Hasta pronto!");
	}
}
