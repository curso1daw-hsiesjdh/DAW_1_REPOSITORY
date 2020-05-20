import static org.junit.Assert.*;

import org.junit.Test;

public class RealizarTests {
	
	Calculadora calcular = new Calculadora();
	
//Sumas
	
	@Test
	public void sumaTest1() {
	int valorEsperado = 5;
	int resultado = calcular.sumar(2, 3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void sumaTest2() {
	int valorEsperado = 4;
	int resultado = calcular.sumar(7, -3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void sumaTest3() {
	int valorEsperado = 7;
	int resultado = calcular.sumar(-1, 8);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void sumaTest4() {
	int valorEsperado = -6;
	int resultado = calcular.sumar(-4, -2);
	assertEquals(valorEsperado,resultado);
	}
	
	
//Restas	
	@Test
	public void restaTest1() {
	int valorEsperado = -1;
	int resultado = calcular.restar(2, 3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void restaTest2() {
	int valorEsperado = 10;
	int resultado = calcular.restar(7, -3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void restaTest3() {
	int valorEsperado = -9;
	int resultado = calcular.restar(-4, 5);
	assertEquals(valorEsperado,resultado);
	}
	
	
//Multilicaciones
	@Test
	public void multiplicarTest1() {
	int valorEsperado = 6;
	int resultado = calcular.multiplicar(2, 3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void multiplicarTest2() {
	int valorEsperado = 6;
	int resultado = calcular.multiplicar(-2, -3);
	assertEquals(valorEsperado,resultado);
	}
	
	@Test
	public void multiplicarTest3() {
	int valorEsperado = -6;
	int resultado = calcular.multiplicar(-2, 3);
	assertEquals(valorEsperado,resultado);
	}
	
	
//Divisiones
	@Test
	public void dividirTest1() {
	double valorEsperado = 3.0;
	double resultado = calcular.dividir(9, 3);
	assertEquals(valorEsperado,resultado, 8);
	}
	
	@Test
	public void dividirTest2() {
	double valorEsperado = 2.5;
	double resultado = calcular.dividir(5, 2);
	assertEquals(valorEsperado,resultado, 8);
	}
	
	@Test
	public void dividirTest3() {
	double valorEsperado = 4.0;
	double resultado = calcular.dividir(8, 2);
	assertEquals(valorEsperado,resultado, 8);
	}
	
	@Test
	public void dividirTest4() {
	double valorEsperado = 1.75;
	double resultado = calcular.dividir(-7, -4);
	assertEquals(valorEsperado,resultado, 8);
	}
}
