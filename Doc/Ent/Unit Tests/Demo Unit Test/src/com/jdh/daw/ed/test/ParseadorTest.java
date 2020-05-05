package com.jdh.daw.ed.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdh.daw.ed.Parseador;
import com.jdh.daw.ed.exceptions.BadCoefficientException;



public class ParseadorTest {
	
	private static Parseador parseador;
	private static String  ecuacion;
	
	@BeforeAll
	public static void prepareTestCase() {
		// Parte del contexto comun a todos los tests 
		parseador = new Parseador();		
	}
	
	@Test
	public void obtenerCoeficienteATest1() throws BadCoefficientException {
		// Preparación del contexto
		ecuacion = "2x + 1 = 0";
		
		// Ejecución del método a testear
		int resultado = parseador.obtenerCoeficienteA(ecuacion);
		
		// Comprobación
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void obtenerCoeficienteATest2() throws BadCoefficientException {
		// Preparación del contexto
		ecuacion = "2x - 1 = 0";
		
		// Ejecución del método a testear
		int resultado = parseador.obtenerCoeficienteA(ecuacion);
		
		// Comprobación
		Assert.assertEquals(2, resultado);
		
	}
	
	@Test
	public void obtenerCoeficienteATest3() {
		// Preparación del contexto
		ecuacion = "20x - 1 = 0";

		// invocación del método a testear
		try {
			parseador.obtenerCoeficienteA(ecuacion);
			
			// Comprobación
			Assert.fail("Debería lanzarse la excepción: BadCoefficientException");
		} catch (BadCoefficientException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void obtenerCoeficienteBTest1() {
		// Preparación del contexto
		ecuacion = "2x - 1 = 0";
		int resultado=parseador.obtenerCoeficienteB(ecuacion);
		Assert.assertEquals(1, resultado);	
	}

	@Test
	public void obtenerCoeficienteBTest2() {
		// Preparación del contexto
		ecuacion = "2x + 1 = 0";
		
		// invocación del método a testear
		int resultado=parseador.obtenerCoeficienteB(ecuacion);
		
		// Comprobación
		Assert.assertEquals(1, resultado);	
	}
	
	@Test
	public void obtenerOperadorTest1() {
		// Preparación del context
		ecuacion = "2x + 1 = 0";
		
		// invocación del método a testear
		String resultado = parseador.obtenerOperador(ecuacion);
		
		// Comprobación
		Assert.assertEquals("+", resultado);
	}

	@Test
	public void obtenerOperadorTest2() {
		// Preparación del context
		ecuacion = "10x - 1 = 0";

		// invocación del método a testear						
		String resultado = parseador.obtenerOperador(ecuacion);
		
		// Comprobación
		Assert.assertEquals("-", resultado);
	}
}

