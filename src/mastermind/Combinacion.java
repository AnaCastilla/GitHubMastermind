package mastermind;

public class Combinacion implements DibujableCombinacion {

	protected Ficha[] arrayFicha;
	
	public Combinacion(ModoDeJuego modo) {
		arrayFicha = new Ficha[modo.getNumCasillas()];
	}
	
	
	public static void aniadirFicha(String color) {
		Ficha newFicha = new Ficha(color);
	}
	
	public static void crearCombinacion(ModoDeJuego modo) {
		Combinacion newComb = new Combinacion(modo);
	}
	
	public static void calcularRespuesta(Respuesta respuesta) {
	}
	
	public static void modificarCombinacion(Combinacion comb) {
		
	}


	@Override
	public String dibujarCombinacion(Combinacion combinacion) {
		
		return null;
	}
	
}
