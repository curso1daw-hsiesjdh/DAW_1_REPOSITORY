package test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Assert;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import Programa.Calculadora;
import Programa.Parseador;
public class computarExpresionTest {
	
	
	
	@InjectMocks
	public Calculadora c1 = new Calculadora();
	@Mock
	public Parseador p1;
	@BeforeEach
    public void inicilizaMocks() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void computarExpresionTest1 () {
		
		String expresion="7+2";
		
		when(p1.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(p1.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(p1.obtenerOperador(expresion)).thenReturn("+");
		Double resultado=c1.computarExpresion(expresion);
		
		Assert.assertEquals(9.0, resultado,0);	
	}
	
	@Test
	public void computarExpresionTest2 () {
		
		String expresion="7+-2";
		
		when(p1.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(p1.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(p1.obtenerOperador(expresion)).thenReturn("+");
		Double resultado=c1.computarExpresion(expresion);
		
		Assert.assertEquals(5.0, resultado,0);	
	}

	@Test
	public void computarExpresionTest3 () {
		
		String expresion="7 --2";
		
		when(p1.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(p1.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(p1.obtenerOperador(expresion)).thenReturn("-");
		Double resultado=c1.computarExpresion(expresion);
		
		Assert.assertEquals(9.0, resultado,0);	
	}

	@Test
	public void computarExpresionTest4 () {
		
		String expresion="-7+-2";
		
		when(p1.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(p1.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(p1.obtenerOperador(expresion)).thenReturn("+");
		Double resultado=c1.computarExpresion(expresion);
		
		Assert.assertEquals(-9.0, resultado,0);	
	}

	@Test
	public void computarExpresionTest5 () {
		
		String expresion="-7--2";
		
		when(p1.obtenerPrimerOperando(expresion)).thenReturn(-7);
		when(p1.obtenerSegundoOperando(expresion)).thenReturn(-2);
		when(p1.obtenerOperador(expresion)).thenReturn("-");
		Double resultado=c1.computarExpresion(expresion);
		
		Assert.assertEquals(-5.0, resultado,0);	
	}



}
