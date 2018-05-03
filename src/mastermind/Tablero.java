package mastermind;

import java.util.ArrayList;

public class Tablero {

	Combinacion combinacion;
	ArrayList<Combinacion> combOculta;
	ArrayList<Combinacion> intentos;
	
	public Tablero(Combinacion combinacion) {
		this.combinacion = combinacion;
	}
}
