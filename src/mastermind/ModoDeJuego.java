package mastermind;

public enum ModoDeJuego {
	FACIL(4, 8, false, 10), MEDIO(5, 8, false, 15), DIFICIL(8, 10, true, -1);

	private int numCasillas, numColores, numIntentos;
	private boolean repetirColores;
	

	ModoDeJuego(int numCasillas, int numColores, boolean repetirColores, int numIntentos) {
		this.numCasillas = numCasillas;
		this.numColores = numColores;
		this.repetirColores = repetirColores;
		this.numIntentos = numIntentos;
	}
}
