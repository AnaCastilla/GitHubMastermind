package mastermind;

public class Combinacion implements DibujableCombinacion {

	protected Ficha[] arrayFicha;
	
	public Combinacion(ModoDeJuego modo) {
		arrayFicha = new Ficha[modo.getNumCasillas()];
	}
	
	
	public static Ficha aniadirFicha(String color) {
		Ficha newFicha = new Ficha(color);
		return newFicha;
	}
	
	public static void crearCombinacion(ModoDeJuego modo) {
		Combinacion newComb = new Combinacion(modo);
	}
	
	//respuesta es la combinación que el usuario introduce para averiguar la combinacion secreta  y combSecreta es 
	// dicha combinación secreta que se intenta averiguar (del usuario o de la máquina)
	public static void calcularRespuesta(Respuesta respuesta, Combinacion combSecreta) {
	}
	
	public static void modificarCombinacion(Combinacion comb) {
		
	}


	@Override
	public String dibujarCombinacion(Combinacion combinacion) {
		
		return null;
	}
	
}
