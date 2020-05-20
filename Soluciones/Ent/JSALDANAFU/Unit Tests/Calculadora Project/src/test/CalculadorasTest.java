package test;
import badOperatorException.BadOperatorException;
import calculadora.Calculadora;
import junit.framework.Assert;
import parseador.Parseador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CalculadorasTest {
	
	
	private static Calculadora calc;
	
	
	@BeforeAll 
	public static void inicioTest() {
		calc = new Calculadora() ;
		System.out.println("Test iniciado.");
		System.out.println("------");
	}
	
	@AfterAll
	public static void finalTest() {
		System.out.println("Test finalizado.");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("After");
		System.out.println("------");
	}
	
//Mocks
	
	@InjectMocks 
	private Calculadora calcInject= new Calculadora();
	
	@Mock 
	private Parseador parseador = org.mockito.Mockito.mock(Parseador.class);
	
//SUMAR
	@Test
	public void suma() {
		
//		CASO 1
		assertEquals(5,calc.sumar(2,3));
		
//		CASO 2
		assertEquals(4,calc.sumar(7,-3));
		
//		CASO 3
		assertEquals(-11,calc.sumar(-8,-3));
		
//		CASO 4
		assertEquals(-3,calc.sumar(-5,2));
		
	}
	
//RESTAR
	@Test
	public void restar() {
//		CASO 1
		assertEquals(-1,calc.restar(2, 3));
		
//		CASO 2
		assertEquals(10,calc.restar(7,-3));
		
//		CASO 3
		assertEquals(-4,calc.restar(-5, -1));
	}
	
//MULTIPLICAR
	@Test
	public void multiplicar() {
//		CASO 1
		assertEquals(6,calc.multiplicar(2,3));
		
//		CASO 2
		assertEquals(6,calc.multiplicar(-2,-3));
		
//		CASO 3
		assertEquals(-36,calc.multiplicar(9, -4));
	}
	
//DIVIDIR
	@Test
	public void dividir() throws BadOperatorException{
//		CASO 1
		assertEquals(3.0,calc.dividir(9, 3));
		
//		CASO 2
		assertEquals(2.5,calc.dividir(5, 2));
		
//		CASO 3
		assertEquals(-0.25,calc.dividir(-2, 8));
		
//		CASO 4
		assertEquals(-2.0,calc.dividir(4, -2));
	}
	
//COMPUTAR EXPRESION
	@Test
	public void computarExpresion() throws BadOperatorException{
//		CASO 1
		when(parseador.obtenerPrimerOperando("7 + 2")).thenReturn(7);
		when(parseador.obtenerSegundoOperando("7 + 2")).thenReturn(2);
		when(parseador.obtenerOperador("7 + 2")).thenReturn("+");
		
		assertEquals(9.0,calcInject.computarExpresion("7 + 2"));
		
//		CASO 2
		when(parseador.obtenerPrimerOperando("7 + -2")).thenReturn(7);
		when(parseador.obtenerSegundoOperando("7 + -2")).thenReturn(-2);
		when(parseador.obtenerOperador("7 + -2")).thenReturn("+");
		
		assertEquals(5.0,calcInject.computarExpresion("7 + -2"));
		
//		CASO 3
		when(parseador.obtenerPrimerOperando("-7 / -2")).thenReturn(-7);
		when(parseador.obtenerSegundoOperando("-7 / -2")).thenReturn(-2);
		when(parseador.obtenerOperador("-7 / -2")).thenReturn("/");
		
		assertEquals(3.5,calcInject.computarExpresion("-7 / -2"));
		
//		CASO 4
		when(parseador.obtenerPrimerOperando("-8 - 4")).thenReturn(-8);
		when(parseador.obtenerSegundoOperando("-8 - 4")).thenReturn(-4);
		when(parseador.obtenerOperador("-8 - 4")).thenReturn("4");
		
		assertEquals(-12.0,calcInject.computarExpresion("-8 - 4"));
		
//		CASO 5
		when(parseador.obtenerPrimerOperando("4 * -7")).thenReturn(4);
		when(parseador.obtenerSegundoOperando("4 * -7")).thenReturn(-7);
		when(parseador.obtenerOperador("4 * -7")).thenReturn("*");
		
		assertEquals(-28.0,calcInject.computarExpresion("4 * -7"));
	}
	
}
