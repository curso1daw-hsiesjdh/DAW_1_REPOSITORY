package Calculadora;

import Calculadora.Exceptions.*;

public class Calculadora{

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
		return dividendo / divisor;
	}
	
	private Parseador parseador = new Parseador();
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
		return resultado;
	}
}
