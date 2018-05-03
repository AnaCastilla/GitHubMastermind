package mastermind;

import mastermind.Teclado.ValoresMaxMin;

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
			}

		}
	}
}