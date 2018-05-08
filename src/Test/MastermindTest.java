package Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
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
		
	
		System.out.println("CLASES DE EQUIVALENCIA VÁLIDAS\nTodas las fichas están bien colocadas -> las fichas de la respuesta son "
				+ "las mismas que la de la combinación secreta:\nModo Fácil: ");
		assertArrayEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertArrayEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil: ");
		assertArrayEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("\nNinguna ficha bien colocada -> todas las fichas de la respuesta son diferentes de las de la"
				+ "combinación secreta: \nModo Fácil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("Distintas respuestas que se pueden dar dependiendo de la posición de las fichas (modo fácil)\n"
				+ "Introduce 3 colores iguales y 1 distinto");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("introduce 2 colores iguales y 2 distintos");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("introduce 1 color igual y 3 distintos");
		
		System.out.println("Colores repetidos en el modo difícil\n Escribe 8 colores para el modo difícil que se repitan:");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("CLASES DE EQUIVALENCIA NO VÁLIDAS\nNingún color de la respuesta está en la combinación secreta\nModo Fácil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil (se pueden repetir colores): ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("Se repiten colores cuando no se puede\nModo Fácil:");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));

		System.out.println("Combinación secreta con valores nulos -> introduce un espacio en blanco o null:\nModo Fácil");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil (se pueden repetir colores): ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("Respuesta con valores nulos -> introduce un espacio en blanco o null:\nModo Fácil");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("No existe combinación secreta -> no se introduce nada en la combinación secreta:\nModo Fácil:");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		System.out.println("No existe respuesta -> no se introduce nada en la respuesta\nModo Fácil:");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.FACIL), Combinacion.combSecreta(ModoDeJuego.FACIL));
		System.out.println("Modo Medio: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.MEDIO), Combinacion.combSecreta(ModoDeJuego.MEDIO));
		System.out.println("Modo Difícil: ");
		assertNotEquals(Combinacion.respuesta(ModoDeJuego.DIFICIL), Combinacion.combSecreta(ModoDeJuego.DIFICIL));
		
		
	}

}
