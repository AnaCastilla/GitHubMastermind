package mastermind;

public class Combinacion {

	protected Ficha[] arrayFicha;
	
	public Combinacion(ModoDeJuego modo) {
		arrayFicha = new Ficha[ModoDeJuego.FACIL];
		arrayFicha = new Ficha[ModoDeJuego.MEDIO];
		arrayFicha = new Ficha[ModoDeJuego.DIFICIL];	
	}
	
}
