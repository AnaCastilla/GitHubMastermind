package mastermind;

import java.util.ArrayList;

public class Tablero implements DibujableTablero {

	Combinacion combinacion;
	ArrayList<Combinacion> combOculta;
	ArrayList<Combinacion> intentos;
	
	public Tablero(Combinacion combinacion) {
		this.combinacion = combinacion;
	}

	@Override
	public String dibujarTablero(Tablero tablero) {
		
		return null;
	}
}
