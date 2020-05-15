package daw.calculadora.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import static org.mockito.Mockito.when;

import daw.calculadora.Calculadora;
import daw.calculadora.Parseador;
import daw.calculadora.excepticon.BadOperatorException;

public class CalculadoraTest {

	private static Calculadora calculadora;
	
	@BeforeAll
	public static void prepararTest() {
		calculadora = new Calculadora();
	}
	
	//Test SUMAR
	@Test 
	public void sumarTest1() {
		int sumando1 =  2;
		int sumando2 =  3;
		
		int resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(5, resultado);
		
	}
	
	@Test
	public void sumarTest2() {
		int sumando1 =  7;
		int sumando2 =  -3;
		
		int resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(4, resultado);
		
	}
	
	@Test
	public void sumarTest3() {
		int sumando1 =  -30;
		int sumando2 =  50;
		
		int resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(20, resultado);
		
	}
	
	@Test
	public void sumarTest4() {
		int sumando1 =  -7;
		int sumando2 =  -30;
		
		int resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(-37, resultado);
		
	}
	
	
	//Test RESTAR
	@Test 
	public void restarTest1() {
		int minuendo = 2;
		int sustraendo=  3;
		
		int resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(-1, resultado);
		
	}
	
	@Test 
	public void restarTest2() {
		int minuendo = 7;
		int sustraendo=  -3;
		
		int resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(10, resultado);
		
	}
	
	@Test 
	public void restarTest3() {
		int minuendo = -23;
		int sustraendo=  -50;
		
		int resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(27, resultado);
		
	}
	
	//Test MULTIPLICAR
	@Test 
	public void multiplicarTest1() {
		int multiplicando1 = 2;
		int multiplicando2=  3;
		
		int resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(6, resultado);
		
	}
	
	@Test 
	public void multiplicarTest2() {
		int multiplicando1 = -2;
		int multiplicando2=  -3;
		
		int resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(6, resultado);
		
	}
	
	@Test 
	public void multiplicarTest3() {
		int multiplicando1 = 72;
		int multiplicando2=  -9;
		
		int resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(-648, resultado);
		
	}
	
	//Test DIVIDIR
	@Test 
	public void dividirTest1() {
		int dividendo = 9;
		int divisor=  3;
		
		double resultado = calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(3.0, resultado,0.0);
		
	}
	
	@Test 
	public void dividirTest2() {
		int dividendo = 5;
		int divisor=  2;
		
		double resultado = calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(2.5,resultado,0.0);
		
	}
	@Test 
	public void dividirTest3() {
		int dividendo = 15;
		int divisor=  20;
		
		double resultado = calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(0.75,resultado,0.0);
		
	}
	@Test 
	public void dividirTest4() {
		int dividendo = 27;
		int divisor= 2;
		
		double resultado = calculadora.dividir(dividendo, divisor);
		
		Assert.assertEquals(13.5,resultado,0.0);
		
	}
	
	//---------MOKITO-----------//
	
	@InjectMocks
	private Calculadora calc = new Calculadora();
	
	@Mock
	private Parseador parseador = new Parseador();
	
	@BeforeEach
	public void inicializarMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void computarExpresionTest1() throws BadOperatorException {
		String expresion = "7 + 2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		double resultado = calc.computarExpresion(expresion);
		
		Assert.assertEquals(9.0,resultado,0.0);
	}
	
	@Test
	public void computarExpresionTest2() throws BadOperatorException {
		String expresion = "7 + -2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		double resultado = calc.computarExpresion(expresion);
		
		Assert.assertEquals(5.0,resultado,0.0);
	}
	
	@Test
	public void computarExpresionTest3() throws BadOperatorException {
		String expresion = "7 - -2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(parseador.obtenerOperador(expresion)).thenReturn("-");
		
		double resultado = calc.computarExpresion(expresion);
		
		Assert.assertEquals(9.0,resultado,0.0);
	}
	
	@Test
	public void computarExpresionTest4() throws BadOperatorException {
		String expresion = "-7 * 2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(-7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("*");
		
		double resultado = calc.computarExpresion(expresion);
		
		Assert.assertEquals(-14,resultado,0.0);
	}
	
	@Test
	public void computarExpresionTest5() throws BadOperatorException {
		String expresion = "6 / 4";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(6);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(4);
		when(parseador.obtenerOperador(expresion)).thenReturn("/");
		
		double resultado = calc.computarExpresion(expresion);
		
		Assert.assertEquals(1.5,resultado,0.0);
	}
	
}
