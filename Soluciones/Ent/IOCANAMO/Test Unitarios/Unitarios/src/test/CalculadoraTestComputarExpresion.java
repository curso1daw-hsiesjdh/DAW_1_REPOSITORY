package test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Principal.Calculadora;
import Principal.Parseador;

public class CalculadoraTestComputarExpresion {
   
	@InjectMocks
	public Calculadora c1 = new Calculadora();
	
	@Mock
	public Parseador parseador;
	
	@BeforeEach
	public void inicilizaMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void computarExpresionCase1() {
		String expresion ="7 + 2 = 9";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		Double solucion = c1.computarExpresion(expresion);
		
		Assert.assertEquals(9.0, solucion,0);
	}
	
	@Test
	public void computarExpresionCase2() {
		String expresion ="7 + -2 = 9";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		
		Double solucion = c1.computarExpresion(expresion);
		
		Assert.assertEquals(5.0, solucion,0);
	}
	
	@Test
	public void computarExpresionCase3() {
		String expresion ="7 / 0 = 0";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(0);
		when(parseador.obtenerOperador(expresion)).thenReturn("/");
		try {
		Double solucion = c1.computarExpresion(expresion);
		Assert.fail("Exception");
		}finally {
			
		}

	}
	
	@Test
	public void computarExpresionCase4() {
		String expresion ="12 * -7 = -84";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(12);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(-7);
		when(parseador.obtenerOperador(expresion)).thenReturn("*");
		
		Double solucion = c1.computarExpresion(expresion);
		
		Assert.assertEquals(-84.0, solucion,0);
	}
	
	@Test
	public void computarExpresionCase5() {
		String expresion ="-9 - 12 = -21";
		
		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(-9);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(12);
		when(parseador.obtenerOperador(expresion)).thenReturn("-");
		
		Double solucion = c1.computarExpresion(expresion);
		
		Assert.assertEquals(-21.0, solucion,0);
	}
}
