import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculadora {

	public int sumar (int sumando1, int sumando2) {
		int valorEsperado = 0;
		int valorConseguido = sumando1 + sumando2;
		return sumando1 + sumando2;
	}
	
	@Test
	public void sumarTest () {
		int valorEsperado = 4;
		int valorConseguido = sumar(2, 2);
		
		assertEquals(valorEsperado, valorConseguido);
	}
	
	public int multiplicar (int multiplicando1, int multiplicando2) {
		return multiplicando1 * multiplicando2;
	}
	
	@Test
	public void multiplicarTest () {
		int valorEsperado = -6;
		int valorConseguido = multiplicar(2, -3);
		
		assertEquals(valorEsperado, valorConseguido);
	}
	
	public int restar (int minuendo, int sustraendo) {
		return minuendo - sustraendo;
	}
	
	@Test
	public void restarTest () {
		int valorEsperado = 1;
		int valorConseguido = restar(-2, -3);
		
		assertEquals(valorEsperado, valorConseguido);
	}
	
	public double dividir (int dividendo, int divisor) {
		return dividendo / divisor;
	}
	
	@Test
	public void dividirTest () {
		double valorEsperado = -3.0;
		double valorConseguido = dividir(-9, 3);
		
		assertEquals(valorEsperado, valorConseguido, 10);
	}
	
	public double computarExpresion (String expresion) throws BadOperatorException {
		Parseador p = new Parseador();
		String operador = p.obtenerOperador(expresion);
		int operandoA = p.obtenerPrimerOperando(expresion);
		int operandoB = p.obtenerSegundoOperando(expresion);
		
		switch (operador) {
		case "+":
			System.out.println("La operacion es de suma");
			return sumar(operandoA, operandoB);
			
		case "*":
			System.out.println("La operacion es de multiplicacion");
			return multiplicar(operandoA, operandoB);
			
		case "-":
			System.out.println("La operacion es de resta");
			return restar(operandoA, operandoB);
			
		case "/":
			System.out.println("La operacion es de division");
			return dividir(operandoA, operandoB);
			
		default:
			throw new BadOperatorException("El operador es incorrecto");
		}
	}
}
