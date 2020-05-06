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
		// Preparaci�n del contexto
		ecuacion = "2x + 1 = 0";
		
		// Ejecuci�n del m�todo a testear
		int resultado = parseador.obtenerCoeficienteA(ecuacion);
		
		// Comprobaci�n
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void obtenerCoeficienteATest2() throws BadCoefficientException {
		// Preparaci�n del contexto
		ecuacion = "2x - 1 = 0";
		
		// Ejecuci�n del m�todo a testear
		int resultado = parseador.obtenerCoeficienteA(ecuacion);
		
		// Comprobaci�n
		Assert.assertEquals(2, resultado);
		
	}
	
	@Test
	public void obtenerCoeficienteATest3() {
		// Preparaci�n del contexto
		ecuacion = "20x - 1 = 0";

		// invocaci�n del m�todo a testear
		try {
			parseador.obtenerCoeficienteA(ecuacion);
			
			// Comprobaci�n
			Assert.fail("Deber�a lanzarse la excepci�n: BadCoefficientException");
		} catch (BadCoefficientException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void obtenerCoeficienteBTest1() {
		// Preparaci�n del contexto
		ecuacion = "2x - 1 = 0";
		int resultado=parseador.obtenerCoeficienteB(ecuacion);
		Assert.assertEquals(1, resultado);	
	}

	@Test
	public void obtenerCoeficienteBTest2() {
		// Preparaci�n del contexto
		ecuacion = "2x + 1 = 0";
		
		// invocaci�n del m�todo a testear
		int resultado=parseador.obtenerCoeficienteB(ecuacion);
		
		// Comprobaci�n
		Assert.assertEquals(1, resultado);	
	}
	
	@Test
	public void obtenerOperadorTest1() {
		// Preparaci�n del context
		ecuacion = "2x + 1 = 0";
		
		// invocaci�n del m�todo a testear
		String resultado = parseador.obtenerOperador(ecuacion);
		
		// Comprobaci�n
		Assert.assertEquals("+", resultado);
	}

	@Test
	public void obtenerOperadorTest2() {
		// Preparaci�n del context
		ecuacion = "10x - 1 = 0";

		// invocaci�n del m�todo a testear						
		String resultado = parseador.obtenerOperador(ecuacion);
		
		// Comprobaci�n
		Assert.assertEquals("-", resultado);
	}
}

