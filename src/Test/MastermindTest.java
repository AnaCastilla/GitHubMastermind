package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mastermind.Colores;
import mastermind.Combinacion;
import mastermind.ModoDeJuego;
import mastermind.Respuesta;
import mastermind.Teclado;


@DisplayName("Test JUnit para probar el cálculo de una respuesta para una combinación para los 3 modos"
		+ "de funcionamiento (fácil, medio, difícil) del Mastermind")

class MastermindTest {

	@Test
	
	void respuestaTest() {
		
	
		
		System.out.println("Ningún color de la respuesta está en la combinación secreta (modo medio, porque no se pueden repetir colores)");
		
		
		assertArrayEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
	}

}
