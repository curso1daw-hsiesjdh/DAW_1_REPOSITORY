package calculadoraProject.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import calculadoraProject.BadOperatorException;
import calculadoraProject.Calculadora;
import calculadoraProject.Parseador;

public class CalculadoraTest {
	
	@InjectMocks
	private Calculadora calculadora = new Calculadora();

	@Mock
	private Parseador parseador;

	@BeforeEach
	public void inicilizaMocks() {
		System.out.println("Inyectando Mocks ....");
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void resultadoTest1() throws BadOperatorException {
		
		String problema = "2+3";
		
		when(parseador.primerOperando(problema)).thenReturn(2);
		when(parseador.segundoOperando(problema)).thenReturn(3);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(5,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest2() throws BadOperatorException {
		
		String problema = "7+-3";
		
		when(parseador.primerOperando(problema)).thenReturn(7);
		when(parseador.segundoOperando(problema)).thenReturn(-3);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(4,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest3() throws BadOperatorException {
		
		String problema = "-4+3";
		
		when(parseador.primerOperando(problema)).thenReturn(-4);
		when(parseador.segundoOperando(problema)).thenReturn(3);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-1,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest4() throws BadOperatorException {
		
		String problema = "-12+-7";
		
		when(parseador.primerOperando(problema)).thenReturn(-12);
		when(parseador.segundoOperando(problema)).thenReturn(-7);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-19,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest5() throws BadOperatorException {
		
		String problema = "2-3";
		
		when(parseador.primerOperando(problema)).thenReturn(2);
		when(parseador.segundoOperando(problema)).thenReturn(3);
		when(parseador.obtenerOperador(problema)).thenReturn("-");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-1,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest6() throws BadOperatorException {
		
		String problema = "7--3";
		
		when(parseador.primerOperando(problema)).thenReturn(7);
		when(parseador.segundoOperando(problema)).thenReturn(-3);
		when(parseador.obtenerOperador(problema)).thenReturn("-");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(10,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest7() throws BadOperatorException {
		
		String problema = "-8--5";
		
		when(parseador.primerOperando(problema)).thenReturn(-8);
		when(parseador.segundoOperando(problema)).thenReturn(-5);
		when(parseador.obtenerOperador(problema)).thenReturn("-");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-3,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest8() throws BadOperatorException {
		
		String problema = "2*3";
		
		when(parseador.primerOperando(problema)).thenReturn(2);
		when(parseador.segundoOperando(problema)).thenReturn(3);
		when(parseador.obtenerOperador(problema)).thenReturn("*");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(6,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest9() throws BadOperatorException {
		
		String problema = "-2*-3";
		
		when(parseador.primerOperando(problema)).thenReturn(-2);
		when(parseador.segundoOperando(problema)).thenReturn(-3);
		when(parseador.obtenerOperador(problema)).thenReturn("*");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(6,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest10() throws BadOperatorException {
		
		String problema = "7*-8";
		
		when(parseador.primerOperando(problema)).thenReturn(7);
		when(parseador.segundoOperando(problema)).thenReturn(-8);
		when(parseador.obtenerOperador(problema)).thenReturn("*");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-56,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest11() throws BadOperatorException {
		
		String problema = "9/3";
		
		when(parseador.primerOperando(problema)).thenReturn(9);
		when(parseador.segundoOperando(problema)).thenReturn(3);
		when(parseador.obtenerOperador(problema)).thenReturn("/");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(3,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest12() throws BadOperatorException {
		
		String problema = "5/2";
		
		when(parseador.primerOperando(problema)).thenReturn(5);
		when(parseador.segundoOperando(problema)).thenReturn(2);
		when(parseador.obtenerOperador(problema)).thenReturn("/");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(2,resultado,0.5);
		
	}
	
	@Test
	public void resultadoTest13() throws BadOperatorException {
		
		String problema = "-12/-4";
		
		when(parseador.primerOperando(problema)).thenReturn(-12);
		when(parseador.segundoOperando(problema)).thenReturn(-4);
		when(parseador.obtenerOperador(problema)).thenReturn("/");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(3,resultado,0.0);
		
	}
	@Test
	public void resultadoTest14() throws BadOperatorException {
		
		String problema = "40/-5";
		
		when(parseador.primerOperando(problema)).thenReturn(40);
		when(parseador.segundoOperando(problema)).thenReturn(-5);
		when(parseador.obtenerOperador(problema)).thenReturn("/");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-8,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest15() throws BadOperatorException {
		
		String problema = "7+2";
		
		when(parseador.primerOperando(problema)).thenReturn(7);
		when(parseador.segundoOperando(problema)).thenReturn(2);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(9,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest16() throws BadOperatorException {
		
		String problema = "7+-2";
		
		when(parseador.primerOperando(problema)).thenReturn(7);
		when(parseador.segundoOperando(problema)).thenReturn(-2);
		when(parseador.obtenerOperador(problema)).thenReturn("+");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(5,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest17() throws BadOperatorException {
		
		String problema = "4*-9";
		
		when(parseador.primerOperando(problema)).thenReturn(4);
		when(parseador.segundoOperando(problema)).thenReturn(-9);
		when(parseador.obtenerOperador(problema)).thenReturn("*");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-36,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest18() throws BadOperatorException {
		
		String problema = "-8/2";
		
		when(parseador.primerOperando(problema)).thenReturn(-8);
		when(parseador.segundoOperando(problema)).thenReturn(2);
		when(parseador.obtenerOperador(problema)).thenReturn("/");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(-4,resultado,0.0);
		
	}
	
	@Test
	public void resultadoTest19() throws BadOperatorException {
		
		String problema = "-12--14";
		
		when(parseador.primerOperando(problema)).thenReturn(-12);
		when(parseador.segundoOperando(problema)).thenReturn(-14);
		when(parseador.obtenerOperador(problema)).thenReturn("-");
		
		double resultado = calculadora.computarExpresion(problema);
		
		Assert.assertEquals(2,resultado,0.0);
		
	}
	
	
	
	
	
	
	
}
