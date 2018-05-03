package mastermind;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	public static enum Comparacion { // Lectura de un num mayor/menor
		MAYOR_IGUAL, MENOR_IGUAL, MAYOR, MENOR;
	}
	
	public static enum ValoresMaxMin { //Lectura de valores máximos y mínimos
		AMBOS_INC, AMBOS_EXC, MININC_MAXEXC, MINEXC_MAXINC;
	}

	// Declaración del teclado
	static Scanner teclado = new Scanner(System.in);

	// Cerrar teclado
	public static void cerrarTeclado() {
		teclado.close();

	}

	// Lectura de un carácter
	public static char leerCaracter() {
		char caracter;
		caracter = teclado.next().charAt(0);
		return caracter;
	}

	// Lectura de una cadena
	public static String leerCadena() {
		String cadena;
		cadena = teclado.nextLine();
		return cadena;
	}

	// Lectura de un boolean
	public static boolean leerBoolean(String par1, String par2, String par3) { 
		boolean res;															
		byte elec;
		do {
			System.out.printf("%s\n1.- %s\n2.- %s\n", par1, par2, par3);
			elec = teclado.nextByte();
			if (elec != 1 && elec != 2) {
				System.out.println("ERROR! No has introducido 1 o 2.");
			}

		} while (elec != 1 && elec != 2);
		res = (elec == 1) ? true : false; // se hace esto para devolver un
											// resultado booleano
		return res;

	}

	// Leer boolean para una pregunta cuya respuesta es s/n
	public static boolean leerBooleanSiNo(String pregunta) {
		char elec;
		do {
			System.out.printf("%s : s/n\n", pregunta);
			elec = Character.toLowerCase(leerCaracter());
			if (elec != 's' && elec != 'n') {
				System.out.println("ERROR! No has introducido 's' o 'n'.");
			}

		} while (elec != 's' && elec != 'n');
		//res = (elec == 's' || elec == 'S') ? true : false;
		return elec == 's'; //al poner esto en return me devuelve igualmente un boolean que es lo que me tiene que devolver, si se cumple eso devuelve TRUE, si no, FALSE
	}

	//Leer un número tipo byte
	public static byte leerByte() {
		byte num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextByte();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;

	}

	//Leer un número tipo short
	public static short leerShort() {
		short num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextShort();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;
	}

	//Leer un número tipo long
	public static long leerLong() {
		long num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextLong();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;
	}

	//Leer un número tipo int
	public static int leerInt() {
		int num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextInt();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;
	}

	//Leer un número tipo float
	public static float leerFloat() {
		float num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextFloat();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;
	}

	//Leer un número tipo double
	public static double leerDouble() {
		double num = 0;
		boolean valorValido = true;
		do {
			try {
				num = teclado.nextDouble();
				valorValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Has introducido un valor incorrecto. Inténtelo de nuevo:");
				valorValido = false;
			} finally {
				teclado.nextLine(); // Se limpia el buffer
			}
		} while (!valorValido);
		return num;
	}

	//Leer una comparación tipo byte
	public static byte leerComparacion(byte num, Comparacion comparacion) {
		byte res;
		boolean valorValido = true;
		do {
			res = leerByte();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es >= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es <= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es > que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es < que %d. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}
	
	//Leer una comparación tipo short
	public static short leerComparacion(short num, Comparacion comparacion) {
		short res;
		boolean valorValido = true;
		do {
			res = leerShort();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es >= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es <= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es > que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es < que %d. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}

	//Leer una comparación tipo long
	public static long leerComparacion(long num, Comparacion comparacion) {
		long res;
		boolean valorValido = true;
		do {
			res = leerLong();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es >= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es <= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es > que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es < que %d. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}
	
	//Leer una comparación tipo int
	public static int leerComparacion(int num, Comparacion comparacion) {
		int res;
		boolean valorValido = true;
		do {
			res = leerInt();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es >= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es <= que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es > que %d\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%d no es < que %d. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}
	
	//Leer una comparación tipo float
	public static float leerComparacion(float num, Comparacion comparacion) {
		float res;
		boolean valorValido = true;
		do {
			res = leerFloat();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es >= que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es <= que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es > que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es < que %f. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}
	
	//Leer una comparación tipo double
	public static double leerComparacion(double num, Comparacion comparacion) {
		double res;
		boolean valorValido = true;
		do {
			res = leerDouble();

			switch (comparacion) {
			case MAYOR_IGUAL:
				if (res >= num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es >= que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR_IGUAL:
				if (res <= num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es <= que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MAYOR:
				if (res > num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es > que %f\n. Inténtelo de nuevo:", res, num);
					valorValido = false;
				}
				break;
			case MENOR:
				if (res < num) {
					valorValido = true;
				} else {
					System.out.printf("%f no es < que %f. Inténtelo de nuevo: \n", res, num);
					valorValido = false;
				}
				break;

			}

		} while (!valorValido);
		return res;
	}

	//Leer valores máximos y mínimos de tipo byte
	public static byte leerValoresMaxMin (byte valormax, byte valormin, ValoresMaxMin maxmin){
		byte res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException();
		}
		
		do{
			res = leerByte();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}
	
	public static short leerValoresMaxMin (short valormax, short valormin, ValoresMaxMin maxmin){
		short res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException();
		}
		
		do{
			res = leerShort();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}
	
	public static long leerValoresMaxMin (long valormax, long valormin, ValoresMaxMin maxmin){
		long res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException();
		}
		
		do{
			res = leerLong();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}
	
	public static int leerValoresMaxMin (int valormax, int valormin, ValoresMaxMin maxmin){
		int res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException();
		}
		
		do{
			res = leerInt();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}
	
	public static float leerValoresMaxMin (float valormax, float valormin, ValoresMaxMin maxmin){
		float res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException();
		}
		
		do{
			res = leerFloat();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}

	public static double leerValoresMaxMin (double valormax, double valormin, ValoresMaxMin maxmin){
		double res;
		boolean valorValido = true;
		if (valormin > valormax){
			throw new IllegalArgumentException("ERROR! Has introducido mal los datos. El valor mín debe ser menor que el valor máx. Utiliza un try-catch");
		}
		
		do{
			res = leerDouble();
			switch (maxmin){
			case AMBOS_INC:
				if (res >= valormin && res<=valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites incluidos. Inténtalo de nuevo:" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case AMBOS_EXC:
				if (res > valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d y %d, ambos límites excluidos. Inténtalo de nuevo:  " , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= valormin && res < valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (incluido en el límite)  y %d (excluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			case MINEXC_MAXINC:
				if (res > valormin && res <= valormax){
					valorValido=true;
				} else {
					System.out.printf("%d no está entre los valores %d (excluido del límite) y %d (incluido)" , res, valormin, valormax);
					valorValido=false;
				}
				break;
			}
		}while(!valorValido);
		return res;	
	}


}


