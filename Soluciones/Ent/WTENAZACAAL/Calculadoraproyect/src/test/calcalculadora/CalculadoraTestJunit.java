package test.calcalculadora;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.*;
import static org.mockito.Mockito.when;

import princi.palcalculadora.BadOperatorException;
import princi.palcalculadora.Calculadora;
import princi.palcalculadora.Parseador;

public class CalculadoraTestJunit {

	private static Calculadora calculadora = new Calculadora();

	
	@InjectMocks
	private Calculadora calculadora2 = new Calculadora();
	
	@Mock
	private Parseador parseador = new Parseador();
	
	@BeforeEach
	public void inicializarMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	//SUMAR TEST
	@Test 
	public void sumarCase1() {
		Integer sumando1 =  2;
		Integer sumando2 =  3;
		
		Integer resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(5, resultado, 0);
		
	}
	
	@Test
	public void sumarCase2() {
		Integer sumando1 =  7;
		Integer sumando2 =  -3;
		
		Integer resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(4, resultado, 0);
		
	}
	
	@Test
	public void sumarCase3() {
		Integer sumando1 =  -8;
		Integer sumando2 =  29;
		
		Integer resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(21, resultado, 0);
		
	}
	
	@Test
	public void sumarCase4() {
		Integer sumando1 =  29;
		Integer sumando2 =  5;
		
		Integer resultado = calculadora.sumar(sumando1, sumando2);
		
		Assert.assertEquals(34, resultado, 0);
		
	}
	
	
	//REASTAR TEST
	@Test 
	public void restarCase1() {
		Integer minuendo = 2;
		Integer sustraendo=  3;
		
		Integer resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(-1, resultado, 0);
		
	}
	
	@Test
	public void restarCase2() {
		Integer minuendo = 7;
		Integer sustraendo=  -3;
		
		Integer resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(10, resultado, 0);
		
	}
	
	@Test 
	public void restarCase3() {
		Integer minuendo = -19;
		Integer sustraendo=  -4;
		
		Integer resultado = calculadora.restar(minuendo, sustraendo);
		
		Assert.assertEquals(-15, resultado, 0);
		
	}
	
	//MULTIPLICAR TEST
	@Test 
	public void multiplicarCase1() {
		Integer multiplicando1 = 2;
		Integer multiplicando2=  3;
		
		Integer resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(6, resultado, 0);
	}
	
	@Test 
	public void multiplicarTest2() {
		Integer multiplicando1 = -2;
		Integer multiplicando2=  -3;
		
		Integer resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(6, resultado, 0);
		
	}
	
	@Test 
	public void multiplicarCase3() {
		Integer multiplicando1 = 258;
		Integer multiplicando2=  -2;
		
		Integer resultado = calculadora.multiplicar(multiplicando1, multiplicando2);
		
		
		Assert.assertEquals(-516, resultado, 0);
	}
	
	//DIVIDIR TEST
	@Test 
	public void dividirCase1() {
		
		Integer  dividendo = 9;
		Integer divisor=  3;
		
		try {
			
			Double resultado = calculadora.dividir(dividendo, divisor);
			Assert.assertEquals(3.0, resultado,0.0);
			
		} catch (BadOperatorException e) {
		
			e.printStackTrace();
		}

	}
	
	@Test 
	public void dividirCase2() {
		
		Integer dividendo = 5;
		Integer divisor=  2;
		
		try {
			
			Double resultado = calculadora.dividir(dividendo, divisor);
			Assert.assertEquals(2.0,resultado,0.0);
			
		} catch (BadOperatorException e) {
			
			e.printStackTrace();
		}		
	}
	
	@Test 
	public void dividirCase3() {
		Integer dividendo = 2020;
		Integer divisor=  0;
		
		try {
			
			Double resultado = calculadora.dividir(dividendo, divisor);
			Assert.fail("Exception msg");
			
		} catch (BadOperatorException e) {

			e.printStackTrace();
		}		
	}
	
	@Test 
	public void dividirCase4() {
		
		Integer dividendo = 2020;
		Integer divisor= -35;

		try {
			
			Double resultado = calculadora.dividir(dividendo, divisor);
			Assert.assertEquals(-57,resultado,0.0);

		} catch (BadOperatorException e) {
			
			e.printStackTrace();
		}
	}
	
	
	//COMPUTAR EXPRESIONTEST
	@Test
	public void computarExpresionCase1() throws BadOperatorException {
		String expresion = "7 + 2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		Double resultado = calculadora2.computarExpresion(expresion);
		
		Assert.assertEquals(9.0,resultado,0.0);
	}
	
	@Test
	public void computarExpresionCase2() throws BadOperatorException {
		String expresion = "7 + -2";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		Double resultado = calculadora2.computarExpresion(expresion);
		
		Assert.assertEquals(5.0,resultado,0.0);
	}
	
	@Test
	public void computarExpresionCase3() throws BadOperatorException {
		String expresion = "7 + 25";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(25);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
			
		Double resultado = calculadora2.computarExpresion(expresion);
		Assert.assertEquals(32,resultado,0.0);
	}
	
	@Test
	public void computarExpresionCase4() throws BadOperatorException {
		String expresion = "25 * 12";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(25);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(12);
		when(parseador.obtenerOperador(expresion)).thenReturn("*");
		
		Double resultado = calculadora2.computarExpresion(expresion);
		Assert.assertEquals(300,resultado,0);
		System.out.println("this is sparta " + resultado);
	}
	
	@Test
	public void computarExpresionCase5() throws BadOperatorException {
		String expresion = "-56 - 89";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(-56);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(89);
		when(parseador.obtenerOperador(expresion)).thenReturn("-");
		
		Double resultado = calculadora2.computarExpresion(expresion);
		Assert.assertEquals(-145,resultado,0.0);
	}
	
}
