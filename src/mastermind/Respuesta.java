package mastermind;

public class Respuesta extends Combinacion{

	private Combinacion comb; 
	public Respuesta(ModoDeJuego modo, Combinacion comb) {
		super(modo);
		this.comb = comb;
	}
}
