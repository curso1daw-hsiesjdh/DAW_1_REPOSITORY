import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	Calculadora c = new Calculadora();
	
	@Test
	public void sumaTest() {
		int esperado = -13;
		int resultado = c.sumar(-10, -3);
		assertEquals(esperado, resultado);
	}
	@Test
	public void restaTest() {
		int esperado = 0;
		int resultado = c.restar(-10,-10);
		assertEquals(esperado, resultado);
	}
	@Test
	public void multiplicarTest() {
		int esperado = -6;
		int resultado = c.multiplicar(2,-3);
		assertEquals(esperado, resultado);
	}
	@Test
	public void dividirTest() {
		double esperado = 0.2;
		double resultado = c.dividir(2, 10);
		assertEquals(esperado, resultado, 10);
	}
	
}