import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito.when;


public class EvaluarTest {

	@InjectMocks
	public Calculadora expresion = new Calculadora();

	@Mock
	public Parseador parseador = new Parseador();

	@BeforeEach
	public void inicializaMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void computarExpresionTest1() {

		String expresion = "7 + 2";

		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		double resultado = expresion.computarExpresion(expresion);
		Assert.assertEquals(9.0, resultado, 0);
	}
	
	@Test
	public void computarExpresionTest2() {

		String expresion = "7 + -2";

		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("+");
		double resultado = expresion.computarExpresion(expresion);
		Assert.assertEquals(5.0, resultado, 0);
	}
	
	@Test
	public void computarExpresionTest3() {

		String expresion = "7 - 2";

		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("-");
		double resultado = expresion.computarExpresion(expresion);
		Assert.assertEquals(5.0, resultado, 0);
	}
	
	@Test
	public void computarExpresionTest4() {

		String expresion = "7 * 2";

		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("*");
		double resultado = expresion.computarExpresion(expresion);
		Assert.assertEquals(14.0, resultado, 0);
	}
	
	@Test
	public void computarExpresionTest5() {

		String expresion = "7 / 2";

		when(parseador.obtenerPrimerOperando(expresion)).thenReturn(7);
		when(parseador.obtenerSegundoOperando(expresion)).thenReturn(2);
		when(parseador.obtenerOperador(expresion)).thenReturn("/");
		double resultado = expresion.computarExpresion(expresion);
		Assert.assertEquals(1.75, resultado, 0);
	}

}
