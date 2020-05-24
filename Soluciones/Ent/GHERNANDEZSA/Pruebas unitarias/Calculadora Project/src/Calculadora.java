import static org.junit.Assert.*;

import javax.management.BadStringOperationException;

import org.junit.Test;

public class Calculadora {
	@Test
	public void Test () throws BadOperatorException {
		double valorEsperado = 5.0;
		double valorObtenido = computarExpresion("7 + -2");
		assertEquals(valorEsperado,valorObtenido,10);
	}
	public int sumar (int sumando1,int sumando2) {
		return sumando1 + sumando2;
	}
	
	public int multiplicar (int multiplicando1, int multiplicando2){
		return multiplicando1 * multiplicando2;
	}
	
	public int resta(int minuendo, int sustraendo){
		return minuendo - sustraendo;
	}
	
	public double dividiendo (int dividiendo, int divisor){
		return dividiendo / divisor;
	}
	
	public double computarExpresion(String expresion) throws BadOperatorException {
		Parseador p1 = new Parseador();
		int operador1 = p1.obtenerPrimerOperando(expresion);
		int operador2 = p1.obtenerSegundoOperando(expresion);
		String operadorExpresion = p1.obtenerOperador(expresion);
		if (operadorExpresion == "+") {
			return sumar(operador1, operador2);
		}else if (operadorExpresion == "-") {
			return resta(operador1, operador2);
		}else if (operadorExpresion == "/") {
			return dividiendo(operador1, operador2);
		}else if (operadorExpresion == "*") {
			return multiplicar(operador1, operador2);
		}else {
			throw new BadOperatorException("Error");
		}
		
	}
}
