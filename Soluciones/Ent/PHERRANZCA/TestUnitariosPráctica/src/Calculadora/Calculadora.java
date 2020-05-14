package Calculadora;

import Calculadora.Exceptions.*;

public class Calculadora{

	private Parseador parseador = new Parseador();
	
	public int Sumar(int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}
	
	public int Multiplicar(int multiplicando1, int multiplicando2) {
		return multiplicando1 * multiplicando2;
	}
	
	public int Restar(int minuendo, int sustraendo) {
		return minuendo - sustraendo;
	}
	
	public double Dividir(int dividendo, int divisor) {
		double div1 = (double)dividendo;
		double div2 = (double)divisor;
		return div1 / div2;
	}
	
	public double ComputarExpresion(String expresion) throws BadOperatorException{
		
		String operador = parseador.ObtenerOperador(expresion);
		double resultado = 0;
		
		if(operador.equals("+")) {
			resultado = Sumar(parseador.ObtenerPrimerOperando(expresion), parseador.ObtenerSegundoOperando(expresion));
			return resultado;
		}
		
		if(operador.equals("*")) {
			resultado = Multiplicar(parseador.ObtenerPrimerOperando(expresion), parseador.ObtenerSegundoOperando(expresion));
			return resultado;
		}

		if(operador.equals("-")) {
			resultado = Restar(parseador.ObtenerPrimerOperando(expresion), parseador.ObtenerSegundoOperando(expresion));
			return resultado;
		}
		
		if(operador.equals("/")) {
			resultado = Dividir(parseador.ObtenerPrimerOperando(expresion), parseador.ObtenerSegundoOperando(expresion));
			return resultado;
		}
		
		else {
			throw new BadOperatorException("Hay algo que no cuadra. Vuelve a comprobar la operación.");
		}
		
	}
	
}
