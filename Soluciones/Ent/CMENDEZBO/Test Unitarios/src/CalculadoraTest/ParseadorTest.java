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
		operacion = "28 + 14";
		int resultado = parseador.ObtenerPrimerOperando(operacion);
		Assert.assertEquals(28, resultado);
	}	
	@Test
	public void ObtenerPrimerOperandoTest2() throws BadOperatorException {
		operacion = "-28 - 14";
		int resultado = parseador.ObtenerPrimerOperando(operacion);
		Assert.assertEquals(-28, resultado);
	}
	@Test
	public void ObtenerPrimerOperandoTest3() throws BadOperatorException {
		operacion = "9 * -14";
		int resultado = parseador.ObtenerPrimerOperando(operacion);
		Assert.assertEquals(9, resultado);
	}	
	@Test
	public void ObtenerSegundoOperandoTest1() throws BadOperatorException {
		operacion = "28 + 59";
		int resultado = parseador.ObtenerSegundoOperando(operacion);
		Assert.assertEquals(59, resultado);	
	}

	@Test
	public void ObtenerSegundoOperandoTest2() throws BadOperatorException {
		operacion = "-28 - -2";
		int resultado = parseador.ObtenerSegundoOperando(operacion);
		Assert.assertEquals(-2, resultado);	
	}
	@Test
	public void ObtenerSegundoOperandoTest3() throws BadOperatorException {
		operacion = "99 * 16";
		int resultado = parseador.ObtenerSegundoOperando(operacion);
		Assert.assertEquals(16, resultado);	
	}
	@Test
	public void obtenerOperadorTest1() throws BadOperatorException {
		operacion = "-3 + -45";
		String resultado = parseador.ObtenerOperador(operacion);
		Assert.assertEquals("+", resultado);		
	}
	@Test
	public void obtenerOperadorTest2() throws BadOperatorException {	
		operacion = "-15 - 97";					
		String resultado = parseador.ObtenerOperador(operacion);
		Assert.assertEquals("-", resultado);	
	}
	@Test
	public void obtenerOperadorTest3() throws BadOperatorException {
		operacion = "-3 / 2";
		String resultado = parseador.ObtenerOperador(operacion);
		Assert.assertEquals("/", resultado);
	}
}
