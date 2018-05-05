package mastermind;

import mastermind.Teclado.ValoresMaxMin;

/**
 * Clase donde se va a ejecutar el juego 
 * 
 * @author Ana Castilla
 * @version 1.0
 * @since 1.0
 */
public class Main {

	public static void main(String[] args) {

		int start = 0, elec;
		boolean salir = false;

		while (start != 3 && start != 1) {
			Menu.bienvenida();
			start = Teclado.leerValoresMaxMin(3, 1, ValoresMaxMin.AMBOS_INC);

			if (start == 2) {
				Menu.instrucciones();
				start = Teclado.leerValoresMaxMin(2, 1, ValoresMaxMin.AMBOS_INC);
				start++;

				if (start == 3) {
					Menu.despedida();
				}

			} else if (start == 3) {
				Menu.despedida();
				salir = true;
			} else {
				Menu.seleccionarDificultad();
				elec = Teclado.leerValoresMaxMin(3, 1, ValoresMaxMin.AMBOS_INC);
				
				if (elec == 1) {
					System.out.println("¡Has elegido el modo de dificultad fácil!\nJugarás tú con la máquina, ¡buena suerte!");
					Menu.partidaFacil();
				} if (elec == 2) {
					System.out.println("¡Has elegido el modo de dificultad medio!\nJugarás tú con la máquina, ¡buena suerte!");
					Menu.partidaMedio();
				} if (elec == 3) {
					System.out.println("¡Has elegido el modo de dificultad difícil!\nJugará la máquina contra ella misma");
					Menu.partidaDificil();
				}
						
				
			}

		}
	}
}



		
	
