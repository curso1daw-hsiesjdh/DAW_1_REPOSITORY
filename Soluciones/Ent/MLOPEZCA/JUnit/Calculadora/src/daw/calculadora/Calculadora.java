package daw.calculadora;

import daw.calculadora.excepticon.BadOperatorException;

public class Calculadora {
	
	Parseador parse = new Parseador();

	public int sumar(int sumando1, int sumando2) {
		return sumando1+sumando2;
	}
	public int multiplicar(int multiplicando1, int multiplicando2) {
		return multiplicando1*multiplicando2;
	}
	public int restar(int minuendo, int sustraendo) {
		return minuendo-sustraendo;
	}
	public double dividir(int dividendo, int divisor) {
		return (float) dividendo/divisor;
	}
	public double computarExpresion(String expresion) throws BadOperatorException{
		int operando1= parse.obtenerPrimerOperando(expresion);
		int operando2= parse.obtenerSegundoOperando(expresion);
		String operador = parse.obtenerOperador(expresion);
		double resultado= 0.0;
		switch(operador) {
		case "+":
			resultado= sumar(operando1,operando2);
			break;
		case "-":
			resultado= restar(operando1,operando2);
			break;
		case "*":
			resultado= multiplicar(operando1,operando2);
			break;
		case "/":
			resultado= dividir(operando1,operando2);
			break;
		default:
			throw new BadOperatorException("El operador es incorrecto");
		}
		return resultado;
	}
}
