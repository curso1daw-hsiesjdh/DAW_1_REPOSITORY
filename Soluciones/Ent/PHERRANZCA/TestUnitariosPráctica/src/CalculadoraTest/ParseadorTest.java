package CalculadoraTest;

import Calculadora.*;
import Calculadora.Exceptions.BadOperatorException;

import org.junit.Assert;
import org.junit.jupiter.api.*;

class ParseadorTest {
	
	private static Parseador parseador;
	private static String  operacion;
	
	@BeforeAll
	public static void prepareTestCase() {
		parseador = new Parseador();		
	}
	
	@Test
	public void ObtenerPrimerOperandoTest1() throws BadOperatorException {
		
		//Contexto
		operacion = "28 + 14";

		//Método a testear y comprobación
		int resultado = parseador.ObtenerPrimerOperando(operacion);
	
		Assert.assertEquals(28, resultado);
		
	}
	
	@Test
	public void ObtenerPrimerOperandoTest2() throws BadOperatorException {
		
		//Contexto
		operacion = "-28 - 14";
		
		// Ejecuci�n del m�todo a testear
		int resultado = parseador.ObtenerPrimerOperando(operacion);
		
		// Comprobaci�n
		Assert.assertEquals(-28, resultado);
		
	}
	
	@Test
	public void ObtenerPrimerOperandoTest3() {
		
		//Contexto
		operacion = "+---+98 - (-15)";

		//Método a testear y comprobación
		try {
			parseador.ObtenerPrimerOperando(operacion);
			
			// Comprobaci�n
			Assert.fail("Debería lanzarse la excepción: BadOperatorException");
		} catch (BadOperatorException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void ObtenerSegundoOperandoTest1() throws BadOperatorException {
		//Contexto
		operacion = "28 + 59";
		
		int resultado = parseador.ObtenerSegundoOperando(operacion);
		
		Assert.assertEquals(59, resultado);	
	
	}

	@Test
	public void ObtenerSegundoOperandoTest2() throws BadOperatorException {
		//Contexto
		operacion = "-28 - (-2)";
		
		//Método a testear y comprobación
		int resultado = parseador.ObtenerSegundoOperando(operacion);
		
		// Comprobaci�n
		Assert.assertEquals(-2, resultado);	
	}
	
	@Test
	public void obtenerOperadorTest1() throws BadOperatorException {
		//Contexto
		operacion = "-3 + (-45)";
		
		//Método a testear y comprobación
		String resultado = parseador.ObtenerOperador(operacion);

		Assert.assertEquals("+", resultado);
	}

	@Test
	public void obtenerOperadorTest2() throws BadOperatorException {
		//Contexto
		operacion = "-15 - 97";

		//Método a testear y comprobación						
		String resultado = parseador.ObtenerOperador(operacion);

		Assert.assertEquals("-", resultado);
	}
}